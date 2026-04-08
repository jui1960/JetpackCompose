package com.example.corecomponent

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink

@Composable
fun TextSelectable() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        SelectionContainer {
            Column {
                Text("lorem150 is a shorthand command")
                Text("lorem150 is a shorthand command")
                Text("lorem150 is a shorthand command")
                DisableSelection {
                    Text("jui")
                    Text("my name is jannati akter jui")
                }
            }

        }
    }
}

@Composable
fun TextInsideLink() {
    val urihander = LocalUriHandler.current
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(
            buildAnnotatedString {
                append("Details")
                val link = LinkAnnotation.Url(
                    "https://developer.android.com/compose",
                    TextLinkStyles(
                        SpanStyle(
                            color = Color.Blue
                        )
                    )
                ) {
                    val url = (it as LinkAnnotation.Url).url
                    urihander.openUri(url)
                }
                withLink(
                    link
                )
                {
                    append("jetpack compose")
                }

            }

        )
    }

}