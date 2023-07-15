package com.example.hubteltest.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun SearchField(
    value: String,
    onValueChange: (value: String) -> Unit,
    SearchFieldTextColor: Color,
    SearchFieldBackgroundColor: Color,
){
    TextField(
        modifier = Modifier.requiredHeight(50.dp).fillMaxWidth(),
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "")
        },
        colors = TextFieldDefaults.textFieldColors(
            textColor = SearchFieldTextColor,
            backgroundColor = SearchFieldBackgroundColor,
            trailingIconColor = Color.Black

        ),
        shape = RoundedCornerShape(6.dp),
        placeholder = {
            Text(text = "Search")
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Search
        ),

        value = value,
        onValueChange = {newValue->
            onValueChange(newValue)
    })
}