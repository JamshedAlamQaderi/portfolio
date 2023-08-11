package com.jamshedalamqaderi.portfolio.presentation.ui.theme

import androidx.compose.material3.Typography
import com.jamshedalamqaderi.portfolio.domain.utils.FontLoader

private val defaultTypography = Typography()
val PortfolioTypography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = FontLoader.Poppins),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = FontLoader.Poppins),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = FontLoader.Poppins),

    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = FontLoader.Poppins),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = FontLoader.Poppins),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = FontLoader.Poppins),

    titleLarge = defaultTypography.titleLarge.copy(fontFamily = FontLoader.Poppins),
    titleMedium = defaultTypography.titleMedium.copy(fontFamily = FontLoader.Poppins),
    titleSmall = defaultTypography.titleSmall.copy(fontFamily = FontLoader.Poppins),

    bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = FontLoader.Poppins),
    bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = FontLoader.Poppins),
    bodySmall = defaultTypography.bodySmall.copy(fontFamily = FontLoader.Poppins),

    labelLarge = defaultTypography.labelLarge.copy(fontFamily = FontLoader.Poppins),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = FontLoader.Poppins),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = FontLoader.Poppins)
)
