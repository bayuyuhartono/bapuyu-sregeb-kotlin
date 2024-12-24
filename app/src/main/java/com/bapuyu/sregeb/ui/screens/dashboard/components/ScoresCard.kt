package com.bapuyu.sregeb.ui.screens.dashboard.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
fun ScoresCard() {
    val childWidth = 95.dp
    BaseCard(modifier = Modifier.fillMaxWidth()) {
        Column {
            TitleCard("Nilai Siswa")
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                ChildCard("MTK", "80", Modifier.width(childWidth))
                ChildCard("IPA", "77", Modifier.width(childWidth))
                ChildCard("PAI", "90", Modifier.width(childWidth))
            }
        }
    }
}