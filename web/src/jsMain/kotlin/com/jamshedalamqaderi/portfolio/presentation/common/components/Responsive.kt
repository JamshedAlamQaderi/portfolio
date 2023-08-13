package com.jamshedalamqaderi.portfolio.presentation.common.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.ScreenConstraints

@Composable
fun Responsive(
    mobile: @Composable() (() -> Unit)? = null,
    mobileLandscape: @Composable (() -> Unit)? = null,
    tablet: @Composable (() -> Unit)? = null,
    tabletLandscape: @Composable (() -> Unit)? = null,
    desktop: @Composable (() -> Unit)? = null,
    largeDesktop: @Composable (() -> Unit)? = null,
) {
    val displayWidth = ScreenConstraints.size.value.width
    if (displayWidth <= 480.dp) {
        mobile?.invoke()
    } else if (displayWidth <= 767.dp) {
        mobileLandscape?.invoke()
    } else if (displayWidth <= 1023.dp) {
        tablet?.invoke()
    } else if (displayWidth <= 1279.dp) {
        tabletLandscape?.invoke()
    } else if (displayWidth <= 1439.dp) {
        desktop?.invoke()
    } else {
        largeDesktop?.invoke()
    }
}
