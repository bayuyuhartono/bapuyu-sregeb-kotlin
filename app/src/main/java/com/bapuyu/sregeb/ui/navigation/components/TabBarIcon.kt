package com.bapuyu.sregeb.ui.navigation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bapuyu.sregeb.ui.theme.DarkSky
import com.bapuyu.sregeb.ui.theme.LightSky

@Composable
fun TabBarIcon(
    isSelected: Boolean,
    selectedIcon: ImageVector,
    unselectedIcon: ImageVector,
    title: String,
    badgeAmount: Int? = null
) {
    BadgedBox(badge = { TabBarBadge(badgeAmount) }) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                imageVector = if (isSelected) {selectedIcon} else {unselectedIcon},
                contentDescription = title,
                tint = if (isSelected) DarkSky else LightSky,
                modifier = Modifier.size(30.dp)
            )
            Text(
                fontSize = 12.sp,
                color = if (isSelected) DarkSky else LightSky,
                fontWeight = FontWeight.Bold,
                text = title
            )
        }
    }
}