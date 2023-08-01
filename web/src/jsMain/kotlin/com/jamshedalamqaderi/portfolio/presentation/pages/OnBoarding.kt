package com.jamshedalamqaderi.portfolio.presentation.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.jamshedalamqaderi.portfolio.domain.utils.AppStrings
import com.jamshedalamqaderi.portfolio.presentation.components.utils.animatedTextTying
import com.jamshedalamqaderi.webrouter.context.Context
import kotlinx.coroutines.delay

@Composable
fun OnBoarding(context: Context) {
    LaunchedEffect(Unit) {
        delay(5_000)
        context.navigate("/landing")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFFc9def4),
                        Color(0xFFf5ccd4),
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val greetingText = animatedTextTying(AppStrings.greeting)
            Text(
                text = greetingText.value,
                style = MaterialTheme.typography.displayLarge.copy(color = Color.White),
                textAlign = TextAlign.Center
            )

            // Typing animation for the meaning "Peace be upon you and God's mercy."
            val meaningText = animatedTextTying("Peace be upon you and God's mercy.")
            Text(
                text = meaningText.value,
                style = MaterialTheme.typography.displaySmall.copy(color = Color.White),
                textAlign = TextAlign.Center
            )
        }
    }
}