package com.itsmike.weatherkotlin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.itsmike.weatherkotlin.ui.theme.LightGray
import com.itsmike.weatherkotlin.ui.theme.LighterGray

@Composable
fun WeatherInfoTable () {
    Column (
        modifier = Modifier
            .padding(top = 15.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(LighterGray)
            ){
        Row(Modifier.padding(16.dp)) {
            WeatherInfoItem(
                iconRes = R.drawable.ic_humidity,
                title = "Humidity",
                titleValue = "72%",
                modifier = Modifier.weight(1f)
            )
            WeatherInfoItem(
                iconRes = R.drawable.ic_wind,
                title = "Wind Speed",
                titleValue = "3.1 m/s",
                modifier = Modifier.weight(1f)
            )
        }
        Divider(
            color = LightGray,
            modifier = Modifier
                .height(5.dp))
        Row(Modifier.padding(16.dp)) {
            WeatherInfoItem(
                iconRes = R.drawable.ic_sunrise,
                title = "Sunrise",
                titleValue = "7:13 AM",
                modifier = Modifier.weight(1f)
            )
            WeatherInfoItem(
                iconRes = R.drawable.ic_sunset,
                title = "Sunset",
                titleValue = "4:58 PM",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview (showBackground = true, widthDp = 390, heightDp = 800)
@Composable
fun TablePreview() {
    WeatherInfoTable()
}