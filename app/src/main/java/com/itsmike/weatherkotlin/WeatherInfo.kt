package com.itsmike.weatherkotlin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.itsmike.weatherkotlin.ui.theme.DarkBlue
import com.itsmike.weatherkotlin.ui.theme.WeatherKotlinTheme

@Composable
fun WeatherInfo() {
    Column (modifier = Modifier
        .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
            ) {
        Text(
            text = "17°C",
            color = DarkBlue,
            fontFamily = FontFamily.SansSerif,
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold)
        Text(
            modifier = Modifier
                .padding(top = 16.dp),
            text = "Bydgoszcz, Poland",
            color = DarkBlue,
            fontFamily = FontFamily.SansSerif,
            fontSize = 25.sp,
            fontWeight = FontWeight.Medium)
    }
}

@Preview (showBackground = true, widthDp = 390, heightDp = 800)
@Composable
fun InfoPreview() {
        WeatherInfo()
}