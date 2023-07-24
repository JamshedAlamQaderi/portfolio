package com.jamshedalamqaderi.portfolio

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.CanvasBasedWindow
import com.jamshedalamqaderi.portfolio.ui.theme.PortfolioTheme

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow("Jamshed Alam Qaderi - Portfolio", canvasElementId = "portfolio-canvas") {
        PortfolioTheme {
            Scaffold {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row {
                        Text("Hello, Compose/Wasm")
                    }
                    BottomNavigation {
                        BottomNavigationItem(false, onClick = {}, icon = { Icon(Icons.Default.Add, "Add Icon") })
                        BottomNavigationItem(true, onClick = {}, icon = { Icon(Icons.Default.AccountBox, "Add Icon") })
                        BottomNavigationItem(false, onClick = {}, icon = { Icon(Icons.Default.Call, "Add Icon") })
                        BottomNavigationItem(false, onClick = {}, icon = { Icon(Icons.Default.Email, "Add Icon") })
                        BottomNavigationItem(false, onClick = {}, icon = { Icon(Icons.Default.LocationOn, "Add Icon") })
                    }
                }
            }
        }
    }
}