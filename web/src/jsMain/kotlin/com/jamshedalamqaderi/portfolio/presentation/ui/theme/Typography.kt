package com.jamshedalamqaderi.portfolio.presentation.ui.theme


import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jamshedalamqaderi.portfolio.domain.utils.FontLoader

val PortfolioTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontLoader.Poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = FontLoader.Poppins,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    )
)