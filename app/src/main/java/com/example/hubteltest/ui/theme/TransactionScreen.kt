package com.example.hubteltest.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hubteltest.R


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TransactionScreen(){



    BasicScreenColumn {

        Spacer(modifier = Modifier.height(25.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth().requiredHeight(50.dp)
                .background(color = Color.LightGray, shape = RoundedCornerShape(4.dp)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(shape = MaterialTheme.shapes.small,
                backgroundColor = Color.White,
                modifier = Modifier.fillMaxHeight()
                    .weight(1f),
                elevation = 5.dp,
                onClick = {
                }) {
                Box(
                    modifier = Modifier,
                    contentAlignment = Alignment.Center
                ) {
                    BasicText(text = "History", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.Bold)

                }
            }

            Card(shape = MaterialTheme.shapes.small,
                backgroundColor = Color.LightGray,
                modifier = Modifier.fillMaxHeight()
                    .weight(1f),
                elevation = 5.dp,
                onClick = {
                }) {

                Box(
                    modifier = Modifier,
                    contentAlignment = Alignment.Center
                ) {
                    BasicText(
                        text = "Transaction Summary",
                        color = Color.Gray,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }



        Spacer(modifier = Modifier.height(16.dp))

        Divider()

        Spacer(modifier = Modifier.height(25.dp))



        Box(modifier = Modifier.fillMaxWidth()){
            SearchField(
                value = "Search",
                onValueChange = {},
                SearchFieldTextColor = Color.Black,
                SearchFieldBackgroundColor = Color.LightGray
            )
        }


        Spacer(modifier = Modifier.height(25.dp))

        Column(modifier = Modifier
            .background(Color.LightGray, RoundedCornerShape(20.dp))
            .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ){
            DateText(text = "May 24, 2022", color = Color.Gray, fontSize = 14.sp, fontWeight = FontWeight.Normal)
        }
        Spacer(modifier = Modifier.height(15.dp))

        TransactionCard(time = "14:45PM", customerName = "Emmanuel Rockson \nKwabena Uncle Ebo" +
                "", contactNumber = "0244 123 4567", image = R.drawable.mtn, isSuccess = true, personal = "Personal Cool your heart wai")
        
        Spacer(modifier = Modifier.height(32.dp))
        
        TransactionCard(time = "14:45PM", customerName = "Absa Bank" +
                "", contactNumber = "0244 123 4567", image = R.drawable.absa, isSuccess = false, personal = "Other Cool your heart wai")

        Spacer(modifier = Modifier.height(50.dp))

        Column(modifier = Modifier
            .background(Color.LightGray, RoundedCornerShape(20.dp))
            .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ){
            DateText(text = "May 23, 2022", color = Color.Gray, fontSize = 14.sp, fontWeight = FontWeight.Normal)
        }


        Spacer(modifier = Modifier.height(40.dp))

        TransactionCard(time = "14:45PM", customerName = "Emmanuel Rockson" +
                "", contactNumber = "0244 123 4567", image = R.drawable.mtn, isSuccess = true, personal = "Personal Cool your heart wai")


        Spacer(modifier = Modifier.height(32.dp))

        TransactionCard(time = "14:45PM", customerName = "Emmanuel Rockson" +
                "", contactNumber = "0244 123 4567", image = R.drawable.mtn, isSuccess = true, personal = "Personal Cool your heart wai")


    }

}