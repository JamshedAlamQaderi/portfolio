package com.jamshedalamqaderi.portfolio.presentation.project.components

import androidx.compose.foundation.clickable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import com.jamshedalamqaderi.portfolio.presentation.project.entities.Project
import kotlinx.browser.window

@Composable
fun ProjectLink(link: Project.Link) {
    Text(
        link.placeholder,
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier.clickable { window.open(link.url, "_blank") }.pointerHoverIcon(PointerIcon.Hand),
        color = MaterialTheme.colorScheme.tertiary
    )
}
