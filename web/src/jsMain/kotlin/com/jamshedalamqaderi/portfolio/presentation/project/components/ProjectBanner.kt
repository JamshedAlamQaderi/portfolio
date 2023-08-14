package com.jamshedalamqaderi.portfolio.presentation.project.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import com.jamshedalamqaderi.portfolio.presentation.project.entities.Project
import kotlinx.browser.window
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.orEmpty
import org.jetbrains.compose.resources.rememberImageBitmap
import org.jetbrains.compose.resources.resource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ProjectBanner(banner: Project.Banner) {
    Image(
        resource(banner.url).rememberImageBitmap().orEmpty(),
        contentDescription = "Project banner",
        modifier = Modifier
            .clickable {
                window.open(banner.url, "_blank")
            }
            .pointerHoverIcon(PointerIcon.Hand)
    )
}
