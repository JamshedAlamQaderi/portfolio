package com.jamshedalamqaderi.portfolio.presentation.project.components

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Chip
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.presentation.common.components.Margin
import com.jamshedalamqaderi.portfolio.presentation.project.entities.Project

@OptIn(ExperimentalMaterialApi::class, ExperimentalLayoutApi::class)
@Composable
fun ProjectTags(tags: Project.Tags) {
    FlowRow {
        tags.tags.forEach { tag ->
            Margin(Modifier.padding(end = 5.dp)) {
                Chip(onClick = {}) {
                    Text(tag, style = MaterialTheme.typography.labelSmall)
                }
            }
        }
    }
}
