package com.bapuyu.sregeb.ui.screens.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bapuyu.sregeb.ui.screens.dashboard.components.ScoresCard
import com.bapuyu.sregeb.ui.screens.dashboard.components.TopBar
import com.bapuyu.sregeb.ui.theme.WhiteSmoke

@Composable
fun DashBoardScreen() {
    Scaffold(
        topBar = { TopBar(
            "Ar-Rauf Islamic School",
            "Budi Budimen",
            "TK A"
        ) },
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
                .padding(16.dp)
        ) {
            ScoresCard()
        }
    }
}


//@Preview
//@Composable
//fun DashboardPreview() {
//    DashBoardScreen()
//}