package com.jamshedalamqaderi.portfolio.presentation.project.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.jamshedalamqaderi.portfolio.presentation.project.entities.Project

@Composable
fun ProjectName(name: Project.Name) {
    Text(name.value, style = MaterialTheme.typography.headlineLarge)
}
