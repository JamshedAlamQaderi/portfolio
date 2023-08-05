package com.jamshedalamqaderi.webrouter.param

interface BaseParam : Param {
    fun parse(params: String): Param?
    fun build(path: String): String?
}