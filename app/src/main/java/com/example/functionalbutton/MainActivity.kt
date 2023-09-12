package com.example.functionalbutton

import android.content.ContentValues.TAG
import android.media.Image
import android.os.Bundle
import android.util.Log
import androidx.compose.foundation.Image
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.functionalbutton.ui.theme.FunctionalButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FunctionalButtonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Atividade de PAM")

        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Logo do JetpackCompose",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )

        Button(
            modifier = Modifier.fillMaxWidth(0.5f),
            onClick = { Log.d(TAG,"Botão debug pressionado") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF388E3C))) {
            Text(text = "Debug")
        }
        Button(
            modifier = Modifier.fillMaxWidth(0.5f),
            onClick = { Log.i(TAG,"Botão Info pressionado") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF1A237E))) {
            Text(text = "Info")
        }
        Button(
            modifier = Modifier.fillMaxWidth(0.5f),
            onClick = { Log.w(TAG,"Botão warning pressionado") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF6F00))) {
            Text(text = "Warning")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FunctionalButtonTheme {
        MainScreen()
    }
}