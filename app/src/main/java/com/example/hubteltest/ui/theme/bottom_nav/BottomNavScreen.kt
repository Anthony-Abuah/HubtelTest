package com.example.hubteltest.ui.theme.bottom_nav

import com.example.hubteltest.R


sealed class BottomNavScreen(
    val name: String,
    val route: String,
    val icon: Int,
    val iconDisabled: Int,
){
    object Home: BottomNavScreen(
        name = "",
        route = "home",
        icon = R.drawable.home,
        iconDisabled = R.drawable.home1
    )

    object Send: BottomNavScreen(
        name = "Send",
        route = "send",
        icon = R.drawable.send,
        iconDisabled = R.drawable.send1
    )

    object History: BottomNavScreen(
        name = "History",
        route = "history",
        icon = R.drawable.history,
        iconDisabled = R.drawable.history1
    )

    object Scheduled: BottomNavScreen(
        name = "Scheduled",
        route = "scheduled",
        icon = R.drawable.schedule,
        iconDisabled = R.drawable.schedule1
    )
}