package com.jamshedalamqaderi.portfolio.presentation.landing.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.data.SocialLinkValues
import com.jamshedalamqaderi.portfolio.domain.utils.AppStrings
import com.jamshedalamqaderi.portfolio.presentation.common.components.Center
import com.jamshedalamqaderi.portfolio.presentation.common.components.Margin
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.orEmpty
import org.jetbrains.compose.resources.rememberImageBitmap
import org.jetbrains.compose.resources.resource

@OptIn(ExperimentalLayoutApi::class, ExperimentalResourceApi::class)
@Composable
fun Contacts() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.surfaceVariant,
                        MaterialTheme.colorScheme.tertiaryContainer,
                    )
                )
            )
    ) {
        Spacer(Modifier.height(50.dp))
        PageTitle(AppStrings.CONTACTS, 200.dp)
        Spacer(Modifier.height(30.dp))
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            maxItemsInEachRow = 5
        ) {
            SocialLinkValues.forEach { socialLink ->
                Margin(Modifier.padding(20.dp)) {
                    Card(
                        shape = CircleShape,
                        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
                        modifier = Modifier
                            .size(50.dp)
                            .shadow(3.dp, shape = CircleShape)
                            .pointerHoverIcon(PointerIcon.Hand)
                            .clickable {
                                socialLink.openLink()
                            }
                    ) {
                        Center {
                            Image(
                                resource(socialLink.icon).rememberImageBitmap().orEmpty(),
                                contentDescription = "Social Icon",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                }
            }
        }
        Spacer(Modifier.height(30.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.tertiary)
                .padding(vertical = 20.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                AppStrings.COPYRIGHTS,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onTertiary
            )
        }
    }
}
