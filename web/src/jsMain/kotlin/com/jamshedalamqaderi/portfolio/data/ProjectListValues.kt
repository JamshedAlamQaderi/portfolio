package com.jamshedalamqaderi.portfolio.data

import com.jamshedalamqaderi.portfolio.domain.setup.NavigationRouter
import com.jamshedalamqaderi.portfolio.presentation.landing.entities.ProjectListItemModel

val ProjectListValues = listOf(
    ProjectListItemModel(
        "Circles",
        "Great job! I appreciate theming, grouping things into sections. The only missing thing (for me of course) are the placeholders in the text fields.",
        "images/projects/circles_banner_thumbnail.png",
        tags = listOf("FLUTTER", "STACKED", "ANDROID", "IOS"),
        link = NavigationRouter.Project(ProjectNames.CIRCLES)
    ),
    ProjectListItemModel(
        "KTransport",
        "Great job! I appreciate theming, grouping things into sections. The only missing thing (for me of course) are the placeholders in the text fields.",
        "images/projects/ktransport_thumbnail.png",
        tags = listOf("KOTLIN", "KMP", "CLIENT", "SERVER"),
        link = NavigationRouter.Project(ProjectNames.KTRANSPORT)
    ),
    ProjectListItemModel(
        "Socialdroid",
        "Great job! I appreciate theming, grouping things into sections. The only missing thing (for me of course) are the placeholders in the text fields.",
        "images/projects/socialdroid_thumbnail.png",
        tags = listOf("KOTLIN", "KMP", "Kobweb", "ANDROID"),
        link = NavigationRouter.Project(ProjectNames.SOCIALDROID)
    ),
    ProjectListItemModel(
        "Five Letter Word",
        "Great job! I appreciate theming, grouping things into sections. The only missing thing (for me of course) are the placeholders in the text fields.",
        "images/projects/five_letter_word_thumbnail.png",
        tags = listOf("FLUTTER", "STACKED", "ANDROID", "IOS"),
        link = NavigationRouter.Project(ProjectNames.FIVE_LETTER_WORDS)
    )
)
