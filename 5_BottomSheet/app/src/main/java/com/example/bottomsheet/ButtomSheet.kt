package com.example.bottomsheet


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun BottomSheetShow() {
    var bottomSheet by remember {
        mutableStateOf(false)
    }
    var sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false
    )


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Button(onClick = {
            bottomSheet = true
        }) {
            Text("Open Bottom Sheet")
        }


        if (bottomSheet) {
            ModalBottomSheet(
                modifier = Modifier.fillMaxHeight(), sheetState = sheetState,
                onDismissRequest = {
                    bottomSheet = false
                }
            ) {
                Text(
                    "This is buttom sheet",
                    modifier = Modifier
                        .padding(16.dp)
                        .background(Color.Cyan)
                )

            }
        }
    }

}