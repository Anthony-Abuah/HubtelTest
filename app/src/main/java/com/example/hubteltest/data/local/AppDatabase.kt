package com.example.hubteltest.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.hubteltest.data.local.entities.TransactionEntity
import com.example.hubteltest.data.local.entities.TransactionsDao

@Database(
    entities = [TransactionEntity::class],
    version = 1
)

abstract class AppDatabase: RoomDatabase() {

    abstract val transactionsDao: TransactionsDao

}