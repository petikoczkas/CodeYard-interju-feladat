package hu.codeyard.android.codeyard.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import hu.codeyard.android.codeyard.R
import hu.codeyard.android.codeyard.ui.theme.codeyardDimens
import hu.codeyard.android.codeyard.ui.theme.codeyardTypography
import hu.codeyard.android.codeyard.ui.view.ListItem

@Composable
fun ListScreen(personList: List<String>) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier.padding(MaterialTheme.codeyardDimens.gapMedium),
            text = stringResource(R.string.today),
            style = MaterialTheme.codeyardTypography.grayTextStyle
        )

        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(personList) { person ->
                ListItem(person)
            }
        }

    }
}