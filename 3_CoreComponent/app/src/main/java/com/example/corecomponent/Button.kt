package com.example.corecomponent

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//filled button,tonal button,outline button,Elevated button
@Preview(showSystemUi = true)
@Composable
fun FilledButton() {
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {


            Spacer(modifier = Modifier.padding(top = 20.dp))
            Button(onClick = {
                Toast.makeText(context, "Button clicked", Toast.LENGTH_SHORT).show()
            }) {
                Text(
                    "Feild Butto",
                    fontSize = 30.sp
                )
            }




            FilledTonalButton(onClick = {
            }) {
                Text(
                    "Tonal Button",
                    fontSize = 30.sp
                )

            }


            OutlinedButton(onClick = {
                Toast.makeText(context, "Button clicked", Toast.LENGTH_SHORT).show()


            }) {
                Text("Outline button")
            }




            ElevatedButton(
                onClick = {
                    Toast.makeText(context, "Elevated button", Toast.LENGTH_SHORT).show()

                }, colors = ButtonDefaults.buttonColors(Color.Cyan, Color.Black)
            ) {
                Text("Elevated button")
            }






            TextButton(onClick = {
                Toast.makeText(context, "Elevated button", Toast.LENGTH_SHORT).show()
            }) {
                Text("Text button")
            }


            FloatingActionButton(
                modifier = Modifier.background(Color.Blue),
                onClick = {
                    Toast.makeText(context, "Elevated button", Toast.LENGTH_SHORT).show()


                },
                containerColor = Color.Red,
                contentColor = Color.White
            ) {
                Text("Floating button")
            }


            //icon a click korle button er moto kaj korbe
            IconButton(onClick = {
                Toast.makeText(context, "Elevated button", Toast.LENGTH_SHORT).show()
            },colors = IconButtonDefaults.iconButtonColors(Color.Cyan)){
                Icon(
                    imageVector = Icons.Default.Place,
                    contentDescription = "place",
                    tint = Color.Blue

                )
            }


        }

    }
}

