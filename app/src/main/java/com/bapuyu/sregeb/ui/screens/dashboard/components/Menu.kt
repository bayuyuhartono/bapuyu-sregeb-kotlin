package com.bapuyu.sregeb.ui.screens.dashboard.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bapuyu.sregeb.data.Menu
import com.bapuyu.sregeb.ui.components.BaseCard
import com.bapuyu.sregeb.ui.theme.BlackText

@Composable
fun Menu() {
    val menuList: List<Menu> = arrayListOf(
        Menu("Nilai", "-", "-"),
        Menu("Absensi", "-", "-"),
        Menu("Agenda", "-", "-"),
        Menu("Berita", "-", "-"),
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(top = 8.dp),
        userScrollEnabled = false,
        modifier = Modifier.height(238.dp)
    ) {
        items(menuList.size) {
            BaseCard(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    color = BlackText,
                    text = menuList[it].title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }

}