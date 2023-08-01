package com.jamshedalamqaderi.portfolio.presentation.pages

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerSnapDistance
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jamshedalamqaderi.portfolio.presentation.PortfolioScaffold
import com.jamshedalamqaderi.portfolio.presentation.components.landing.Expertise
import com.jamshedalamqaderi.portfolio.presentation.components.landing.LandingIntro

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun Landing() {
    val pagerState = rememberPagerState()

    val fling = PagerDefaults.flingBehavior(
        state = pagerState,
        pagerSnapDistance = PagerSnapDistance.atMost(2)
    )

    PortfolioScaffold (modifier = Modifier.fillMaxSize()) {
        VerticalPager(
            pageCount = 2,
            state = pagerState,
            flingBehavior = fling,
            pageContent = { index ->
                when (index) {
                    0 -> LandingIntro()
                    1 -> Expertise()
                }
            }
        )

    }
}