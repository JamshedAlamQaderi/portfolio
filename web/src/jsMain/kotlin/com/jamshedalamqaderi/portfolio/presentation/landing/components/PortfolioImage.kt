package com.jamshedalamqaderi.portfolio.presentation.landing.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

internal val RoundedPortfolioPictureShape = RoundedCornerShape(
    topStartPercent = 50,
    topEndPercent = 50,
    bottomStartPercent = 5,
    bottomEndPercent = 5,
)

@Composable
fun PortfolioImage(picture: ImageBitmap, imageSize: Dp = 500.dp) {
    Box(
        modifier = Modifier
            .shadow(5.dp, shape = RoundedPortfolioPictureShape)
            .background(
                Color(0xFF60C7AE),
                shape = RoundedPortfolioPictureShape
            )
            .border(
                10.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedPortfolioPictureShape
            )
            .padding(top = 50.dp),
    ) {
        Image(
            picture,
            contentDescription = "Landing Intro Profile Image",
            modifier = Modifier.size(imageSize)
        )
    }
}
