package com.jamshedalamqaderi.webrouter.router

import androidx.compose.runtime.Composable
import com.jamshedalamqaderi.webrouter.context.Context
import com.jamshedalamqaderi.webrouter.parser.Parser

class RouterViewScope(
    private val path: String,
    private val view: @Composable() (RouterViewScope.(Context) -> Unit)?
) : Route {

    @Composable
    fun renderView(context: Context) {
        view?.let { it(context) }
    }

    override fun isRenderer() = true

    override fun <T> render(browserUrl: String, parentUrl: String, parser: Parser<T>): RouteModel? {
        val routerUrl = parentUrl + path
        if (parser.match(browserUrl, routerUrl)) {
            return RouteModel(routerUrl, view)
        }
        return null
    }
}