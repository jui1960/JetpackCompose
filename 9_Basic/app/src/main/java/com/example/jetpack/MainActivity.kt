package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavigation()
/*
            NoteAppExample()
*/
        }
    }

}

@Composable
fun AppNavigation() {
    var showLoginScreen by remember { mutableStateOf(true) }


    if (showLoginScreen) {
        LoginScreen(
            onSignUpClick = {
                showLoginScreen = false
            }
        )
    } else {
        SignUpScreen(
            onLoginClick = {
                showLoginScreen = true
            }

        )
    }
}



