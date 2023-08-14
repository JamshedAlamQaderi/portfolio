package com.jamshedalamqaderi.portfolio.presentation.landing.entities

import com.jamshedalamqaderi.portfolio.domain.setup.NavigationRouter

data class ProjectListItemModel(
    val title: String,
    val description: String,
    val banner: String,
    val tags: List<String>,
    val link: NavigationRouter.Project
)
