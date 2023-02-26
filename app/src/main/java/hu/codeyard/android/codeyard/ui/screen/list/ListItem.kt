package hu.codeyard.android.codeyard.ui.screen.list

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
import coil.compose.rememberAsyncImagePainter
import hu.codeyard.android.codeyard.data.api.model.Result
import hu.codeyard.android.codeyard.ui.theme.codeyardDimens
import hu.codeyard.android.codeyard.ui.theme.codeyardTypography
import hu.codeyard.android.codeyard.ui.view.CodeYardText

@Composable
fun ListItem(person: Result) {
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
                painter = rememberAsyncImagePainter(person.picture.thumbnail),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(top = MaterialTheme.codeyardDimens.gapMedium)
                    .size(MaterialTheme.codeyardDimens.listItemImgSize)
                    .clip(CircleShape)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = MaterialTheme.codeyardDimens.gapNormal)
            ) {
                CodeYardText(
                    text = person.name.title + " " + person.name.first + " " + person.name.last,
                    textStyle = MaterialTheme.codeyardTypography.cardTitleTextStyle
                )
                CodeYardText(text = person.email)
                CodeYardText(
                    text = person.location.country + ", " + person.location.city,
                    textStyle = MaterialTheme.codeyardTypography.grayTextStyle
                )
                Divider(
                    color = Color.Gray,
                    thickness = MaterialTheme.codeyardDimens.dividerThickness,
                    modifier = Modifier.padding(top = MaterialTheme.codeyardDimens.gapMedium)
                )
            }
        }
    }
}

/*@Preview(showBackground = true)
@Composable
fun ListItemPreview() {
    CodeYardTheme {
        Column {
            ListItem()
            ListItem()
        }
    }
}*/