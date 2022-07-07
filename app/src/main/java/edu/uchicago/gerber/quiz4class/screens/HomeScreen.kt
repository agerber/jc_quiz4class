package edu.uchicago.gerber.quiz4class.screens



import android.app.Activity
import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uchicago.gerber.quiz4class.ui.theme.RedColor
import edu.uchicago.gerber.quiz4class.viewmodel.QuizViewModel


@Composable
fun HomeScreen(viewModel: QuizViewModel) {

    val playerName = viewModel.playerName
    val activity = (LocalContext.current as Activity)

    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text(
                    text = "Capitals Quiz",
                    textAlign = TextAlign.Start,
                )
            },
        )
    }) {


        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 24.dp),
        ) {
            Column {
                Box(modifier = Modifier.height(24.dp))

                Text(
                    text = "Welcome to Capitals Quiz",
                    style = MaterialTheme.typography.h5
                )
                Box(modifier = Modifier.height(40.dp))
                Column(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Text(
                        text = "Your Name",
                        modifier = Modifier.padding(vertical = 8.dp),
                        style = MaterialTheme.typography.body1
                    )
                    OutlinedTextField(
                        value = playerName.value,
                        onValueChange =
                        viewModel::setPlayerName,
                        modifier = Modifier
                            .background(Color.Transparent)
                            .fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(
                            imeAction = ImeAction.Done
                        ),
                        keyboardActions = KeyboardActions(
                            onDone = {}
                        ),
                        maxLines = 1
                    )
                }
                Box(modifier = Modifier.height(100.dp))

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()

                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Button(
                            onClick = {
                                if (playerName.value.isNotBlank()) {
                                    viewModel.setPlayerName(playerName.value)
                                }

                                Toast.makeText(activity, viewModel.playerName.value, Toast.LENGTH_LONG).show()
                            },
                            modifier = Modifier
                                .weight(2f)
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Start Quiz",
                                style = MaterialTheme.typography.button.copy(
                                    fontSize = 24.sp
                                )
                            )
                        }
                        Box(modifier = Modifier.height(24.dp))
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .weight(1f)
                                .background(Color.Green)
                                .fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(backgroundColor = RedColor)
                        ) {
                            Text(
                                text = "Exit", style = MaterialTheme.typography.button.copy(
                                    fontSize = 24.sp,
                                    color = Color.White
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(quizViewModel: QuizViewModel = QuizViewModel(Application())) {
    HomeScreen(viewModel = quizViewModel)
}