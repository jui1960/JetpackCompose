package com.example.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout


@Preview(showSystemUi = true)
@Composable
fun ColumnExample() {
    CompositionLocalProvider(LocalContentColor provides Color.Blue) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan)
                .padding(50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text("Text1")
            Text("Text1")
            Text("Text1")
            Text("Text1")
            Text("Text1")
            Text("Text1")
            Text("Text1")
            Text("Text1")
            Text("Text1")
            Text("Text1")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun RowExample() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
            .padding(20.dp),
        horizontalArrangement =
            Arrangement.spacedBy(5.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(5) { index ->
            Text("hello  ${index + 10}")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun BoxExample() {
    Box(
        modifier = Modifier
            .size(300.dp)
            .background(color = Color.Red), contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(color = Color.Cyan)
        ) {

        }


    }
}

@Preview(showSystemUi = true)
@Composable
fun TextConstraintExample() {

    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (text1, tex2, tex3) = createRefs()

        Text(
            text = "Constrain layout text1",
            fontSize = 24.sp,
            modifier = Modifier.constrainAs(text1) {
                top.linkTo(parent.top, margin = 50.dp)
                start.linkTo(parent.start, margin = 30.dp)
                end.linkTo(parent.end)

            })

        Text(
            text = "Constrain layout text2",
            fontSize = 20.sp,
            modifier = Modifier.constrainAs(tex2) {
                top.linkTo(text1.bottom, margin = 10.dp)
                start.linkTo(text1.start)
                end.linkTo(text1.end)
            }
        )
        Text(
            text = "constrain layout tex3",
            fontSize = 20.sp,
            modifier = Modifier.constrainAs(tex3) {

                top.linkTo(tex2.bottom, margin = 10.dp  )
                start.linkTo(parent.start)

            })
    }
}

