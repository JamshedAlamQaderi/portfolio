package com.jamshedalamqaderi.portfolio.presentation.common.components

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.data.linkedinLink

@Composable
fun BoxScope.SendFabButton() {
    FloatingActionButton(
        onClick = {
            linkedinLink.openLink()
        },
        shape = CircleShape,
        modifier = Modifier
            .pointerHoverIcon(PointerIcon.Hand)
            .align(Alignment.BottomEnd)
            .padding(30.dp)
    ) {
        Icon(Icons.Default.Send, contentDescription = "FAB Button")
    }
}
