package edu.uchicago.gerber.quiz4class.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uchicago.gerber.quiz4class.ui.theme.RedColor


@Composable
fun QuestionScreen() {


    val selectedOption = "Warsaw"
    val answers = listOf("London", "Berlin", "Prague", "Warsaw", "Madrid")


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

        ) {

            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(7f)
                ) {
                    Text(
                        text = "Question 1 :",
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp),
                        style = MaterialTheme.typography.subtitle2
                    )
                    Divider()
                    Text(
                        text = "What is the capital of Poland?",
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp),
                        style = MaterialTheme.typography.h6
                    )
                    answers.forEach { option ->
                        Box(modifier = Modifier
                            .padding(10.dp)
                            .selectable(
                                selected = (option == selectedOption),
                                onClick = { }
                            )) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp)

                            ) {
                                RadioButton(selected = selectedOption == option, onClick = {

                                })
                                Text(
                                    text = option,
                                    modifier = Modifier
                                        .padding(horizontal = 8.dp),

                                    style = MaterialTheme.typography.subtitle1
                                )
                            }
                        }
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(12.dp),
                ) {
                    Button(
                        onClick = {

                        },
                        modifier = Modifier
                            .weight(3f)
                            .fillMaxHeight(),
                        enabled = true
                    ) {
                        Text(
                            text = "Submit", style = MaterialTheme.typography.button.copy(
                                fontSize = 16.sp
                            )
                        )
                    }
                    Box(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = {

                        },
                        modifier = Modifier
                            .weight(2f)
                            .fillMaxHeight(),
                        colors = ButtonDefaults.buttonColors(backgroundColor = RedColor)

                    ) {
                        Text(
                            text = "Quit", style = MaterialTheme.typography.button.copy(
                                fontSize = 16.sp,
                                color = Color.White
                            )
                        )
                    }
                }

            }

        }
    }


}

@Preview(showBackground = true)
@Composable
fun QuestionScreenPreview() {
    QuestionScreen()
}
