package com.jamshedalamqaderi.portfolio.presentation.project.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.presentation.project.entities.Project
import kotlinx.browser.window
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.orEmpty
import org.jetbrains.compose.resources.rememberImageBitmap
import org.jetbrains.compose.resources.resource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ProjectScreenshots(screenshots: Project.Screenshots) {
    Column {
        screenshots.urls.forEach { imageUrl ->
            Image(
                resource(imageUrl).rememberImageBitmap().orEmpty(),
                contentDescription = "Screenshot",
                modifier = Modifier
                    .padding(top = 10.dp)
                    .clickable {
                        window.open(imageUrl, "_blank")
                    }
                    .pointerHoverIcon(PointerIcon.Hand)
            )
        }
    }
}
