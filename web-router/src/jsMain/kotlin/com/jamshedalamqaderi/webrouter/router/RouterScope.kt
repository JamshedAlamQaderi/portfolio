package com.jamshedalamqaderi.webrouter.router

import androidx.compose.runtime.Composable
import com.jamshedalamqaderi.webrouter.context.Context
import com.jamshedalamqaderi.webrouter.parser.Parser

class RouterScope(private val path: String) : Route {
    private val routes = arrayListOf<Route>()

    fun router(path: String, child: RouterScope.() -> Unit) {
        val routerScope = RouterScope(path)
        routerScope.child()
        routes.add(routerScope)
    }

    fun routeView(
        path: String,
        view: @Composable() (RouterViewScope.(Context) -> Unit)? = null
    ) {
        val routeViewScope = RouterViewScope(path, view)
        routes.add(routeViewScope)
    }

    override fun isRenderer() = false

    override fun <T> render(browserUrl: String, parentUrl: String, parser: Parser<T>): RouteModel? {
        val routerUrl = parentUrl + path
        return routes.firstNotNullOfOrNull { it.render(browserUrl, routerUrl, parser) }
    }

}