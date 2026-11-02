package com.example.module2prac1

import android.icu.number.FormattedNumber
import android.os.Bundle
import android.telephony.ParsedPhoneNumber
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.module2prac1.ui.theme.Module2Prac1Theme

class Task7Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Module2Prac1Theme {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.TopCenter,
                ) {
                    Column() {
                        Spacer(Modifier.height(40.dp))

                        /*
                        PersonRecord(
                            "Евгений",
                            "Андреевич",
                            "Лукашин",
                            "+7 495 495 95 95",
                            "г. Москва, 3-я улица Строителей, д. 25, кв. 12"
                        )


                        PersonRecordFramed(
                            "Евгений",
                            "Андреевич",
                            "Лукашин",
                            "+7 495 495 95 95",
                            "г. Москва, 3-я улица Строителей, д. 25, кв. 12"
                        )
                        PersonRecordFramed(
                            "Василий",
                            "Игоревич",
                            "Кузякин",
                            null,
                            "Ивановская область, дер. Крутово, д. 4"
                        )
                        PersonRecordFramed(
                            "Людмила",
                            "Прокофьевна",
                            "Калугина",
                            "+7 495 788 78 78",
                            "Москва, Большая Никитская, д. 43, кв. 290"
                        )
                        */

                        PersonRecordWithIcon(
                            "Евгений",
                            "Андреевич",
                            "Лукашин",
                            "+7 495 495 95 95",
                            "г. Москва, 3-я улица Строителей, д. 25, кв. 12"
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun PersonRecordText(text: String) {
    Text(
        text,
        fontSize = 14.sp,
        lineHeight = 16.sp
    )
}

@Composable
fun PersonRecord(
    firstName: String,
    middleName: String,
    lastName: String,
    phoneNumber: String?,
    fullAddress: String,
    modifier: Modifier = Modifier,
    centerText: Boolean = false,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = if (centerText) Alignment.CenterHorizontally else Alignment.Start
    ) {
        PersonRecordText(
            "Имя: $firstName"
        )
        PersonRecordText(
            "Отчество: $middleName"
        )
        PersonRecordText(
            "Фамилия: $lastName"
        )
        PersonRecordText(
            "Мобильный телефон: ${phoneNumber?:"--"}"
        )
        PersonRecordText(
            "Адрес: $fullAddress"
        )
    }
}

@Composable
fun PersonRecordFramed(
    firstName: String,
    middleName: String,
    lastName: String,
    phoneNumber: String?,
    fullAddress: String
) {
    Box(
        Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(Color.LightGray),
        Alignment.Center
    ) {
        PersonRecord(
            firstName,
            middleName,
            lastName,
            phoneNumber,
            fullAddress,
            Modifier.padding(10.dp),
            true
        )
    }
}

@Composable
fun PersonRecordWithIcon(
    firstName: String,
    middleName: String,
    lastName: String,
    phoneNumber: String?,
    fullAddress: String
) {
    Box(
        Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(Color.LightGray),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().padding(10.dp)
        ) {
            PersonRecord(
                firstName,
                middleName,
                lastName,
                phoneNumber,
                fullAddress,
                Modifier.weight(1f),
                centerText = true
            )
            Image(
                painter = painterResource(R.drawable.baseline_star_rate_24),
                contentDescription = null,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}