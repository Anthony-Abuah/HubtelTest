package com.example.hubteltest.repository

import com.example.hubteltest.R
import com.example.hubteltest.data.local.entities.TransactionEntity
import com.example.hubteltest.data.local.entities.TransactionsDao
import com.example.hubteltest.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class TransactionsRepositoryImpl(
    private val transactionsDao: TransactionsDao
) : TransactionsRepository {


    override fun getAllTransactions(): Flow<Resource<Flow<List<TransactionEntity>>>> = flow {

        emit(Resource.Loading())

        val transactionList = listOf(
            TransactionEntity(
                null,
                date = "May 24, 2022",
                transactionTime = "14:45 PM",
                isSuccessful = true,
                userName = "Emmanuel Rockson \nKwabena Uncle Ebo",
                userContact = "024 123 4567",
                transactionType = "Personal",
                transactionMessage = "Cool your heart wai",
                transactionAmount = "GHS 500",
                transactionImage = R.drawable.mtn
            ),
            TransactionEntity(
                null,
                date = "May 24, 2022",
                transactionTime = "14:45 PM",
                isSuccessful = false,
                userName = "Absa Bank",
                userContact = "024 123 4567",
                transactionType = "Personal",
                transactionMessage = "Cool your heart wai",
                transactionAmount = "GHS 500",
                transactionImage = R.drawable.absa
            ),

            TransactionEntity(
                null,
                date = "May 23, 2022",
                transactionTime = "14:45 PM",
                isSuccessful = false,
                userName = "Emmanuel Rockson",
                userContact = "024 123 4567",
                transactionType = "Other",
                transactionMessage = "Cool your heart wai",
                transactionAmount = "GHS 500",
                transactionImage = R.drawable.mtn
            ),

            TransactionEntity(
                null,
                date = "May 23, 2022",
                transactionTime = "14:45 PM",
                isSuccessful = false,
                userName = "Emmanuel Rockson",
                userContact = "024 123 4567",
                transactionType = "Other",
                transactionMessage = "Cool your heart wai",
                transactionAmount = "GHS 500",
                transactionImage = R.drawable.mtn
            )
        )

        val checkAllTransactions = transactionsDao.checkAllTransactions()
        val transactions = transactionsDao.allTransactions()
        emit(Resource.Loading(data = transactions))

        try {
            if (checkAllTransactions == null || checkAllTransactions.isEmpty()){
                transactionsDao.addTransactionEntity(transactionList)
            }
        }catch (e: HttpException){
            emit(Resource.Error(
                message = "Something went wrong",
                data = transactions
            ))
        }catch (e: IOException){
            emit(Resource.Error(
                message = "Couldn't connect to the server",
                data = transactions
            ))
        }

        val newTransactions = transactionsDao.allTransactions() ?: emptyFlow()
        emit(Resource.Success(newTransactions))



    }
}