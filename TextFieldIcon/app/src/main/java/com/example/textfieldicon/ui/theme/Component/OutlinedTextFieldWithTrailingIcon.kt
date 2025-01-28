package com.example.textfieldicon.ui.theme.Component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun OutlinedTextFieldWithTrailingIcon(label:String, icon:ImageVector, keybrdType:KeyboardType, contentDesc:String = "", password:Boolean = false){
    var valueOfField by remember { mutableStateOf("") }
    OutlinedTextField(
        value = valueOfField,
        onValueChange = { valueOfField = it},
        label = { Text(label) },
        modifier = Modifier.fillMaxWidth(),
            trailingIcon = {
                Icon(icon, contentDescription = contentDesc)
            },
        keyboardOptions = KeyboardOptions(keyboardType = keybrdType),
        visualTransformation = if (password) PasswordVisualTransformation() else VisualTransformation.None,
    )
}