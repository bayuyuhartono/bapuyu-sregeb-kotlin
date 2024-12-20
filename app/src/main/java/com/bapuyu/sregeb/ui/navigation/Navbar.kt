package com.bapuyu.sregeb.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bapuyu.sregeb.data.model.navigation.TabBarItem
import com.bapuyu.sregeb.ui.navigation.components.TabView
import com.bapuyu.sregeb.ui.screens.dashboard.DashBoardScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Navbar() {
    val homeTab = TabBarItem(title = "Home", selectedIcon = Icons.Filled.Home, unselectedIcon = Icons.Outlined.Home)
    val paymentTab = TabBarItem(title = "Payment", selectedIcon = Icons.Filled.ShoppingCart, unselectedIcon = Icons.Outlined.ShoppingCart)
    val profileTab = TabBarItem(title = "Profile", selectedIcon = Icons.Filled.AccountCircle, unselectedIcon = Icons.Outlined.AccountCircle, badgeAmount = 3)

    val tabBarItems = listOf(homeTab, paymentTab, profileTab)

    val navController = rememberNavController()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Scaffold(bottomBar = { TabView(tabBarItems, navController) }) {
            NavHost(
                navController = navController,
                startDestination = homeTab.title,
            ) {
                composable(homeTab.title) {
                    DashBoardScreen()
                }
                composable(paymentTab.title) {
                    Text(paymentTab.title)
                }
                composable(profileTab.title) {
                    Text(profileTab.title)
                }
            }
        }
    }
}


