package com.jamshedalamqaderi.webrouter.router

import androidx.compose.runtime.Composable
import com.jamshedalamqaderi.webrouter.context.Context

data class RouteModel(
    val path: String,
    val view: @Composable() (RouterViewScope.(Context) -> Unit)? = null
)