package hu.codeyard.android.codeyard.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import hu.codeyard.android.codeyard.R
import hu.codeyard.android.codeyard.ui.theme.CodeYardTheme
import hu.codeyard.android.codeyard.ui.theme.codeyardDimens
import hu.codeyard.android.codeyard.ui.theme.codeyardTypography

@Composable
fun ListItem(person: String = "") {
    Card(
        elevation = MaterialTheme.codeyardDimens.gapNone,
        modifier = Modifier
            .fillMaxWidth()
            .padding(MaterialTheme.codeyardDimens.gapNormal)
            .clickable { TODO("Nav to detailscreen") }
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(top = MaterialTheme.codeyardDimens.gapMedium)
                    .size(45.dp)
                    .clip(CircleShape)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp)
            ) {
                CodeYardText(
                    text = "Sandra Adams",
                    textStyle = MaterialTheme.codeyardTypography.cardTitleTextStyle
                )
                CodeYardText(text = "lalalal@gmail.com")
                CodeYardText(
                    text = "Debrecen, Hal köz 3/A",
                    textStyle = MaterialTheme.codeyardTypography.grayTextStyle
                )
                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(top = MaterialTheme.codeyardDimens.gapMedium)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListItemPreview() {
    CodeYardTheme {
        Column {
            ListItem()
            ListItem()
        }
    }
}