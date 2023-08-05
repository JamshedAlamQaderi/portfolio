package com.jamshedalamqaderi.webrouter.dsl

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import com.jamshedalamqaderi.webrouter.context.RouteContext
import com.jamshedalamqaderi.webrouter.parser.PathParamParser
import com.jamshedalamqaderi.webrouter.router.RouterScope
import com.jamshedalamqaderi.webrouter.router.RouterViewScope
import kotlinx.browser.window
import org.w3c.dom.events.Event

@Composable
fun ComposeRouter(childRouter: RouterScope.() -> Unit) {
    val router = RouterScope("").apply(childRouter)
    val routerUrl = remember { mutableStateOf(window.location.pathname) }

    val updateUi: () -> Unit = {
        routerUrl.value = window.location.pathname
    }

    DisposableEffect(Unit) {
        val listener = { _: Event -> updateUi() }
        listOf("DOMContentLoaded", "popstate").forEach { eventName ->
            window.addEventListener(eventName, listener)
        }
        onDispose {
            listOf("DOMContentLoaded", "popstate").forEach { eventName ->
                window.removeEventListener(eventName, listener)
            }
        }
    }
    val pathParamParser = remember { PathParamParser() }
    val routeContext = remember { RouteContext(pathParamParser) }

    routeContext.onNavigate {
        updateUi()
    }

    val routeModel = router.render(
        routerUrl.value, "",
        pathParamParser
    )
    val routerViewScope = RouterViewScope(
        routeModel?.path ?: "",
        routeModel?.view
    )
    routerViewScope.renderView(routeContext)
}

@OptIn(ExperimentalComposeUiApi::class)
fun WebRouterWindow(
    title: String = "untitled",
    canvasElementId: String = "ComposeTarget",
    router: RouterScope.() -> Unit
) = CanvasBasedWindow(title, canvasElementId) {
    ComposeRouter(router)
}