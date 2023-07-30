package com.example.composereview.ui.composable

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.composereview.ui.theme.Orange
import com.example.composereview.ui.theme.Rubik

@Composable
fun TextButton(
    text: String,
    clickOn: () -> Unit
) {

    Text(
        text = text,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        fontFamily = Rubik,
        color = Orange,
        modifier = Modifier.clickable { clickOn() }
    )
}