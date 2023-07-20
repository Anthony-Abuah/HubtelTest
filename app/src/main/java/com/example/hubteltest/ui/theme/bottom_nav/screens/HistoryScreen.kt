package com.example.hubteltest.ui.theme.bottom_nav.screens

import androidx.compose.material.FabPosition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.hubteltest.ui.theme.AddFloatingActionButton
import com.example.hubteltest.ui.theme.TransactionScreenContent
import com.example.hubteltest.ui.theme.bottom_nav.BottomBar
import com.example.hubteltest.view_model.TransactionsViewModel


@Composable
fun HistoryScreen(
    navHostController: NavHostController,
    viewModel: TransactionsViewModel = hiltViewModel()
) {
    val transactions by viewModel.transactionsState.value.transactions.collectAsState(
        initial = emptyList()
    )

    androidx.compose.material.Scaffold(

        content = {
            it
            TransactionScreenContent(
                transactions = transactions,
                isLoading = viewModel.transactionsState.value.isLoading
            )
        },
        floatingActionButton = {
            AddFloatingActionButton {
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        bottomBar = {
            BottomBar(navHostController = navHostController)

        }
    )
}