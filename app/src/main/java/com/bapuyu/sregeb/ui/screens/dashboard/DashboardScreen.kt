package com.bapuyu.sregeb.ui.screens.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bapuyu.sregeb.ui.theme.WhiteSmoke
import com.bapuyu.sregeb.ui.theme.PrimaryGreen

@Composable
fun DashBoardScreen() {
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .background(PrimaryGreen)
                    .padding(16.dp)
            ) {
                Text(
                    color = WhiteSmoke,
                    text = "Budi Budimen"
                )
            }
        },
        modifier = Modifier
            .background(WhiteSmoke)
            .windowInsetsPadding(WindowInsets.statusBars)
    ) { contentPadding ->
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .background(WhiteSmoke)
                .padding(contentPadding)
        ) {
            Text("Home")
        }
    }
}