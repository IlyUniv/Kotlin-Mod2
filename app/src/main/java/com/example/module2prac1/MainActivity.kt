package com.example.module2prac1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.wear.tooling.preview.devices.WearDevices
import com.example.module2prac1.ui.theme.Module2Prac1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Module2Prac1Theme {
                Column() {
                    Hello("Мир")
                    Hello(null)
                }
            }
        }
    }
}

@Composable
fun Hello(name: String?) {
    Text(
        text = if (name != null) "Привет, $name!" else "Имя не задано",
        modifier = Modifier.padding(20.dp)
    )
}

@Preview(
    name = "Portrait",
    showSystemUi = true,
    device = Devices.PHONE
)
@Preview(
    name = "Landscape",
    showSystemUi = true,
    device = "spec:width=411dp,height=891dp,orientation=landscape"
)
@Preview(
    name = "Round",
    showSystemUi = true,
    showBackground = true,
    backgroundColor = 0xffffff00,
    device = "spec:width=200dp,height=200dp,isRound=true"
)
@Composable
fun HelloPreview() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Hello("Мир")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Module2Prac1Theme {
        Greeting("Android")
    }
}