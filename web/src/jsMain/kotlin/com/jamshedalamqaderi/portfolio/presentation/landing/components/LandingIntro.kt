package com.jamshedalamqaderi.portfolio.presentation.landing.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.ScreenConstraints
import com.jamshedalamqaderi.portfolio.domain.utils.AppStrings
import com.jamshedalamqaderi.portfolio.presentation.common.components.IntroActionButtons
import com.jamshedalamqaderi.portfolio.presentation.common.components.Responsive
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.LoadState
import org.jetbrains.compose.resources.orEmpty
import org.jetbrains.compose.resources.rememberImageBitmap
import org.jetbrains.compose.resources.resource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun LandingIntro() {
    val screenSize = ScreenConstraints.size.value
    val profilePicState = resource("images/my_profile_pic.png").rememberImageBitmap()
    Responsive(
        mobile = {
            MobileDesign(profilePicState, screenSize.height)
        },
        mobileLandscape = {
            MobileDesign(profilePicState, screenSize.height)
        },
        tablet = {
            TabletDesign(profilePicState, screenSize.height)
        },
        tabletLandscape = {
            TabletDesign(profilePicState, screenSize.height)
        },
        desktop = {
            DesktopDesign(profilePicState, screenSize.height)
        },
        largeDesktop = {
            DesktopDesign(profilePicState, screenSize.height)
        }
    )
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun MobileDesign(profilePicState: LoadState<ImageBitmap>, displayHeight: Dp) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(displayHeight)
            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.secondaryContainer,
                        MaterialTheme.colorScheme.tertiaryContainer,
                    )
                )
            )
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        PortfolioImage(profilePicState.orEmpty(), 300.dp)
        Spacer(modifier = Modifier.width(20.dp))
        Column(
            modifier = Modifier
                .padding(10.dp),
        ) {
            Text(
                text = AppStrings.GREETING,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(top = 30.dp)
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    "${AppStrings.IAM},",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.width(5.dp))
                Text(
                    text = AppStrings.MY_NAME,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                )
            }
            Spacer(Modifier.width(10.dp))
            Text(
                text = AppStrings.JOB_TITLE,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = AppStrings.INTRO_DESCRIPTION,
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Justify
            )
            Spacer(modifier = Modifier.height(20.dp))
            IntroActionButtons()
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun TabletDesign(profilePicState: LoadState<ImageBitmap>, displayHeight: Dp) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(displayHeight)
            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.secondaryContainer,
                        MaterialTheme.colorScheme.tertiaryContainer,
                    )
                )
            )
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        PortfolioImage(profilePicState.orEmpty())
        Spacer(modifier = Modifier.width(20.dp))
        DesktopIntroText()
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun DesktopDesign(profilePicState: LoadState<ImageBitmap>, displayHeight: Dp) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(displayHeight)
            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.secondaryContainer,
                        MaterialTheme.colorScheme.tertiaryContainer,
                    )
                )
            )
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        PortfolioImage(profilePicState.orEmpty())
        Spacer(modifier = Modifier.width(50.dp))
        DesktopIntroText()
    }
}

@Composable
fun DesktopIntroText() {
    Column(
        modifier = Modifier
            .width(700.dp)
            .padding(16.dp),
    ) {
        Text(
            text = AppStrings.GREETING,
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 30.dp)
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                "${AppStrings.IAM},",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.width(5.dp))
            Text(
                text = AppStrings.MY_NAME,
                style = MaterialTheme.typography.displayMedium,
                fontWeight = FontWeight.Bold,
            )
        }
        Spacer(Modifier.width(10.dp))
        Text(
            text = AppStrings.JOB_TITLE,
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = AppStrings.INTRO_DESCRIPTION,
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Justify
        )
        Spacer(modifier = Modifier.height(20.dp))
        IntroActionButtons()
    }
}
