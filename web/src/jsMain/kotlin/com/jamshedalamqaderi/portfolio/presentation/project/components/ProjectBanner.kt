package com.jamshedalamqaderi.portfolio.presentation.project.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import com.jamshedalamqaderi.portfolio.presentation.project.entities.Project
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.orEmpty
import org.jetbrains.compose.resources.rememberImageBitmap
import org.jetbrains.compose.resources.resource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ProjectBanner(banner: Project.Banner) {
    Image(
        resource(banner.url).rememberImageBitmap().orEmpty(),
        contentDescription = "Project banner"
    )
}