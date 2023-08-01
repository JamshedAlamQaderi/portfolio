package com.jamshedalamqaderi.portfolio.presentation.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.jamshedalamqaderi.portfolio.presentation.components.landing.LandingIntro

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Landing() {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize().background(
                Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFF0EB5A7),
                        Color(0xFF38EF7D),
                    )
                )
            )
        ) {
            LandingIntro()
        }
    }
}