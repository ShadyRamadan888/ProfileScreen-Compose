package com.example.composereview.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.composereview.ui.theme.PrimaryTextColor
import com.example.composereview.ui.theme.Rubik
import com.example.composereview.ui.theme.SecondaryTextColor

@Composable
fun Header(title:String,subTitle:String){
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = title,
            fontSize = 18.sp,
            color = PrimaryTextColor,
            fontFamily = Rubik,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = subTitle,
            fontFamily = Rubik,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            color = SecondaryTextColor
        )
    }
}