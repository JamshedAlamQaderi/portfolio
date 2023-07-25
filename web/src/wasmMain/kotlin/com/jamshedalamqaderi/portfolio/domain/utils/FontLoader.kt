package com.jamshedalamqaderi.portfolio.domain.utils

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font

object FontLoader {
    private const val fontPath = "fonts"
    var Poppins: FontFamily? = null
        private set

    suspend fun loadPoppins() {
        Poppins = FontFamily(
            Font(
                identity = "PoppinsBlack",
                data = loadResource("$fontPath/Poppins/Poppins-Black.ttf").toByteArray(),
                weight = FontWeight.Black
            ),
            Font(
                identity = "PoppinsBlackItalic",
                data = loadResource("$fontPath/Poppins/Poppins-BlackItalic.ttf").toByteArray(),
                weight = FontWeight.Black,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsBold",
                data = loadResource("$fontPath/Poppins/Poppins-Bold.ttf").toByteArray(),
                weight = FontWeight.Bold,
            ),
            Font(
                identity = "PoppinsBoldItalic",
                data = loadResource("$fontPath/Poppins/Poppins-BoldItalic.ttf").toByteArray(),
                weight = FontWeight.Bold,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsExtraBold",
                data = loadResource("$fontPath/Poppins/Poppins-ExtraBold.ttf").toByteArray(),
                weight = FontWeight.ExtraBold,
            ),
            Font(
                identity = "PoppinsExtraBoldItalic",
                data = loadResource("$fontPath/Poppins/Poppins-ExtraBoldItalic.ttf").toByteArray(),
                weight = FontWeight.ExtraBold,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsExtraLight",
                data = loadResource("$fontPath/Poppins/Poppins-ExtraLight.ttf").toByteArray(),
                weight = FontWeight.ExtraLight,
            ),
            Font(
                identity = "PoppinsExtraLightItalic",
                data = loadResource("$fontPath/Poppins/Poppins-ExtraLightItalic.ttf").toByteArray(),
                weight = FontWeight.ExtraLight,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsItalic",
                data = loadResource("$fontPath/Poppins/Poppins-Italic.ttf").toByteArray(),
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsLight",
                data = loadResource("$fontPath/Poppins/Poppins-Light.ttf").toByteArray(),
                weight = FontWeight.Light,
            ),
            Font(
                identity = "PoppinsLightItalic",
                data = loadResource("$fontPath/Poppins/Poppins-LightItalic.ttf").toByteArray(),
                weight = FontWeight.Light,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsMedium",
                data = loadResource("$fontPath/Poppins/Poppins-Medium.ttf").toByteArray(),
                weight = FontWeight.Medium,
            ),
            Font(
                identity = "PoppinsMediumItalic",
                data = loadResource("$fontPath/Poppins/Poppins-MediumItalic.ttf").toByteArray(),
                weight = FontWeight.Medium,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsRegular",
                data = loadResource("$fontPath/Poppins/Poppins-Regular.ttf").toByteArray(),
            ),
            Font(
                identity = "PoppinsSemiBold",
                data = loadResource("$fontPath/Poppins/Poppins-SemiBold.ttf").toByteArray(),
                weight = FontWeight.SemiBold,
            ),
            Font(
                identity = "PoppinsSemiBoldItalic",
                data = loadResource("$fontPath/Poppins/Poppins-SemiBoldItalic.ttf").toByteArray(),
                weight = FontWeight.SemiBold,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsThin",
                data = loadResource("$fontPath/Poppins/Poppins-Thin.ttf").toByteArray(),
                weight = FontWeight.Thin,
            ),
            Font(
                identity = "PoppinsThinItalic",
                data = loadResource("$fontPath/Poppins/Poppins-ThinItalic.ttf").toByteArray(),
                weight = FontWeight.Thin,
                style = FontStyle.Italic
            ),
        )
    }
}