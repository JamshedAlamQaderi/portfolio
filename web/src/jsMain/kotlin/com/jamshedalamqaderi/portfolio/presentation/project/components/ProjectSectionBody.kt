package com.jamshedalamqaderi.portfolio.presentation.project.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import com.jamshedalamqaderi.portfolio.presentation.project.entities.Project

@Composable
fun ProjectSectionBody(sectionBody: Project.SectionBody) {
    Text(sectionBody.text, style = MaterialTheme.typography.bodyLarge, textAlign = TextAlign.Justify)
}
