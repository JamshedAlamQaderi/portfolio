package com.jamshedalamqaderi.portfolio.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.jamshedalamqaderi.portfolio.domain.utils.FontLoader
import com.jamshedalamqaderi.portfolio.presentation.ui.theme.PortfolioTheme

@Composable
fun PortfolioScaffold(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    val loaded = remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        FontLoader.loadPoppins()
        loaded.value = true
    }
    if (loaded.value) {
        PortfolioTheme {
            Scaffold(modifier) {
                content.invoke()
            }
        }
    } else {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
    }
}
