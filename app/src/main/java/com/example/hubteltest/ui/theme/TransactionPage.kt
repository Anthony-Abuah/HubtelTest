package com.example.hubteltest.ui.theme

import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable



@Composable
fun TransactionPage(){

    Scaffold(

        content = {it
            TransactionScreen()
        },
        floatingActionButton = {
            AddFloatingActionButton {

            }
        },
        floatingActionButtonPosition = FabPosition.Center
    )

}