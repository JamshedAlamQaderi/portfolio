package com.jamshedalamqaderi.portfolio.presentation.common.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Avatar(
    image: ImageBitmap,
    modifier: Modifier = Modifier,
    imageSize: Dp = 120.dp,
    borderColor: Color = Color.White,
    borderWidth: Dp = 2.dp,
) {
    Box(
        modifier = modifier.size(imageSize),
        contentAlignment = Alignment.Center
    ) {
        Canvas(
            modifier = Modifier
                .size(imageSize)
                .clip(CircleShape)
        ) {
            drawCircle(
                color = borderColor,
                radius = size.minDimension / 2,
                center = Offset(size.width / 2, size.height / 2),
                style = Stroke(width = borderWidth.toPx())
            )
        }

        Image(
            image,
            contentDescription = "Avatar image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(imageSize)
                .clip(CircleShape)
                .border(
                    width = borderWidth,
                    color = borderColor,
                    shape = CircleShape
                )
                .padding(borderWidth),
        )
    }
}