package com.jamshedalamqaderi.portfolio.presentation.landing

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jamshedalamqaderi.portfolio.presentation.common.components.SendFabButton
import com.jamshedalamqaderi.portfolio.presentation.landing.components.Contacts
import com.jamshedalamqaderi.portfolio.presentation.landing.components.LandingIntro
import com.jamshedalamqaderi.portfolio.presentation.landing.components.Projects
import com.jamshedalamqaderi.portfolio.presentation.landing.components.Testimonials

@Composable
fun LandingScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            item {
                LandingIntro()
            }
            item {
                Projects()
            }
            item {
                Testimonials()
            }
            item {
                Contacts()
            }
        }
        SendFabButton()
    }
}
