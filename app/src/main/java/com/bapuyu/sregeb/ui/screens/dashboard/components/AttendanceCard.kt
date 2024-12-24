package com.bapuyu.sregeb.ui.screens.dashboard.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bapuyu.sregeb.ui.components.BaseCard

@Composable
fun AttendanceCard() {
    BaseCard(modifier = Modifier.fillMaxWidth()) {
        TitleCard("Absensi Siswa")
        Spacer(modifier = Modifier.height(16.dp))

    }
}