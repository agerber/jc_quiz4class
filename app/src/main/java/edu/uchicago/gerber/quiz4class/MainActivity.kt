package edu.uchicago.gerber.quiz4class

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import edu.uchicago.gerber.quiz4class.screens.HomeScreen
import edu.uchicago.gerber.quiz4class.viewmodel.QuizViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

              HomeScreen(viewModel = QuizViewModel(Application()))
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HomeScreen(viewModel = QuizViewModel(Application()))
}