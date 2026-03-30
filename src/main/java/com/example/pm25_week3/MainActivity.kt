package com.example.pm25_week3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pm25_week3.ui.theme.Pm25week3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Pm25week3Theme {

                // STATE
                var name by remember { mutableStateOf("") }
                var result by remember { mutableStateOf("") }

                // UI
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp),
                    verticalArrangement = Arrangement.Center
                ) {

                    // INPUT
                    OutlinedTextField(
                        value = name,
                        onValueChange = { name = it },
                        label = { Text("Enter your name") },
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    // BUTTON
                    Button(
                        onClick = {
                            result = "Hello, $name"
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Say Hello")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // OUTPUT
                    Text(
                        text = result,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }
}