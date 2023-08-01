package com.jamshedalamqaderi.webrouter.param

class PathParam : BaseParam {
    override val params: ArrayList<Pair<String, String>> = arrayListOf()

    override fun put(key: String, value: String) {
        if (isKeyExists(key)) {
            throw PathParamKeyAlreadyExistsException(key)
        }
        params.add(Pair(key, value))
    }

    override fun get(key: String): String? {
        return params.firstOrNull { it.first == key }?.second
    }

    override fun getAll(key: String): Array<String?> {
        throw MethodNotWorkInPathParamException("getAll")
    }

    override fun parse(params: String): Param? {
        throw MethodNotWorkInPathParamException("parse")
    }

    override fun build(path: String): String? {
        throw MethodNotWorkInPathParamException("build")
    }

    override fun cleanAll() {
        params.clear()
    }

    private fun isKeyExists(key: String): Boolean {
        return params.filter { it.first == key }.map { true }.firstOrNull() ?: false
    }

    override fun toString(): String {
        return "PathParam(params=$params)"
    }

}

class PathParamKeyAlreadyExistsException(key: String) :
    Exception("Path param key ('$key') already exists")

class MethodNotWorkInPathParamException(methodName: String) :
    Exception("Method ('$methodName') not work on PathParam Class")