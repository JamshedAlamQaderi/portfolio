package com.jamshedalamqaderi.portfolio.presentation.landing.entities

import kotlinx.browser.window

data class SocialLink(val icon: String, val url: String) {
    fun openLink() = window.open(url, "_blank")
}
