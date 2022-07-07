package edu.uchicago.gerber.quiz4class.screens


import android.app.Application
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
fun ResultScreen() {
    val correctSubmissions = 46
    val incorrectSubmissions = 5
    val scorePercent = 92.19898989898
    val playerName = "Adam"

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
                        text = "$playerName, your results are:",
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 40.dp),
                        style = MaterialTheme.typography.h6
                    )
                    Divider()
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Box(modifier = Modifier.padding(horizontal = 16.dp)) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.DarkGray)

                            ) {
                                Text(
                                    text = "Correct: ${correctSubmissions}",
                                    modifier = Modifier.padding(
                                        vertical = 18.dp,
                                        horizontal = 24.dp
                                    ),
                                    style = MaterialTheme.typography.h5.copy(
                                        color = Color.Green
                                    )
                                )
                            }
                        }
                        Box(modifier = Modifier.height(24.dp))
                        Box(modifier = Modifier.padding(horizontal = 16.dp)) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.DarkGray)

                            ) {
                                Text(
                                    text = "Incorrect: ${incorrectSubmissions}",
                                    modifier = Modifier.padding(
                                        vertical = 18.dp,
                                        horizontal = 24.dp
                                    ),
                                    style = MaterialTheme.typography.h5.copy(
                                        color = RedColor
                                    )
                                )
                            }
                        }
                        Box(modifier = Modifier.height(24.dp))
                        Box(modifier = Modifier.padding(horizontal = 16.dp)) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.DarkGray)

                            ) {
                                Text(
                                    text = "Score: ${scorePercent.toInt()}%",
                                    modifier = Modifier.padding(
                                        vertical = 18.dp,
                                        horizontal = 24.dp
                                    ),
                                    style = MaterialTheme.typography.h5.copy(
                                        color = Color.White
                                    )
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
                            .fillMaxHeight()
                    ) {
                        Text(
                            text = "Another Quiz", style = MaterialTheme.typography.button.copy(
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
                            text = "Reset", style = MaterialTheme.typography.button.copy(
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
fun ResultScreenPreview() {
    ResultScreen()
}
