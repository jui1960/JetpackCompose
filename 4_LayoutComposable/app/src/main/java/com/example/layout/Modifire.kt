package com.example.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun ModifireExample() {

    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {

        Text(
            "hello",
            color = Color.Cyan,
            modifier = Modifier
                .background(Color.Red)
                .padding(10.dp),
            fontSize = 20.sp
        )

    }

}