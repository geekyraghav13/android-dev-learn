package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.captaingame.ui.theme.CaptainGAMETheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptainGAMETheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    captaingame(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun captaingame(modifier: Modifier = Modifier) {
    val treasureFound = remember { mutableStateOf(0) }
    val direction = remember { mutableStateOf("North") }

    Column(modifier = modifier.padding(16.dp)) {
        Text("Treasure Found: ${treasureFound.value}")
        Text("Current Direction: ${direction.value}")

        Button(onClick = {
            direction.value = "East"
            if (Random.nextBoolean()) treasureFound.value += 1
        }) {
            Text("Sail East")
        }
        Button(onClick = {
            direction.value = "West"
            if (Random.nextBoolean()) treasureFound.value += 1
        }) {
            Text("Sail West")
        }
        Button(onClick = {
            direction.value = "North"
            if (Random.nextBoolean()) treasureFound.value += 1
        }) {
            Text("Sail North")
        }
        Button(onClick = {
            direction.value = "South"
            if (Random.nextBoolean()) treasureFound.value += 1
        }) {
            Text("Sail South")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun captaingamePreview() {
    CaptainGAMETheme {
        captaingame()
    }
}
