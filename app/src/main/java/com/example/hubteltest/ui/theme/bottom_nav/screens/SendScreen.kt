package com.example.hubteltest.ui.theme.bottom_nav.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.hubteltest.ui.theme.bottom_nav.BottomBar


@Composable
fun SendScreen(
    navHostController: NavHostController
) {
    androidx.compose.material.Scaffold(

        content = {
            it
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                Text(
                    text = "View Send Screen Here",
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
            }

        },

        bottomBar = {
            BottomBar(navHostController = navHostController)

        }
    )
}