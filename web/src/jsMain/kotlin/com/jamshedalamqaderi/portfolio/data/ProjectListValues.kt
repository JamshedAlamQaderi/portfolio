package com.jamshedalamqaderi.portfolio.data

import com.jamshedalamqaderi.portfolio.domain.setup.NavigationRouter
import com.jamshedalamqaderi.portfolio.presentation.landing.entities.ProjectListItemModel

val ProjectListValues = listOf(
    ProjectListItemModel(
        "Circles",
        "An app for creating and sharing videos with templates, audio effects, and a TikTok-like feed. I improved the codebase, UI, and performance. I also created the editor studio, where users can customize their presentations and effects.",
        "images/projects/circles_banner_thumbnail.png",
        tags = listOf("FLUTTER", "STACKED", "ANDROID", "IOS"),
        link = NavigationRouter.Project(ProjectNames.CIRCLES)
    ),
    ProjectListItemModel(
        "KTransport",
        "A multiplatform library for gRPC-based APIs. It simplifies request and response handling, reduces client-side code, and boosts speed.",
        "images/projects/ktransport_thumbnail.png",
        tags = listOf("KOTLIN", "KMP", "CLIENT", "SERVER"),
        link = NavigationRouter.Project(ProjectNames.KTRANSPORT)
    ),
    ProjectListItemModel(
        "Socialdroid",
        "An app that automates social media tasks on Android devices. I built the app, backend, and web dashboard with Kotlin, Ktor, and Kobweb.",
        "images/projects/socialdroid/socialdroid_thumbnail.png",
        tags = listOf("KOTLIN", "KMP", "Kobweb", "ANDROID"),
        link = NavigationRouter.Project(ProjectNames.SOCIALDROID)
    ),
    ProjectListItemModel(
        "Five Letter Word",
        "A mobile game that tests your vocabulary and logic. Guess the word in few tries, track your stats, and unlock more modes. Built with Flutter and Firebase.",
        "images/projects/five_letter_word_thumbnail.png",
        tags = listOf("FLUTTER", "STACKED", "ANDROID", "IOS"),
        link = NavigationRouter.Project(ProjectNames.FIVE_LETTER_WORDS)
    )
)
