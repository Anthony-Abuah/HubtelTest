package com.example.hubteltest.ui.theme.bottom_nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hubteltest.ui.theme.bottom_nav.screens.HistoryScreen
import com.example.hubteltest.ui.theme.bottom_nav.screens.HomeScreen
import com.example.hubteltest.ui.theme.bottom_nav.screens.ScheduleScreen
import com.example.hubteltest.ui.theme.bottom_nav.screens.SendScreen

@Composable
fun BottomNavGraph (mainNavController: NavHostController) {

    NavHost(
        navController = mainNavController,
        startDestination = BottomNavScreen.History.route
    )
    {
        composable(route = BottomNavScreen.Home.route) {
            HomeScreen(mainNavController)
        }
        composable(route = BottomNavScreen.Send.route) {
            SendScreen(mainNavController)
        }
        composable(route = BottomNavScreen.History.route) {
            HistoryScreen(mainNavController)
        }
        composable(route = BottomNavScreen.Scheduled.route) {
            ScheduleScreen(mainNavController)
        }
    }
}


