package com.jamshedalamqaderi.portfolio.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import com.jamshedalamqaderi.portfolio.data.linkedinLink
import com.jamshedalamqaderi.portfolio.domain.utils.FontLoader
import com.jamshedalamqaderi.portfolio.presentation.ui.theme.PortfolioTheme
import kotlinx.browser.window

@Composable
fun PortfolioScaffold(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    val loaded = remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        FontLoader.loadPoppins()
        loaded.value = true
    }
    if (loaded.value) {
        PortfolioTheme {
            Scaffold(modifier, floatingActionButton = {
                FloatingActionButton(
                    onClick = {
                        window.open(linkedinLink.url, "_blank")
                    },
                    shape = CircleShape,
                    modifier = Modifier
                        .pointerHoverIcon(PointerIcon.Hand)
                ) {
                    Icon(Icons.Default.Send, contentDescription = "FAB Button")
                }
            }) {
                content.invoke()
            }
        }
    } else {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
    }
}
