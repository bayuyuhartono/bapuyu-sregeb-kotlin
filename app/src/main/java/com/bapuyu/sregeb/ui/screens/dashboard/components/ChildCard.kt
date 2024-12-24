package com.bapuyu.sregeb.ui.screens.dashboard.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bapuyu.sregeb.ui.theme.BlackText
import com.bapuyu.sregeb.ui.theme.WhiteSmoke

@Composable
fun ChildCard(
    title: String,
    point: String,
    modifier: Modifier,
    color: Color? = null
) {
    Column(
        modifier = modifier
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(20.dp)
            )
            .clip(RoundedCornerShape(20.dp))
            .background(color ?: WhiteSmoke)
            .padding(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                color = BlackText,
                text = title,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                color = BlackText,
                text = point,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}