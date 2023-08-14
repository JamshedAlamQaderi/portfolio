package com.jamshedalamqaderi.portfolio.presentation.project.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.presentation.project.entities.Project

@Composable
fun ProjectSectionHeader(sectionHeader: Project.SectionHeader) {
    Text(
        sectionHeader.text,
        style = MaterialTheme.typography.headlineSmall,
        modifier = Modifier.padding(top = 20.dp, bottom = 5.dp)
    )
}
