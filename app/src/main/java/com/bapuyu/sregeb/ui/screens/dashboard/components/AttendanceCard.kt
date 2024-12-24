package com.bapuyu.sregeb.ui.screens.dashboard.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bapuyu.sregeb.ui.components.BaseCard

@Composable
fun AttendanceCard() {
    val childWidth = 150.dp
    val childModifier = Modifier
        .width(childWidth)
    BaseCard(modifier = Modifier.fillMaxWidth()) {
        TitleCard("Absensi Desember")
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            ChildCard(
                "Absen Tercatat",
                "30",
                childModifier
            )
            ChildCard(
                "Tidak Masuk",
                "1",
                childModifier
            )
        }
    }
}