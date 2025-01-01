package com.example.browseropener

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.browseropener.ui.theme.BrowserOpenerTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val data = intent.data
        Log.d("SecondActivity", "URI: $data")

        setContent {
            BrowserOpenerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Final(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Final(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "SecondActivity",
            modifier = modifier
        )
    }
}