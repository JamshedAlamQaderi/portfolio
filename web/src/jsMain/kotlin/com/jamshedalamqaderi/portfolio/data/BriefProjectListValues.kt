package com.jamshedalamqaderi.portfolio.data

import com.jamshedalamqaderi.portfolio.presentation.project.entities.Project

object ProjectNames {
    const val CIRCLES = "CIRCLES"
    const val KTRANSPORT: String = "KTRANSPORT"
    const val SOCIALDROID = "SOCIALDROID"
    const val FIVE_LETTER_WORDS: String = "FIVE_LETTER_WORDS"
}

val BriefProjectListValues: Map<String, List<Project>> = mapOf(
    ProjectNames.CIRCLES to listOf(
        Project.Name("CIRCLES - MOVE FORWARD"),
        Project.Tags(listOf("Flutter", "Dart", "Android", "Ios")),
        Project.Banner("images/projects/circles_banner.png"),
        Project.SectionHeader("Intro"),
        Project.SectionBody("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
        Project.SectionHeader("Screenshots"),
        Project.Screenshots(
            listOf(
                "images/projects/circles_banner_thumbnail.png",
                "images/projects/five_letter_word_thumbnail.png"
            )
        ),
        Project.SectionHeader("Links"),
        Project.Link("Github", "https://github.com/JamshedAlamQaderi"),
    ),
)
