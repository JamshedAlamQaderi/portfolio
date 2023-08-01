package com.jamshedalamqaderi.portfolio.presentation.pages

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jamshedalamqaderi.portfolio.presentation.components.landing.LandingIntro

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Landing() {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        LandingIntro()
    }
}