package com.jamshedalamqaderi.portfolio.presentation.landing

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.jamshedalamqaderi.portfolio.presentation.landing.components.Contacts
import com.jamshedalamqaderi.portfolio.presentation.landing.components.LandingIntro
import com.jamshedalamqaderi.portfolio.presentation.landing.components.Projects
import com.jamshedalamqaderi.portfolio.presentation.landing.components.Testimonials

@Composable
fun LandingScreen() {
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
}
