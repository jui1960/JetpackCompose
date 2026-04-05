package com.example.basicjetpackcompose

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Greeting() {
    Text(text = "hello Android Developer")

}
@Preview(showSystemUi = true)
@Composable
fun GreetingPreview(){
    Greeting()
}
