package com.jamshedalamqaderi.portfolio.domain.utils

import com.jamshedalamqaderi.portfolio.domain.exceptions.MissingResourceException
import org.khronos.webgl.ArrayBuffer
import org.w3c.xhr.XMLHttpRequest
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

internal suspend fun loadResource(url: String): ArrayBuffer {
    return suspendCoroutine { continuation ->
        val req = XMLHttpRequest()
        req.open("GET", url, true)
        req.responseType = "arraybuffer".toJsString().unsafeCast()

        req.onload = { _ ->
            val arrayBuffer = req.response
            if (arrayBuffer is ArrayBuffer) {
                continuation.resume(arrayBuffer)
            } else {
                continuation.resumeWithException(MissingResourceException(url))
            }
            null
        }
        req.send(null)
    }
}
