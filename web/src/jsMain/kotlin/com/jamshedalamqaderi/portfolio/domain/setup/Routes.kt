package com.jamshedalamqaderi.portfolio.domain.setup

import com.arkivanov.essenty.parcelable.Parcelable
import com.jamshedalamqaderi.portfolio.domain.services.navigation.Route
import com.jamshedalamqaderi.portfolio.presentation.landing.LandingScreen
import com.jamshedalamqaderi.portfolio.presentation.onboarding.OnBoardingScreen

sealed class NavigationRouter(val path: String, val initial: Boolean = false) : Parcelable {
    data object OnBoarding : NavigationRouter("onboarding", true)
    data object Landing : NavigationRouter("landing")
}

val Routes = listOf(
    Route(NavigationRouter.OnBoarding) { OnBoardingScreen() },
    Route(NavigationRouter.Landing) { LandingScreen() },
)
