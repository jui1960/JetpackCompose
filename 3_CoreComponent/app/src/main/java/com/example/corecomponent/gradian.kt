package com.example.corecomponent

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun GradianText() {

    val rainbow = listOf(
        Color.Blue,
        Color.Green,
        Color.Red,
        Color.Blue,
        Color.Cyan,
        Color.Red,
        Color.Black,


        )
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

        Text(
            text = buildAnnotatedString {
                append("hei my name is \n")
                withStyle(
                    SpanStyle(
                        brush = Brush.linearGradient(
                            colors = rainbow
                        )
                    )
                ){
                    append("Jannati Akter Jui\n")
                }
                append("\n ask any question")
            }
        )
    }

}

@Preview(showSystemUi = true)
@Composable
fun Preview(){
    GradianText()
}