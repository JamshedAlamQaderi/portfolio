package com.jamshedalamqaderi.portfolio

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.CanvasBasedWindow
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.scale
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.router.stack.webhistory.DefaultWebHistoryController
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import com.arkivanov.essenty.lifecycle.resume
import com.arkivanov.essenty.lifecycle.stop
import com.jamshedalamqaderi.portfolio.domain.services.navigation.DeepLink
import com.jamshedalamqaderi.portfolio.domain.services.navigation.NavigationManagerService
import com.jamshedalamqaderi.portfolio.domain.services.navigation.NavigationManagerServiceImpl
import com.jamshedalamqaderi.portfolio.domain.services.navigation.NavigationService
import com.jamshedalamqaderi.portfolio.domain.setup.KoinModule
import com.jamshedalamqaderi.portfolio.domain.setup.Routes
import com.jamshedalamqaderi.portfolio.presentation.PortfolioScaffold
import com.jamshedalamqaderi.portfolio.presentation.common.components.Center
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.skiko.wasm.onWasmReady
import org.koin.compose.KoinApplication
import org.koin.dsl.module

object ScreenConstraints {
    val size = mutableStateOf(DpSize(0.dp, 0.dp))

    fun update(size: DpSize) {
        this.size.value = size
    }
}

@OptIn(ExperimentalDecomposeApi::class, ExperimentalComposeUiApi::class)
fun main() {
    val lifecycleRegistry = LifecycleRegistry()
    val navigationManagerService = NavigationManagerServiceImpl(
        componentContext = DefaultComponentContext(lifecycle = lifecycleRegistry),
        deepLink = DeepLink.Web(path = window.location.pathname),
        webHistoryController = DefaultWebHistoryController(),
        routeList = Routes
    )
    lifecycleRegistry.attachToDocument()

    onWasmReady {
        CanvasBasedWindow("JamshedAlamQaderi-Portfolio") {
            BootstrapApp(navigationManagerService)
        }
    }
}

@Composable
fun BootstrapApp(navigationManagerService: NavigationManagerService) {
    KoinApplication(application = {
        modules(
            KoinModule,
            module {
                single<NavigationService> { navigationManagerService }
            }
        )
    }) {
        PortfolioScaffold(modifier = Modifier.fillMaxSize()) {
            Children(
                navigationManagerService.stack,
                modifier = Modifier.fillMaxSize(),
                animation = stackAnimation(fade() + scale()),
            ) {
                BoxWithConstraints {
                    ScreenConstraints.update(DpSize(maxWidth, maxHeight))
                    navigationManagerService
                        .findRouteByNavigationRouter(it.instance)
                        ?.content?.invoke(it.instance)
                        ?: Center {
                            Text("Screen not found for path: ${it.instance.path}")
                        }
                }
            }
        }
    }
}

private fun LifecycleRegistry.attachToDocument() {
    fun onVisibilityChanged() {
        if (js("document.visibilityState") == "visible") {
            resume()
        } else {
            stop()
        }
    }

    onVisibilityChanged()

    document.addEventListener(
        type = "visibilitychange",
        callback = { onVisibilityChanged() }
    )
}
