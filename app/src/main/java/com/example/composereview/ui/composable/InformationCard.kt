package com.example.composereview.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composereview.ui.theme.CardBackgroundColor
import com.example.composereview.ui.theme.PrimaryTextColor
import com.example.composereview.ui.theme.Rubik
import com.example.composereview.ui.theme.SecondaryTextColor

@Composable
fun InformationCard(title: String, information: String) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(16.dp),
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Normal,
                fontFamily = Rubik,
                fontSize = 9.sp,
                color = SecondaryTextColor
            )
            Text(
                text = information,
                fontFamily = Rubik,
                fontWeight = FontWeight.Medium,
                color = PrimaryTextColor,
                fontSize = 14.sp
            )
        }
    }
}

