package com.jamshedalamqaderi.webrouter.context

import com.jamshedalamqaderi.webrouter.param.BaseParam
import com.jamshedalamqaderi.webrouter.param.Param

interface Context {
    fun onNavigate(callback: () -> Unit)
    fun navigate(path: String, param: BaseParam? = null)
    fun back()
    fun forward()
    fun queryParams(): Param
    fun pathParams(): Param
    fun setTitle(title: String)
}