package com.example.hubteltest.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hubteltest.R
import com.example.hubteltest.ui.theme.Constants.cardPaddingValues

@Composable
fun TransactionCard (
    time: String,
    customerName: String,
    personal: String,
    contactNumber: String,
    amount: String,
    image: Int,
    isSuccess: Boolean
){
    Card(modifier = Modifier,
        border = BorderStroke(1.dp, Color.Gray),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(5.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                BasicText(
                    text = time,
                    color = Color.LightGray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light
                )
            }

            Spacer(modifier = Modifier.height(cardPaddingValues))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(cardPaddingValues)
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.White)
                ) {
                    BasicImage(image = image)
                }

                Spacer(modifier = Modifier.width(2.dp))

                Column(modifier = Modifier.weight(5f)) {
                    BasicText(
                        text = customerName,
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    BasicText(
                        text = contactNumber,
                        color = Color.Gray,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Light
                    )
                }

                Spacer(modifier = Modifier.width(2.dp))

                Column(modifier = Modifier.weight(2f).padding(end = 16.dp),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Center
                ) {
                        if (isSuccess) {
                            Successful()
                            Spacer(modifier = Modifier.height(4.dp))
                            Box(modifier = Modifier, contentAlignment = Alignment.CenterEnd){
                                BasicText(
                                    text = amount,
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                        } else {

                            Fail()
                            Spacer(modifier = Modifier.height(4.dp))
                            Box(modifier = Modifier, contentAlignment = Alignment.CenterEnd){
                                BasicText(
                                    text = amount,
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                        }

                }
            }

                Spacer(modifier = Modifier.height(8.dp))

                Divider(
                    modifier = Modifier
                        .padding(cardPaddingValues)
                )

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {

                    Box(
                        modifier = Modifier
                            .padding(cardPaddingValues)
                            .height(30.dp)
                            .width(30.dp)
                            .background(Purple200, RoundedCornerShape(20.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        BasicImage(image = R.drawable.person)
                    }

                    Spacer(modifier = Modifier.width(8.dp))



                    Box(modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        BasicText(
                            text = personal,
                            color = Color.Black,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Box(
                        modifier = Modifier
                            .padding(6.dp)
                            .height(25.dp)
                            .width(25.dp),
                        contentAlignment = Alignment.CenterEnd
                    ) {
                        BasicImage(image = R.drawable.star)
                    }

                }


            }



    }

}