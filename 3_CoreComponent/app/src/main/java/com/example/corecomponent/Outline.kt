package com.example.corecomponent

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SimpleOutlineField() {

    var text by remember {
        mutableStateOf("")
    }
    val rainbow = listOf(
        Color.Red,
        Color.Cyan,
        Color.Blue,
        Color.Yellow,
        Color.Gray
    )

    //textfield
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = {
                Text("enter your email")
            },
            placeholder = {
                Text("example@gmail.com")
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedLabelColor = Color.Red,
                unfocusedLabelColor = Color.Black,
                focusedPlaceholderColor = Color.Green,
                focusedBorderColor = Color.Blue
            )

        )

    }


}

@Composable
fun PasswordField() {
    var password by rememberSaveable {
        mutableStateOf("")
    }

    Box(modifier = Modifier.size(600.dp), contentAlignment = Alignment.BottomCenter){
        TextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = {
                Text("enter your pass")
            },
            visualTransformation = PasswordVisualTransformation()
            , keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )

        )

    }
}

@Preview(showSystemUi = true)
@Composable
fun GetPreview() {
    SimpleOutlineField()
    PasswordField()

}