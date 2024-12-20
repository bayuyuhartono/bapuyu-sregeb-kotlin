package com.bapuyu.sregeb.ui.navigation.components

import androidx.compose.material3.Badge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun TabBarBadge(count: Int? = null) {
    if (count != null) {
        Badge {
            Text(count.toString())
        }
    }
}