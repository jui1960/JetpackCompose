package com.example.dialog

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
@Composable
fun ModernAlertDialog(show: Boolean, onDismiss: () -> Unit) {
    if (show) {
        AlertDialog(
            icon = {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "Info Icon",
                    tint = Color.Blue
                )
            },
            title = {
                Text(text = "App Update Available")
            },
            text = {
                Text("A new version of the app is available. Would you like to update now?")
            },
            onDismissRequest = {

                onDismiss()
            },
            confirmButton = {
                Button(onClick = {
                    onDismiss()
                }) {
                    Text("Update Now")
                }
            },
            dismissButton = {
                OutlinedButton(onClick = { onDismiss() }) {
                    Text("Later")
                }
            }
        )
    }
}