package com.jamshedalamqaderi.portfolio

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.CanvasBasedWindow
import com.jamshedalamqaderi.portfolio.presentation.ui.components.Accordion
import com.jamshedalamqaderi.portfolio.presentation.ui.theme.PortfolioTheme
import org.jetbrains.skiko.wasm.onWasmReady

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        CanvasBasedWindow("Jamshed Alam Qaderi - Portfolio", canvasElementId = "ComposeTarget") {
            val loading = remember { mutableStateOf(true) }
            LaunchedEffect(Unit) {
                loading.value = false
            }
            if (loading.value) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    CircularProgressIndicator()
                }
                return@CanvasBasedWindow
            }
            PortfolioTheme {
                Scaffold {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(Modifier.height(100.dp))
                        Accordion(
                            modifier = Modifier.width(500.dp),
                            header = {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        Icons.Default.Email,
                                        "Email me",
                                        tint = MaterialTheme.colors.onSecondary
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        "What is full stack development?",
                                        color = MaterialTheme.colors.onSecondary
                                    )
                                }
                            },
                        ) {
                            Column(modifier = Modifier.padding(20.dp)) {
                                Text(
                                    "Generally, it is accepted to use FlowBite in open-source projects, as long as it is not a UI library, a theme, a template, a page-builder that would be considered as an alternative to FlowBite itself.",
                                    color = Color(0xff6B7280)
                                )
                                Text(
                                    "With that being said, feel free to use this design kit for your open-source projects.",
                                    color = Color(0xff6B7280)
                                )
                                Text(
                                    "Find out more information by reading the license.",
                                    color = Color(0xff6B7280)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}