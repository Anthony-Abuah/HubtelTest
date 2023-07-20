package com.example.hubteltest.view_model.state

import com.example.hubteltest.data.local.entities.TransactionEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class TransactionsState(
    val transactions: Flow<List<TransactionEntity>> = emptyFlow(),
    val isLoading: Boolean = false
)
