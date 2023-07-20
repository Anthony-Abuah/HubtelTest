package com.example.hubteltest.repository

import com.example.hubteltest.data.local.entities.TransactionEntity
import com.example.hubteltest.util.Resource
import kotlinx.coroutines.flow.Flow


interface TransactionsRepository {

    fun getAllTransactions(): Flow<Resource<Flow<List<TransactionEntity>>>>

}

