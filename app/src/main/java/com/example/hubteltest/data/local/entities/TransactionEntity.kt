package com.example.hubteltest.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.hubteltest.ui.theme.Constants.TransactionEntity

@Entity(tableName = TransactionEntity)
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true)
    val transactionId: Int? = null,
    val date: String,
    val transactionTime: String,
    val isSuccessful: Boolean,
    val userName: String,
    val userContact: String,
    val transactionType: String,
    val transactionMessage: String,
    val transactionImage: Int,
    val transactionAmount: String
)
