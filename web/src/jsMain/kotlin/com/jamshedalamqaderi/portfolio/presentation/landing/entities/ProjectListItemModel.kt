package com.jamshedalamqaderi.portfolio.presentation.landing.entities

data class ProjectListItemModel(
    val title: String,
    val description: String,
    val banner: String,
    val tags: List<String>,
    val link: String
)
