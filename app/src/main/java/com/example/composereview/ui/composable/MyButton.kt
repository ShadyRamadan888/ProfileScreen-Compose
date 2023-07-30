package com.example.composereview.ui.composable

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyButton() {

    Button(
        onClick = {}) {
        Text(text = "Hello")
    }
}

@Preview
@Composable
fun PreviewMyButton() {
    MyButton()
}
