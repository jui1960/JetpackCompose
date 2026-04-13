package com.example.job1

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun ProductItem (
    product: Product,
    onItemClick: (Product) -> Unit

) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp)
            .clickable { onItemClick(product) },
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)

    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            AsyncImage(
                model = product.image ?: "https://via.placeholder.com/300",
                contentDescription = product.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .padding(8.dp)
                    .clip(
                        RoundedCornerShape(16.dp)
                    )
                    .background(
                        Color(0xFFF8F9FA)
                    ),
                contentScale = ContentScale.Crop
            )
            Text(
                text = product.title,
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF212121),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 12.dp, top = 8.dp)
            )

            // Description
            Text(
                text = product.description,
                fontSize = 12.sp,
                color = Color(0xFF616161),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 12.dp, top = 8.dp)

            )

            // Price
            Text(
                text = "$${product.price}",
                fontSize = 18.sp,
                fontWeight = FontWeight.Black,
                color = Color(0xFF2E7D32),
                modifier = Modifier.padding(start = 12.dp, top = 8.dp)
            )


        }


    }

}


