package com.bapuyu.sregeb.ui.screens.dashboard.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bapuyu.sregeb.ui.components.BaseCard
import com.bapuyu.sregeb.ui.theme.DarkSky

@Composable
fun PointScoreCard(
    title: String,
    point: String
) {
    BaseCard(
        modifier = Modifier
            .width(100.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                color = DarkSky,
                text = title,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                color = DarkSky,
                text = point,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}