package hu.codeyard.android.codeyard.ui.view

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import hu.codeyard.android.codeyard.R
import hu.codeyard.android.codeyard.ui.theme.codeyardColors

@Composable
fun AppBar() {
    TopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(Icons.Rounded.Menu, contentDescription = null)
            }
        },
        actions = {
            IconButton(onClick = { }) {
                Icon(
                    Icons.Rounded.Search,
                    contentDescription = null,
                    tint = MaterialTheme.codeyardColors.white
                )
            }
        }
    )
}