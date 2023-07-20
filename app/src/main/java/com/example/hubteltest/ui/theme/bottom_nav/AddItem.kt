package com.example.hubteltest.ui.theme.bottom_nav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.hubteltest.ui.theme.Constants.navigationIcon

@Composable
fun RowScope.AddItem(
    screen: BottomNavScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {


    BottomNavigationItem(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .align(Alignment.CenterVertically),
        label = {
            Text(text = screen.name,
                color = if (currentDestination?.hierarchy?.any {
                        it.route == screen.route
                    } == true)
                    Color.Black else Color.LightGray, fontSize = 12.sp)
        },
        alwaysShowLabel = true,
        icon = {

                Box(
                    modifier = Modifier.background(Color.Transparent).requiredHeight(50.dp)
                        .requiredWidth(50.dp), contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = screen.iconDisabled),
                        contentDescription = navigationIcon,
                        modifier = Modifier.fillMaxSize()
                    )
                }



        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,

        unselectedContentColor = Color.LightGray,

        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        })
}
