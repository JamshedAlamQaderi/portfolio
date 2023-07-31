package com.jamshedalamqaderi.portfolio

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.CanvasBasedWindow
import com.jamshedalamqaderi.portfolio.presentation.ui.theme.PortfolioTheme
import org.jetbrains.skiko.wasm.onWasmReady

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        CanvasBasedWindow("Jamshed Alam Qaderi - Portfolio") {
            PortfolioTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "Hi there,",
                        style = androidx.compose.material3.MaterialTheme.typography.headlineLarge
                    )
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "I'm Jamshed Alam Qaderi",
                        style = androidx.compose.material3.MaterialTheme.typography.headlineLarge
                    )
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "Full stack developer (kotlin multiplatform)",
                        style = androidx.compose.material3.MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}
