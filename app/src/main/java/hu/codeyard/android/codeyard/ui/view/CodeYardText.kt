package hu.codeyard.android.codeyard.ui.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import hu.codeyard.android.codeyard.ui.theme.codeyardDimens

@Composable
fun CodeYardText(
    text: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TextStyle.Default
) {
    Text(
        modifier = modifier.padding(bottom = MaterialTheme.codeyardDimens.gapSmall),
        style = textStyle,
        text = text
    )
}