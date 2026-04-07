package com.example.corecomponent

import android.R
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

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
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {


        Text(
            text = buildAnnotatedString {
                append(
                    "hei my name is \n"
                )
                withStyle(
                    SpanStyle(
                        brush = Brush.linearGradient(
                            colors = rainbow
                        )
                    )
                ) {
                    append("Jannati Akter Jui\n")
                }
                append("ask any question")

            },
        )
    }

    //animation scroll hobe horigentally
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter
    ) {
        Text(
            "Hello my name is jannati akter jui",
            modifier = Modifier.basicMarquee(),
            fontSize = 50.sp,
            style = TextStyle(
                shadow = Shadow(color = Color.Red, blurRadius = 40f)
            )
        )
    }


    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopStart
    ) {
        Text(
            "jetpack compose is a google toolkit".repeat(50),
            fontSize = 50.sp,
            overflow = TextOverflow.Ellipsis,
            maxLines = 2,
            style = TextStyle(
                shadow = Shadow(color = Color.Green, blurRadius = 40f)
            )

        )
    }

}

@Preview(showSystemUi = true)
@Composable
fun Preview() {
    GradianText()
}