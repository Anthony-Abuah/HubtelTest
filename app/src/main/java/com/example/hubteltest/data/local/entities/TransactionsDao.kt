package com.example.hubteltest.data.local.entities

import androidx.room.*
import com.example.hubteltest.ui.theme.Constants
import kotlinx.coroutines.flow.Flow


@Dao
interface TransactionsDao {

    @Query("SELECT * FROM ${Constants.TransactionEntity} ")
    fun allTransactions(): Flow<List<TransactionEntity>>?


    @Query("SELECT * FROM ${Constants.TransactionEntity} ")
    fun checkAllTransactions(): List<TransactionEntity>?


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTransactionEntity(transactionEntities: List<TransactionEntity>)

    @Delete
    suspend fun deleteTransactionEntity(customer: TransactionEntity)

}