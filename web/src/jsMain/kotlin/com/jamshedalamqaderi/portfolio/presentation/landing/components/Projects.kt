package com.jamshedalamqaderi.portfolio.presentation.landing.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.data.ProjectListValues
import com.jamshedalamqaderi.portfolio.domain.utils.AppStrings

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun Projects() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.secondaryContainer,
                        MaterialTheme.colorScheme.errorContainer,
                    )
                )
            )
            .padding(bottom = 30.dp)
    ) {
        Spacer(Modifier.height(50.dp))
        PageTitle(AppStrings.PROJECTS)
        Spacer(Modifier.height(30.dp))
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.SpaceBetween,
            maxItemsInEachRow = 4
        ) {
            ProjectListValues.forEach { model ->
                ProjectCard(model)
            }
        }
        Spacer(Modifier.height(30.dp))
    }
}
