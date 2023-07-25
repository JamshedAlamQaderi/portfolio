package com.jamshedalamqaderi.portfolio.presentation.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp

@Composable
fun Accordion(modifier: Modifier = Modifier, header: @Composable () -> Unit = {}, body: @Composable () -> Unit = {}) {
    val expanded = remember { mutableStateOf(false) }
    Column(
        modifier = modifier.border(1.dp, MaterialTheme.colors.primary.copy(alpha = 0.3f), RoundedCornerShape(2.dp))) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(MaterialTheme.colors.secondary)
                .clickable {
                    expanded.value = !expanded.value
                }
                .pointerHoverIcon(PointerIcon.Hand)
                .padding(horizontal = 20.dp)
        ) {
            header()
            Icon(
                if (expanded.value) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                "accordion up arrow",
                tint = MaterialTheme.colors.onSecondary
            )
        }
        AnimatedVisibility(expanded.value) {
            body()
        }
    }
}