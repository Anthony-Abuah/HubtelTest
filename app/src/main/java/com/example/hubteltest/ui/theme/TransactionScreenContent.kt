package com.example.hubteltest.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hubteltest.R
import com.example.hubteltest.data.local.entities.TransactionEntity
import com.example.hubteltest.model.Transactions
import com.example.hubteltest.util.Resource


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TransactionScreenContent(
    transactions: List<TransactionEntity>,
    isLoading: Boolean
) {
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
            isSuccessful = true,
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
            isSuccessful = true,
            userName = "Emmanuel Rockson",
            userContact = "024 123 4567",
            transactionType = "Other",
            transactionMessage = "Cool your heart wai",
            transactionAmount = "GHS 500",
            transactionImage = R.drawable.mtn
        )
    )

    val transactionsGroupByDate = transactionList.groupBy { it.date }.toList()





    var onHistory by remember {
        mutableStateOf(true)
    }

    var searchValue by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth()
                .requiredHeight(50.dp)
                .background(color = Color.LightGray, shape = RoundedCornerShape(4.dp)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(shape = MaterialTheme.shapes.small,
                backgroundColor = if (onHistory) Color.White else Color.LightGray,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                elevation = 5.dp,
                onClick = {
                    onHistory = true
                }) {
                Box(
                    modifier = Modifier,
                    contentAlignment = Alignment.Center
                ) {
                    BasicText(
                        text = "History",
                        color = if (onHistory) Color.Black else Color.Gray,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                }
            }

            Card(shape = MaterialTheme.shapes.small,
                backgroundColor = if (onHistory) Color.LightGray else Color.White,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                elevation = 5.dp,
                onClick = {
                    onHistory = false
                }) {

                Box(
                    modifier = Modifier,
                    contentAlignment = Alignment.Center
                ) {
                    BasicText(
                        text = "Transaction Summary",
                        color = if (onHistory) Color.Gray else Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }

        Spacer(modifier = Modifier.requiredHeight(25.dp))

        Divider()

        Spacer(modifier = Modifier.requiredHeight(25.dp))

        Row(modifier = Modifier.fillMaxWidth().padding(4.dp)) {
            Box(modifier = Modifier.weight(6f)) {
                SearchField(
                    value = searchValue,
                    onValueChange = { searchValue = it },
                    SearchFieldTextColor = Color.Black,
                    SearchFieldBackgroundColor = Color.LightGray
                )
            }

            Spacer(modifier = Modifier.width(4.dp))

            Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                BasicImage(image = R.drawable.search_filter)
            }

        }

        Spacer(modifier = Modifier.requiredHeight(25.dp))
        if (!onHistory) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Transparent),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

        else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(2.dp)
            ) {
                items(
                    items = transactionsGroupByDate
                )
                { current ->
                    TransactionListCard(date = current.first, transactions = current.second)
                }
            }

        }

    }
}