package com.example.jetpack

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun NoteAppExample() {

    var notes by remember {
        mutableStateOf(listOf<String>())
    }

    var currentNote by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()

            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "Note App", fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier =
                Modifier.padding(bottom = 16.dp)
        )
        Text(
            "Total : ${notes.size} notes",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        OutlinedTextField(
            value = currentNote,
            onValueChange = {
                currentNote = it
            },
            label = { Text("Enter a note") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))


        Button(
            onClick = {
                if (currentNote.isNotBlank()) {
                    notes = notes + currentNote
                    currentNote = ""
                }
            }, colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF673AB7)
            )
        ) {
            Text(
                "Add Note", fontSize = 16.sp, color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.padding(17.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(notes) { note ->


                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    colors = CardDefaults.cardColors(Color.LightGray),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = note,
                        modifier = Modifier.padding(16.dp), fontSize = 18.sp
                    )

                }
            }
        }


    }


}