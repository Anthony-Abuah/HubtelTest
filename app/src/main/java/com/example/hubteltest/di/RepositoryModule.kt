package com.example.hubteltest.di

import com.example.hubteltest.data.local.AppDatabase
import com.example.hubteltest.repository.TransactionsRepository
import com.example.hubteltest.repository.TransactionsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {


    @Provides
    @Singleton
    fun provideTransactionsRepository(
        db: AppDatabase,
    ): TransactionsRepository{
        return TransactionsRepositoryImpl(db.transactionsDao)
    }




}