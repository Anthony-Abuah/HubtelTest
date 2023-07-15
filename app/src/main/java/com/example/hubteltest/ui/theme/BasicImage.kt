package com.example.hubteltest.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.example.hubteltest.ui.theme.Constants.noValue

@Composable
fun BasicImage(
    image: Int

) {
    Image(painter = painterResource(id = image), contentDescription = noValue )
}