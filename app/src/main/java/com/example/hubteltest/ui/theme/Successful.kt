package com.example.hubteltest.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hubteltest.R
import com.example.hubteltest.ui.theme.Constants.noValue

@Composable
fun Successful(

) {
    Row(modifier = Modifier
        .background(LightGreen, RoundedCornerShape(25.dp))
        .padding(8.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
        ) {
        BasicImage(image = R.drawable.success)
        Spacer(modifier = Modifier.width(2.dp))
        BasicText(text = "Successful", color = Color.Green, fontSize = 12.sp, fontWeight = FontWeight.Normal)
    }
}

@Composable
fun Fail(

) {
    Row(modifier = Modifier
        .background(LightRed, RoundedCornerShape(25.dp))
        .padding(8.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
        ) {
        BasicImage(image = R.drawable.fail)
        Spacer(modifier = Modifier.width(2.dp))
        BasicText(text = "Failed", color = Color.Red, fontSize = 12.sp, fontWeight = FontWeight.Normal)
    }
}