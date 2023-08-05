package com.jamshedalamqaderi.webrouter.param

interface Param {
    val params: ArrayList<Pair<String, String>>
    fun put(key: String, value: String)
    fun get(key: String): String?
    fun getAll(key:String):Array<String?>
    fun cleanAll()
}