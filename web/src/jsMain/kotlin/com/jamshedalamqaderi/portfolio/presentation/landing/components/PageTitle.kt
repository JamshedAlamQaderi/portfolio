package com.jamshedalamqaderi.portfolio.presentation.landing.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun PageTitle(title: String, dividerWidth: Dp = 100.dp) {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(title, style = MaterialTheme.typography.headlineLarge, color = Color.Black)
        Spacer(Modifier.height(5.dp))
        Divider(
            modifier = Modifier.width(dividerWidth),
            thickness = 3.dp,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}
