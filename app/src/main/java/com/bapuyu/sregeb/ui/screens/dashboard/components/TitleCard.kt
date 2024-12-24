package com.bapuyu.sregeb.ui.screens.dashboard.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.bapuyu.sregeb.ui.theme.BlackText

@Composable
fun TitleCard(
    title: String,
    clickTitle: String? = null
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            color = BlackText,
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            color = BlackText,
            text = clickTitle ?: "Lihat semua >",
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
        )
    }
}