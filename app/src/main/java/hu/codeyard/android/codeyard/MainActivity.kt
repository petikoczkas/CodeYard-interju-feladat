package hu.codeyard.android.codeyard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import hu.codeyard.android.codeyard.ui.screen.list.ListScreen
import hu.codeyard.android.codeyard.ui.theme.CodeYardTheme
import hu.codeyard.android.codeyard.ui.view.AppBar

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeYardTheme {
                // A surface container using the 'background' color from the theme
                /*Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }*/
                Scaffold(
                    topBar = { AppBar() },
                    floatingActionButton = {
                        FloatingActionButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Rounded.Add, contentDescription = null)
                        }
                    },
                    content = { padding ->
                        Surface(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(padding)
                        ) {
                            ListScreen()
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CodeYardTheme {
        Greeting("Compose")
    }
}