package com.bapuyu.sregeb.ui.navigation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.bapuyu.sregeb.data.model.navigation.TabBarItem
import com.bapuyu.sregeb.ui.theme.Grey
import com.bapuyu.sregeb.ui.theme.WhiteSmoke
import com.bapuyu.sregeb.utils.topBorder

@Composable
fun TabView(tabBarItems: List<TabBarItem>, navController: NavController) {
    var selectedTabIndex by rememberSaveable { mutableIntStateOf(0) }

    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .topBorder(Grey, 1F)
            .background(WhiteSmoke)
            .height(80.dp)
            .fillMaxWidth()
            .padding(
                horizontal = 8.dp,
                vertical = 8.dp
            )
    ) {
        tabBarItems.forEachIndexed { index, tabBarItem ->
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = WhiteSmoke,
                    disabledContainerColor = WhiteSmoke
                ),
                onClick = {
                    selectedTabIndex = index
                    navController.navigate(tabBarItem.routeName)
                },
            ) {
                TabBarIcon(
                    isSelected = selectedTabIndex == index,
                    selectedIcon = tabBarItem.selectedIcon,
                    unselectedIcon = tabBarItem.unselectedIcon,
                    title = tabBarItem.title,
                    badgeAmount = tabBarItem.badgeAmount
                )
            }
        }
    }

//    NavigationBar(
//        containerColor = Color.White,
//        modifier = Modifier
//            .topBorder(Grey, 2F)
//    ) {
//        tabBarItems.forEachIndexed { index, tabBarItem ->
//            NavigationBarItem(
//                selected = selectedTabIndex == index,
//                onClick = {
//                    selectedTabIndex = index
//                    navController.navigate(tabBarItem.title)
//                },
//                icon = {
//                    TabBarIcon(
//                        isSelected = selectedTabIndex == index,
//                        selectedIcon = tabBarItem.selectedIcon,
//                        unselectedIcon = tabBarItem.unselectedIcon,
//                        title = tabBarItem.title,
//                        badgeAmount = tabBarItem.badgeAmount
//                    )
//                },
//                label = { Text(tabBarItem.title) }
//            )
//        }
//    }
}