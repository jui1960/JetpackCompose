package com.example.corecomponent

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Preview(showSystemUi = true)
@Composable
fun LoginPage() {
    val context = LocalContext.current


    var email by remember {
        mutableStateOf("")
    }

    var password by rememberSaveable {
        mutableStateOf("")}
    var passwordVisible by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter,
    ) {

        Column(horizontalAlignment = Alignment.CenterHorizontally) {


            Spacer(modifier = Modifier.padding(top = 100.dp))
            Text(
                "Login Page", fontSize = 30.sp,
                style = TextStyle(color = Color.Red)
            )


            Spacer(modifier = Modifier.padding(top = 50.dp))
            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                },
                label = {
                    Text("Enter your email")
                },
                placeholder = {
                    Text("@example.com")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Cyan,
                    unfocusedBorderColor = Color.Green,
                    focusedLabelColor = Color.Red,
                    unfocusedLabelColor = Color.Cyan,
                    focusedPlaceholderColor = Color.Green,
                    unfocusedPlaceholderColor = Color.Yellow


                )


            )

            Spacer(modifier = Modifier.padding(top = 10.dp))
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                label = {
                    Text("Enter your password")
                },
                visualTransformation = if(passwordVisible)
                    VisualTransformation.None
                else PasswordVisualTransformation(),
                placeholder = {
                    Text("password")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Cyan,
                    unfocusedBorderColor = Color.Green,
                    focusedLabelColor = Color.Red,
                    unfocusedLabelColor = Color.Cyan,
                    focusedPlaceholderColor = Color.Green,
                    unfocusedPlaceholderColor = Color.Yellow
                )

            )

            Spacer(modifier = Modifier.padding(top = 30.dp))
            ElevatedButton(
                onClick = {
                    Toast.makeText(context, "login succesfull", Toast.LENGTH_SHORT).show()
                },
                contentPadding = PaddingValues(horizontal = 40.dp, vertical = 10.dp),
                colors = ButtonDefaults.buttonColors(Color.Cyan, Color.Black)

            ) {
                Text(
                    "Login",
                    style = TextStyle(
                        fontSize = 15.sp
                    )
                )
            }


        }


    }


}


