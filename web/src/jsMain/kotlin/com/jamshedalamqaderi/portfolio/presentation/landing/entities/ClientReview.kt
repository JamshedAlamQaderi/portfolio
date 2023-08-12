package com.jamshedalamqaderi.portfolio.presentation.landing.entities

data class ClientReview(
    val name: String,
    val post: String,
    val company: String,
    val location: String,
    val profile: String,
    val reviewText: String,
    val point: Int,
)
