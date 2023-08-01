package com.jamshedalamqaderi.portfolio.presentation.components.landing

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.domain.utils.toImageBitmap
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.resource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun LandingIntro() {
    val landingIntroProfileImage = remember { mutableStateOf<ImageBitmap?>(null) }
    LaunchedEffect(Unit) {
        landingIntroProfileImage.value =
            resource("images/colored_landing_intro_profile_image.png").readBytes().toImageBitmap()
    }
    if (landingIntroProfileImage.value == null) return
    Row(
        modifier = Modifier.fillMaxSize().padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            landingIntroProfileImage.value!!,
            contentDescription = "Landing Intro Profile Image",
            modifier = Modifier.size(500.dp)
        )
        Spacer(modifier = Modifier.width(100.dp))
        Column {
            Text("Hi there, I'm", style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(20.dp))
            Text("Jamshed Alam Qaderi", style = MaterialTheme.typography.headlineLarge)
            Spacer(modifier = Modifier.height(20.dp))
            Text("Full stack developer", style = MaterialTheme.typography.headlineSmall)
        }
    }
}