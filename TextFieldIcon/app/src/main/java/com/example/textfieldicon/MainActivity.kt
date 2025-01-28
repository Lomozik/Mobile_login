package com.example.textfieldicon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.textfieldicon.ui.theme.Component.OutlinedTextFieldWithTrailingIcon
import com.example.textfieldicon.ui.theme.TextFieldIconTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextFieldIconTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DemoApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
fun btn_on_click()
{

}

@Composable
fun DemoApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(start = 8.dp, end = 8.dp)
    )
    {
        /*OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("User") },
            modifier = Modifier.fillMaxWidth()
            trailingIcon = {
                Icon(Icons.Filled.Person, contentDescrition = "User login icon")
            }
        )*/
        OutlinedTextFieldWithTrailingIcon("Username", Icons.Filled.Email, KeyboardType.Email, "Email Icon")
        OutlinedTextFieldWithTrailingIcon("Password", Icons.Filled.Lock, KeyboardType.Password,"Lock/Password Icon", true)
        Button({ btn_on_click() }, modifier.padding(start = 1.dp)) {
            Text("Login")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TextFieldIconTheme {
        DemoApp()
    }
}