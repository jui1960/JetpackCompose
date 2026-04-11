package com.example.cards

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun ElavetedCard() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                10.dp
            ), modifier = Modifier
                .size(height = 300.dp, width = 300.dp),
            colors = CardDefaults.elevatedCardColors(
                containerColor = Color.Cyan,
                contentColor = Color.DarkGray
            )

        ) {
            Text(
                "This is Elevated card",
                modifier = Modifier.padding(10.dp),
                textAlign = TextAlign.Center
            )
        }

    }

}