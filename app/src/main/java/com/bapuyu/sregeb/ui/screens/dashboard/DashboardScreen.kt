package com.bapuyu.sregeb.ui.screens.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bapuyu.sregeb.ui.screens.dashboard.components.AttendanceCard
import com.bapuyu.sregeb.ui.screens.dashboard.components.Menu
import com.bapuyu.sregeb.ui.screens.dashboard.components.ScoresCard
import com.bapuyu.sregeb.ui.screens.dashboard.components.TopBar
import com.bapuyu.sregeb.ui.theme.WhiteSmoke

@Composable
fun DashBoardScreen() {
    Scaffold(
        modifier = Modifier
            .background(WhiteSmoke)
            .windowInsetsPadding(WindowInsets.statusBars)
    ) { contentPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .background(WhiteSmoke)
                    .padding(contentPadding)
            ) {
                TopBar(
                    "Ar-Rauf Islamic School",
                    "Budi Budimen",
                    "TK A"
                )
                Column(
                    modifier = Modifier
                        .padding(
                            horizontal = 16.dp,
                            vertical = 24.dp
                        )
                ) {
                    Menu()
                    ScoresCard()
                    Spacer(Modifier.height(32.dp))
                    AttendanceCard()
                }
            }
    }
}


//@Preview
//@Composable
//fun DashboardPreview() {
//    DashBoardScreen()
//}