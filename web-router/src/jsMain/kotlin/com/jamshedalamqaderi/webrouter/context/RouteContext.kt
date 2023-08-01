package com.jamshedalamqaderi.webrouter.context

import com.jamshedalamqaderi.webrouter.param.BaseParam
import com.jamshedalamqaderi.webrouter.param.Param
import com.jamshedalamqaderi.webrouter.param.QueryParam
import com.jamshedalamqaderi.webrouter.parser.PathParamParser
import kotlinx.browser.document
import kotlinx.browser.window

class RouteContext(private val pathParamParser: PathParamParser) : Context {
    private val onNavigateCallbacks = arrayListOf<() -> Unit>()

    override fun onNavigate(callback: () -> Unit) {
        onNavigateCallbacks.add(callback)
    }

    override fun setTitle(title: String) {
        document.title = title
    }

    override fun navigate(path: String, param: BaseParam?) {
        val _param = if (param == null) path else param.build(path)
        window.history.pushState(null, "", _param)
        onNavigateCallbacks.forEach { it() }
    }

    override fun back() {
        window.history.back()
    }

    override fun forward() {
        window.history.forward()
    }

    override fun queryParams(): Param {
        return QueryParam().parse(window.location.search)
    }

    override fun pathParams(): Param {
        return pathParamParser.data()
    }
}