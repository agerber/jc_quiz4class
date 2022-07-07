package edu.uchicago.gerber.quiz4class.viewmodel


import android.app.Application
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.uchicago.gerber.quiz4class.model.Question
import kotlinx.coroutines.*
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class QuizViewModel  : ViewModel() {

    //this value used on the HomeScreen
    private var _playerName = mutableStateOf("Adam")
    //setting the value of a mutable state is easy, but to get it, you need to use state
    val playerName: State<String> = _playerName


    //////////////////////////////////
    //methods for HomeScreen
    //////////////////////////////////
    fun setPlayerName(name: String) {
            _playerName.value = name

    }


}

