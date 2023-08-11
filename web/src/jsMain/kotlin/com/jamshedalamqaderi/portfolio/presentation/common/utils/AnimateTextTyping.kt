package com.jamshedalamqaderi.portfolio.presentation.common.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import kotlinx.coroutines.delay

@Composable
fun animatedTextTying(
    targetText: String,
    delayInMillis: Long = 100L,
    onFinish: (() -> Unit)? = null,
): State<String> {
    val animatedText = remember { mutableStateOf("") }
    val targetLength = targetText.length
    LaunchedEffect(Unit) {
        repeat(targetLength) { index ->
            animatedText.value = targetText.substring(0, index + 1)
            delay(delayInMillis)
        }
        onFinish?.invoke()
    }

    return animatedText
}
