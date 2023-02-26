package hu.codeyard.android.codeyard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ramcosta.composedestinations.DestinationsNavHost
import dagger.hilt.android.AndroidEntryPoint
import hu.codeyard.android.codeyard.ui.screen.NavGraphs
import hu.codeyard.android.codeyard.ui.theme.CodeYardTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeYardTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}