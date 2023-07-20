package com.example.hubteltest.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AddFloatingActionButton(
    navigateTo: () -> Unit
){
    FloatingActionButton(onClick = navigateTo,
        shape = RoundedCornerShape(15.dp),
        backgroundColor = Teal200
    ) {
        Row(modifier = Modifier.padding(12.dp)) {
            Box(modifier = Modifier.background(Color.White, CircleShape), contentAlignment = Alignment.Center){
                Icon(imageVector = Icons.Default.Add, tint = Teal200, contentDescription = "")
            }

            Spacer(modifier = Modifier.padding(4.dp))
            BasicText(text = "SEND NEW", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
        }

    }
}