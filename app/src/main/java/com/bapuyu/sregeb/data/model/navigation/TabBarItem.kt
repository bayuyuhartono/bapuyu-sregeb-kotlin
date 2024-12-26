package com.bapuyu.sregeb.data.model.navigation

import androidx.compose.ui.graphics.vector.ImageVector

data class TabBarItem(
    val routeName: String,
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val badgeAmount: Int? = null
)