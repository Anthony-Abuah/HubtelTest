package com.example.hubteltest.ui.theme.bottom_nav

import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material.BottomNavigation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBar(
    navHostController: NavHostController
){
    val screens = listOf(
        BottomNavScreen.Home,
        BottomNavScreen.Send,
        BottomNavScreen.History,
        BottomNavScreen.Scheduled
    )
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(
        modifier = Modifier.requiredHeight(85.dp),
        backgroundColor = Color.White,
        contentColor = Color.Black
    ) {
        screens.forEach{screen->
            AddItem(screen = screen, currentDestination = currentDestination, navController = navHostController)
        }
    }
}