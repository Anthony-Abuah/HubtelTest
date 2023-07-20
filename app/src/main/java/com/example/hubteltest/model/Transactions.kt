package com.example.hubteltest.model

import java.util.Date

data class Transactions (
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
