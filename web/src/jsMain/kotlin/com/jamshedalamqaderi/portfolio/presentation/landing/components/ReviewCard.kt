package com.jamshedalamqaderi.portfolio.presentation.landing.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.presentation.common.components.Avatar
import com.jamshedalamqaderi.portfolio.presentation.common.components.Margin
import com.jamshedalamqaderi.portfolio.presentation.landing.entities.ClientReview
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.orEmpty
import org.jetbrains.compose.resources.rememberImageBitmap
import org.jetbrains.compose.resources.resource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ReviewCard(review: ClientReview) {
    Margin(Modifier.padding(10.dp)) {
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
            modifier = Modifier.width(400.dp).height(250.dp)
        ) {
            Column(verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxSize()) {
                Column(modifier = Modifier.padding(start = 20.dp, top = 20.dp, end = 20.dp, bottom = 10.dp)) {
                    Row {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Avatar(
                                resource(review.profile).rememberImageBitmap().orEmpty(),
                                imageSize = 80.dp,
                                borderWidth = 2.dp
                            )
                            Spacer(Modifier.height(5.dp))
                            Rating(review.point)
                        }
                        Spacer(Modifier.width(20.dp))
                        Column {
                            Text(review.name, style = MaterialTheme.typography.headlineSmall)
                            Text(review.post, style = MaterialTheme.typography.bodyMedium)
                            Text(
                                review.company,
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Spacer(Modifier.width(20.dp))
                    }
                    Spacer(Modifier.height(10.dp))
                    Text(review.reviewText, style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Justify)
                }
                Text(
                    review.location,
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.padding(start = 20.dp, bottom = 5.dp)
                )
            }
        }
    }
}

@Composable
fun Rating(point: Int) {
    Row {
        repeat(5 - point) {
            Icon(Icons.Default.Star, contentDescription = "Rating Icon")
        }
        repeat(point) {
            Icon(
                Icons.Default.Star,
                contentDescription = "Rating Icon",
                tint = Color(0XFFFFD700),
                modifier = Modifier.size(20.dp)
            )
        }
    }
}
