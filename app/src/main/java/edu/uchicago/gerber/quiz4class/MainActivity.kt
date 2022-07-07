package edu.uchicago.gerber.quiz4class

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import edu.uchicago.gerber.quiz4class.screens.HomeScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
              HomeScreen()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HomeScreen()
}