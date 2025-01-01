package com.example.browseropener

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.browseropener.ui.theme.BrowserOpenerTheme

class FirstActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BrowserOpenerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Opener(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Opener(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Column {
        Text(
            text = "FirstActivity",
            modifier = modifier
        )
        Button(
            onClick = {
                val browseIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bbc.com/"))
                context.startActivity(browseIntent)
            },
            enabled = true,
        ) {
            Text("Browser")
        }
    }
}