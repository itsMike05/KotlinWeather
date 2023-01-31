package com.itsmike.weatherkotlin

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.itsmike.weatherkotlin.ui.theme.DarkBlue

@Composable
fun WeatherInfoItem (@DrawableRes iconRes: Int, title: String, titleValue: String, modifier: Modifier) {

    Row(modifier = modifier) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier
                .padding(end = 6.dp)
                .width(40.dp),
        )
        Column {
            Text(text = title, color = Color.Gray)
            Text(text = titleValue, color = DarkBlue, fontWeight = FontWeight.Bold)
        }
    }
    
    
}