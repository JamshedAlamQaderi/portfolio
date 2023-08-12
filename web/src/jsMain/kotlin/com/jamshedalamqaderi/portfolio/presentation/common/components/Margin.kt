package com.jamshedalamqaderi.portfolio.presentation.common.components

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Margin(modifier: Modifier, content: @Composable () -> Unit) {
    Box(modifier) {
        content()
    }
}
