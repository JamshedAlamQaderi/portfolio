package com.jamshedalamqaderi.portfolio

import androidx.compose.ui.ExperimentalComposeUiApi
import com.jamshedalamqaderi.portfolio.presentation.pages.Landing
import com.jamshedalamqaderi.portfolio.presentation.pages.OnBoarding
import com.jamshedalamqaderi.portfolio.presentation.ui.theme.PortfolioTheme
import com.jamshedalamqaderi.webrouter.dsl.WebRouterWindow
import org.jetbrains.skiko.wasm.onWasmReady

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        WebRouterWindow {
            routeView("/") { context ->
                PortfolioTheme {
                    OnBoarding(context)
                }
            }
            routeView("/landing") {
                PortfolioTheme {
                    Landing()
                }
            }
        }
    }
}
