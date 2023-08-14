package com.jamshedalamqaderi.portfolio.presentation.project

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.ScreenConstraints
import com.jamshedalamqaderi.portfolio.data.BriefProjectListValues
import com.jamshedalamqaderi.portfolio.domain.utils.AppStrings
import com.jamshedalamqaderi.portfolio.presentation.common.components.Center
import com.jamshedalamqaderi.portfolio.presentation.common.components.IntroActionButtons
import com.jamshedalamqaderi.portfolio.presentation.common.components.SendFabButton
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectBanner
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectLink
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectName
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectScreenshots
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectSectionBody
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectSectionHeader
import com.jamshedalamqaderi.portfolio.presentation.project.components.ProjectTags
import com.jamshedalamqaderi.portfolio.presentation.project.entities.Project

@Composable
fun ProjectScreen(projectName: String) {
    val projectDetails = BriefProjectListValues[projectName]
    if (projectDetails == null) {
        Center {
            Text("Project not found with name: $projectName")
        }
        return
    }
    Box(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize().padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val displayWidth = ScreenConstraints.size.value.width
            LazyColumn(
                modifier = Modifier
                    .width(if (displayWidth > 480.dp) 600.dp else displayWidth)
                    .padding(horizontal = 20.dp)
            ) {
                items(projectDetails) { item ->
                    RenderProjectSection(item)
                }
//                item {
//                    Spacer(Modifier.height(30.dp))
//                }
                item {
                    RenderProjectSection(Project.SectionHeader(AppStrings.CONTACTS))
                }
                item {
                    IntroActionButtons()
                }
                item {
                    Spacer(Modifier.height(100.dp))
                }
            }
        }
        SendFabButton()
    }
}

@Composable
fun RenderProjectSection(item: Project) {
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
