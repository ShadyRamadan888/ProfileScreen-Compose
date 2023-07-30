package com.example.composereview.ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composereview.R
import com.example.composereview.ui.composable.Header
import com.example.composereview.ui.composable.InformationCard
import com.example.composereview.ui.composable.SpacerVertical24
import com.example.composereview.ui.composable.SpacerVertical32
import com.example.composereview.ui.composable.TextButton
import com.example.composereview.ui.theme.Green
import com.example.composereview.ui.theme.Rubik


@Composable
fun ProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 32.dp, horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header(title = "Account", subTitle = "Edit or manage your account")
        SpacerVertical32()
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "profile picture",
            modifier = Modifier
                .clip(shape = RoundedCornerShape(16.dp))
                .size(width = 128.dp, height = 128.dp)
        )
        SpacerVertical24()
        TextButton(text = "Change profile picture") {

        }
        SpacerVertical32()
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(modifier = Modifier.weight(1f)) {
                InformationCard(title = "Firstname", information = "Shady")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box(modifier = Modifier.weight(1f)) {
                InformationCard(title = "Lastname", information = "Mohamed")
            }
        }
        InformationCard(title = "Location", information = "Cairo, Egypt")
        InformationCard(title = "Email", information = "shady@gmail.com")
        InformationCard(title = "Phone", information = "+201156477320")
        Spacer(modifier = Modifier.weight(1f))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            colors = ButtonDefaults.buttonColors(Green),
            shape = RoundedCornerShape(16.dp),
            onClick = { /*TODO*/ }
        ) {
            Text(
                text = "Save",
                color = Color.White,
                fontFamily = Rubik,
                fontWeight = FontWeight.Medium,
            )
        }
    }
}