package com.jamshedalamqaderi.portfolio.domain.services.navigation

import com.jamshedalamqaderi.portfolio.domain.setup.NavigationRouter

interface NavigationService {
    fun goBack()
    fun push(router: NavigationRouter)
}
