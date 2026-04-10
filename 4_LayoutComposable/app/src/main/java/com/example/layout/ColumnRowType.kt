package com.example.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun LazyColumnExample() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Lazy Column")

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.Green),
            contentPadding = PaddingValues(6.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(100) { index ->
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Text(
                    "Item ${index}",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                        .background(Color.Cyan)
                )
            }

        }

    }

    LazyColumn {
        item {
            Text("Active Users", style = MaterialTheme.typography.headlineMedium)
        }

        // Sticky Header (Eita upore chepe thakbe)
        stickyHeader {
            Text(
                "Category A", modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
            )
        }

        items(5) { index -> Text("User $index") }
    }

}


@Preview(showSystemUi = true)
@Composable
fun LazyRowExample() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center
    ) {
        Text("Lazy Row", modifier = Modifier.padding(bottom = 10.dp))
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            items(100) { index ->
                Text(
                    "Hello user ${index}",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color.Cyan)
                )
            }
        }
    }

}


