package com.jamshedalamqaderi.portfolio.domain.utils

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.resource

object FontLoader {
    private const val fontPath = "fonts"
    var Poppins: FontFamily? = null
        private set

    @OptIn(ExperimentalResourceApi::class)
    suspend fun loadPoppins() {
        Poppins = FontFamily(
            Font(
                identity = "PoppinsBlack",
                data = resource("$fontPath/Poppins/Poppins-Black.ttf").readBytes(),
                weight = FontWeight.Black
            ),
            Font(
                identity = "PoppinsBlackItalic",
                data = resource("$fontPath/Poppins/Poppins-BlackItalic.ttf").readBytes(),
                weight = FontWeight.Black,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsBold",
                data = resource("$fontPath/Poppins/Poppins-Bold.ttf").readBytes(),
                weight = FontWeight.Bold,
            ),
            Font(
                identity = "PoppinsBoldItalic",
                data = resource("$fontPath/Poppins/Poppins-BoldItalic.ttf").readBytes(),
                weight = FontWeight.Bold,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsExtraBold",
                data = resource("$fontPath/Poppins/Poppins-ExtraBold.ttf").readBytes(),
                weight = FontWeight.ExtraBold,
            ),
            Font(
                identity = "PoppinsExtraBoldItalic",
                data = resource("$fontPath/Poppins/Poppins-ExtraBoldItalic.ttf").readBytes(),
                weight = FontWeight.ExtraBold,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsExtraLight",
                data = resource("$fontPath/Poppins/Poppins-ExtraLight.ttf").readBytes(),
                weight = FontWeight.ExtraLight,
            ),
            Font(
                identity = "PoppinsExtraLightItalic",
                data = resource("$fontPath/Poppins/Poppins-ExtraLightItalic.ttf").readBytes(),
                weight = FontWeight.ExtraLight,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsItalic",
                data = resource("$fontPath/Poppins/Poppins-Italic.ttf").readBytes(),
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsLight",
                data = resource("$fontPath/Poppins/Poppins-Light.ttf").readBytes(),
                weight = FontWeight.Light,
            ),
            Font(
                identity = "PoppinsLightItalic",
                data = resource("$fontPath/Poppins/Poppins-LightItalic.ttf").readBytes(),
                weight = FontWeight.Light,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsMedium",
                data = resource("$fontPath/Poppins/Poppins-Medium.ttf").readBytes(),
                weight = FontWeight.Medium,
            ),
            Font(
                identity = "PoppinsMediumItalic",
                data = resource("$fontPath/Poppins/Poppins-MediumItalic.ttf").readBytes(),
                weight = FontWeight.Medium,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsRegular",
                data = resource("$fontPath/Poppins/Poppins-Regular.ttf").readBytes(),
            ),
            Font(
                identity = "PoppinsSemiBold",
                data = resource("$fontPath/Poppins/Poppins-SemiBold.ttf").readBytes(),
                weight = FontWeight.SemiBold,
            ),
            Font(
                identity = "PoppinsSemiBoldItalic",
                data = resource("$fontPath/Poppins/Poppins-SemiBoldItalic.ttf").readBytes(),
                weight = FontWeight.SemiBold,
                style = FontStyle.Italic
            ),
            Font(
                identity = "PoppinsThin",
                data = resource("$fontPath/Poppins/Poppins-Thin.ttf").readBytes(),
                weight = FontWeight.Thin,
            ),
            Font(
                identity = "PoppinsThinItalic",
                data = resource("$fontPath/Poppins/Poppins-ThinItalic.ttf").readBytes(),
                weight = FontWeight.Thin,
                style = FontStyle.Italic
            ),
        )
    }
}
