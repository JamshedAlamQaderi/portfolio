package com.jamshedalamqaderi.portfolio.presentation.landing.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Chip
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jamshedalamqaderi.portfolio.domain.services.navigation.NavigationService
import com.jamshedalamqaderi.portfolio.domain.utils.AppStrings
import com.jamshedalamqaderi.portfolio.presentation.common.components.Margin
import com.jamshedalamqaderi.portfolio.presentation.landing.entities.ProjectListItemModel
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.orEmpty
import org.jetbrains.compose.resources.rememberImageBitmap
import org.jetbrains.compose.resources.resource
import org.koin.compose.koinInject

@OptIn(ExperimentalResourceApi::class, ExperimentalMaterialApi::class, ExperimentalLayoutApi::class)
@Composable
fun ProjectCard(model: ProjectListItemModel, navigationService: NavigationService = koinInject()) {
    val profilePicState = resource(model.banner).rememberImageBitmap()
    Margin(Modifier.padding(25.dp)) {
        Card(
            modifier = Modifier.width(300.dp).height(450.dp),
            elevation = CardDefaults.cardElevation(5.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Image(
                profilePicState.orEmpty(),
                contentDescription = "Landing Intro Profile Image",
                modifier = Modifier.fillMaxWidth().height(170.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(model.title, style = MaterialTheme.typography.headlineLarge, color = Color.Black)
                    Row(modifier = Modifier.fillMaxWidth()) {
                        model.tags.forEach { tag ->
                            Spacer(Modifier.width(2.dp))
                            Chip(onClick = {}) {
                                Text(tag, style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp))
                            }
                        }
                    }
                    Spacer(Modifier.height(5.dp))
                    Text(
                        model.description,
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.DarkGray
                    )
                    Spacer(Modifier.height(5.dp))
                }
                Row {
                    ElevatedButton(
                        onClick = {
                            navigationService.push(model.link)
                        },
                        modifier = Modifier.pointerHoverIcon(PointerIcon.Hand)
                    ) {
                        Text(AppStrings.VIEW_DETAILS)
                    }
                }
            }
        }
    }
}
