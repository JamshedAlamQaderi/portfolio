package com.jamshedalamqaderi.webrouter.parser

interface Parser<T> {
    fun match(browserPath: String, routePath: String): Boolean
    fun data(): T?
}