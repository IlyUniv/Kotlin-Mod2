package com.example.module2prac1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.module2prac1.ui.theme.Module2Prac1Theme

class Task4Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Module2Prac1Theme {
                Column() {
                    Spacer(modifier = Modifier.height(40.dp))
                    Task4Button()
                }
            }
        }
    }
}

@Preview
@Composable
fun Task4Button() {
    TextButton(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                4.dp,
                RoundedCornerShape(16.dp)
            ),
        colors = ButtonColors(
            Color.LightGray,
            Color.LightGray,
            Color.LightGray,
            Color.LightGray
        ),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, Color.Gray)

    ) {
        Text(
            text = "Нажми на меня",
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
}