package com.example.inputchip

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InputChipExample() {
    var chip by remember {
        mutableStateOf(true)

    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        if (chip) {
            InputChip(
                selected = true,
                onClick = {
                    chip = !chip
                },
                label = {
                    Text("Jannati")
                },
                avatar = {
                    Icon(
                        Icons.Default.Person, contentDescription = null,
                        Modifier.size(InputChipDefaults.AvatarSize)
                    )

                },
                trailingIcon = {
                    IconButton(onClick = { chip = false }) {
                        Icon(
                            Icons.Default.Close, contentDescription = "close",
                            Modifier.size(InputChipDefaults.IconSize)
                        )
                    }
                },
                modifier = Modifier.padding(8.dp)
            )

        }

    }
}