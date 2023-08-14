package com.jamshedalamqaderi.portfolio.presentation.common.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import com.jamshedalamqaderi.portfolio.data.linkedinLink
import com.jamshedalamqaderi.portfolio.data.upworkLink
import com.jamshedalamqaderi.portfolio.domain.utils.AppStrings

@Composable
fun IntroActionButtons() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
            onClick = { upworkLink.openLink() }
        ) {
            Text(text = AppStrings.HIRE_ME, style = MaterialTheme.typography.labelLarge)
        }
        Spacer(modifier = Modifier.width(8.dp))
        OutlinedButton(
            modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
            onClick = { linkedinLink.openLink() }
        ) {
            Text(text = AppStrings.LETS_TALK, style = MaterialTheme.typography.labelLarge)
        }
    }
}
