package com.jamshedalamqaderi.portfolio.presentation.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jamshedalamqaderi.portfolio.domain.utils.FontLoader

val PortfolioTypography = Typography(
    body1 = TextStyle(
        fontFamily = FontLoader.Poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = FontLoader.Poppins,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    )
)