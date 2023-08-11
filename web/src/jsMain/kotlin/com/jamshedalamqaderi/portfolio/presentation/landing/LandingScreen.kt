package com.jamshedalamqaderi.portfolio.presentation.landing

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jamshedalamqaderi.portfolio.presentation.landing.components.Expertise
import com.jamshedalamqaderi.portfolio.presentation.landing.components.LandingIntro

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LandingScreen() {
    VerticalPager(state = rememberPagerState { 2 }, modifier = Modifier.fillMaxSize()) { index ->
        when (index) {
            0 -> LandingIntro()
            1 -> Expertise()
        }
    }
}
