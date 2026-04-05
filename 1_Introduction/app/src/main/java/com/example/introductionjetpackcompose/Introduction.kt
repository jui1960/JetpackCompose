package com.example.introductionjetpackcompose

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Greeting(){
    Text(text = "Jetpack compose is google mordern toolkit for building native android UI " +
            "and multiplatfrom UI using CMP(compose multiplatfrom)")
    Text(text = "@Composable is an annotation used in Jetpack Compose to mark a function that builds part of the user interface.")
    Text(text = "@Preview is an annotation in Jetpack Compose that lets you see your UI on the screen without running the app.")



}