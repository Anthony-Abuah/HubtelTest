package com.example.hubteltest.ui.theme

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit

@Composable
fun BasicText(
    text: String,
    color: Color,
    fontSize: TextUnit,
    fontWeight: FontWeight

) {
    Text(text = text,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight

    )
}

@Composable
fun DateText(
    text: String,
    color: Color,
    fontSize: TextUnit,
    fontWeight: FontWeight

) {
    Text(text = text,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        textAlign = TextAlign.Start

    )
}