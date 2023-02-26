package hu.codeyard.android.codeyard.ui.screen.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import hu.codeyard.android.codeyard.R
import hu.codeyard.android.codeyard.ui.theme.codeyardDimens
import hu.codeyard.android.codeyard.ui.theme.codeyardTypography
import hu.codeyard.android.codeyard.ui.view.AppBar

@RootNavGraph(start = true)
@Destination
@Composable
fun ListScreen(
    navigator: DestinationsNavigator,
    viewModel: ListViewModel = hiltViewModel()
) {

    val personList by viewModel.people.collectAsState()

    Scaffold(
        topBar = { AppBar() },
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(Icons.Rounded.Add, contentDescription = null)
            }
        },
        content = { padding ->
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Text(
                        modifier = Modifier.padding(MaterialTheme.codeyardDimens.gapMedium),
                        text = stringResource(R.string.today),
                        style = MaterialTheme.codeyardTypography.grayTextStyle
                    )

                    LazyColumn(modifier = Modifier.fillMaxWidth()) {
                        items(personList) { p ->
                            ListItem(person = p, navigator = navigator)
                        }
                    }

                }
            }
        }
    )
}