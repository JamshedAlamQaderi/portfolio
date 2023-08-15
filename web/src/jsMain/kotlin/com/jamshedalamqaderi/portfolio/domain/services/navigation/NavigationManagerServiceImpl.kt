package com.jamshedalamqaderi.portfolio.domain.services.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.router.stack.webhistory.WebHistoryController
import com.arkivanov.decompose.value.Value
import com.jamshedalamqaderi.portfolio.domain.setup.NavigationRouter

@OptIn(ExperimentalDecomposeApi::class)
class NavigationManagerServiceImpl(
    componentContext: ComponentContext,
    deepLink: DeepLink = DeepLink.None,
    webHistoryController: WebHistoryController? = null,
    private val routeList: List<Route> = emptyList()
) : NavigationManagerService,
    ComponentContext by componentContext {
    private val navigation = StackNavigation<NavigationRouter>()

    private val _stack = childStack(
        source = navigation,
        initialStack = { navFromDeepLink(deepLink) },
        childFactory = { config, _ ->
            config
        },
    )

    override val stack: Value<ChildStack<*, NavigationRouter>> = _stack

    override fun findRouteByNavigationRouter(router: NavigationRouter): Route? {
        return routeList.find { it.router.path == router.path }
    }

    override fun goBack() {
        navigation.pop()
    }

    override fun push(router: NavigationRouter) {
        navigation.push(router)
    }

    init {
        webHistoryController?.attach(
            navigator = navigation,
            stack = _stack,
            getPath = ::pathFromRouter,
            getConfiguration = ::routerFromPath,
        )
    }

    private fun navFromDeepLink(deepLink: DeepLink): List<NavigationRouter> {
        return when (deepLink) {
            DeepLink.None -> listOf(getInitialRouter())
            is DeepLink.Web -> listOf(routerFromPath(deepLink.path))
        }
    }

    private fun getInitialRouter() = routeList.first { it.router.initial }.router

    private fun routerFromPath(path: String): NavigationRouter {
        return routeList.find { it.router.path == path.removePrefix("/") }?.router
            ?: getInitialRouter()
    }

    private fun pathFromRouter(router: NavigationRouter): String {
        return router.path
    }
}
