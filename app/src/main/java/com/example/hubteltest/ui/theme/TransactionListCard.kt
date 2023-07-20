package com.example.hubteltest.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hubteltest.data.local.entities.TransactionEntity
import com.example.hubteltest.ui.theme.Constants.transactionCardSpacerHeight

@Composable
fun TransactionListCard(
    date: String,
    transactions: List<TransactionEntity>
) {
    Column(
        modifier = Modifier.padding(8.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .background(Color.LightGray, RoundedCornerShape(24.dp))
                .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
            contentAlignment = Alignment.Center
        ){
            BasicText(text = date, color = Color.Gray, fontSize = 15.sp, fontWeight = FontWeight.Normal)
        }

        Spacer(modifier = Modifier.height(transactionCardSpacerHeight))

        for (transaction in transactions) {
            TransactionCard(
                time = transaction.transactionTime,
                customerName = transaction.userName,
                personal = "${transaction.transactionType} . ${transaction.transactionMessage}",
                contactNumber = transaction.userContact,
                image = transaction.transactionImage,
                amount = transaction.transactionAmount,
                isSuccess = transaction.isSuccessful
            )

            Spacer(modifier = Modifier.height(transactionCardSpacerHeight))

        }
    }
    Spacer(modifier = Modifier.height(50.dp))

}