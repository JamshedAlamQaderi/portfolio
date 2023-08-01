package com.jamshedalamqaderi.portfolio

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import com.jamshedalamqaderi.portfolio.presentation.pages.Landing
import com.jamshedalamqaderi.portfolio.presentation.ui.theme.PortfolioTheme
import org.jetbrains.skiko.wasm.onWasmReady

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        CanvasBasedWindow("Jamshed Alam Qaderi - Portfolio") {
            PortfolioTheme {
                Landing()
            }
        }
    }
}
