package com.jamshedalamqaderi.portfolio

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.jamshedalamqaderi.portfolio.domain.utils.FontLoader
import com.jamshedalamqaderi.portfolio.presentation.pages.Landing
import com.jamshedalamqaderi.portfolio.presentation.pages.OnBoarding
import com.jamshedalamqaderi.portfolio.presentation.ui.theme.PortfolioTheme
import com.jamshedalamqaderi.webrouter.dsl.WebRouterWindow
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        WebRouterWindow {
            routeView("/") { context ->
                OnBoarding(context)
            }
            routeView("/landing") {
                Landing()
            }
        }
    }
}
