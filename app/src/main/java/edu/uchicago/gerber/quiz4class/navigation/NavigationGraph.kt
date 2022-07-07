package com.Stats.Football.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.uchicago.gerber.quiz.navigation.Screen

import edu.uchicago.gerber.quiz4class.viewmodel.QuizViewModel

@Composable
fun NavigationGraph(navController: NavHostController) {
    val viewModel: QuizViewModel = viewModel()
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(route = Screen.HomeScreen.route) {
          //  HomeScreen(navController, viewModel)
        }
        composable(route = Screen.QuestionScreen.route) {
           // QuestionScreen(navController, viewModel)
        }
        composable(route = Screen.ResultScreen.route) {
           // ResultScreen(navController, viewModel)
        }
    }

}