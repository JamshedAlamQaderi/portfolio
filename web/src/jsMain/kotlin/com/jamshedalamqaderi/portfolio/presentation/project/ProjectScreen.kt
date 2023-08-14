package com.jamshedalamqaderi.portfolio.presentation.project

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectBanner
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectLink
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectName
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectScreenshots
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectSectionBody
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectSectionHeader
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectTags
import com.jamshedalamqaderi.portfolio.presentation.project.entities.Project
import org.jetbrains.compose.resources.ExperimentalResourceApi

val demoProjectCompose = listOf(
    Project.Banner("images/projects/circles_banner.png"),
    Project.Name("Circles"),
    Project.Tags(listOf("Flutter", "Dart", "Android", "Ios")),
    Project.Screenshots(
        listOf(
            "images/projects/circles_banner_thumbnail.png",
            "images/projects/five_letter_word_thumbnail.png"
        )
    ),
    Project.SectionHeader("Intro"),
    Project.SectionBody("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
    Project.SectionHeader("Links"),
    Project.Link("Github", "https://github.com/JamshedAlamQaderi")
)

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ProjectScreen(projectName: String) {
    LazyColumn(modifier = Modifier.defaultMinSize(400.dp)) {
        items(demoProjectCompose) { item ->
            when (item) {
                is Project.Banner -> ProjectBanner(item)
                is Project.Link -> ProjectLink(item)
                is Project.Name -> ProjectName(item)
                is Project.Screenshots -> ProjectScreenshots(item)
                is Project.SectionBody -> ProjectSectionBody(item)
                is Project.SectionHeader -> ProjectSectionHeader(item)
                is Project.Tags -> ProjectTags(item)
            }
        }
    }
}
