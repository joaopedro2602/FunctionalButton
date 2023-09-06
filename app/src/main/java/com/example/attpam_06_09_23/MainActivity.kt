package com.example.attpam_06_09_23

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.attpam_06_09_23.ui.theme.AttPAM060923Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AttPAM060923Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {

           Column(
               verticalArrangement = Arrangement.SpaceEvenly,
               horizontalAlignment = Alignment.CenterHorizontally
           ) {
            Text(text = "Atividade de PAM")
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { Log.d(TAG,"Botão debug pressionado") }) {
                    Text(text = "Debug")
            }
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { Log.i(TAG,"Botão Info pressionado") }) {
                Text(text = "Info")
           }
            Button(
                 modifier = Modifier.fillMaxWidth(),
                 onClick = { Log.w(TAG,"Botão warning pressionado") }) {
                 Text(text = "Warning")
           }
           }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AttPAM060923Theme {
        App()
    }
}