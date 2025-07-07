package com.example.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.unitconverter.ui.theme.UnitconverterTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.ui.Alignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitconverterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    unitConverter(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun unitConverter(name: String, modifier: Modifier = Modifier) {
    var input by remember { mutableStateOf("") }

    Column(

        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally



    ) {
        Text("Unit Converter")
        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text("Enter value") }
        )

        Row {
            Box{
                Button(onClick = { }) {
                    Text( "Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow")


                }
            }
            Box{
                Button(onClick = { }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow")

                }

                }

        }

        Text("Result: ")
    }
}

@Preview(showBackground = true)
@Composable
fun unitConverterPreview(){
    unitConverter(name = "R")
}
