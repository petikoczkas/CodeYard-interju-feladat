package hu.codeyard.android.codeyard.ui.screen.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import coil.compose.rememberAsyncImagePainter
import com.ramcosta.composedestinations.annotation.Destination
import hu.codeyard.android.codeyard.R
import hu.codeyard.android.codeyard.data.api.model.Result
import hu.codeyard.android.codeyard.ui.theme.codeyardColors
import hu.codeyard.android.codeyard.ui.theme.codeyardDimens
import hu.codeyard.android.codeyard.ui.theme.codeyardTypography
import hu.codeyard.android.codeyard.ui.view.CodeYardText

@Destination
@Composable
fun DetailScreen(
    person: Result
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box {
                Image(
                    painter = rememberAsyncImagePainter(person.picture.large),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier.aspectRatio(MaterialTheme.codeyardDimens.detailImgAspectRatio)
                )
                CodeYardText(
                    text = "${person.name.first} ${person.name.last}",
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(start = MaterialTheme.codeyardDimens.gapNormal),
                    textStyle = MaterialTheme.codeyardTypography.detailScreenName
                )
                IconButton(
                    onClick = { },
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                ) {
                    Icon(
                        Icons.Rounded.MoreVert,
                        contentDescription = null,
                        tint = MaterialTheme.codeyardColors.white,
                        modifier = Modifier.size(MaterialTheme.codeyardDimens.moreVertIconSize)
                    )
                }
            }
            Card(
                elevation = MaterialTheme.codeyardDimens.gapTiny,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(MaterialTheme.codeyardDimens.gapMedium),
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    CardRow(
                        title = person.phone,
                        description = stringResource(R.string.mobile),
                        icon = Icons.Rounded.Phone
                    ) {
                        IconButton(onClick = { }) {
                            Icon(
                                painterResource(R.drawable.sms),
                                tint = MaterialTheme.codeyardColors.grayBlue,
                                contentDescription = null
                            )
                        }
                    }

                    CardRow(title = person.cell, description = stringResource(R.string.work)) {
                        IconButton(onClick = { }) {
                            Icon(
                                painterResource(R.drawable.sms),
                                tint = MaterialTheme.codeyardColors.grayBlue,
                                contentDescription = null
                            )
                        }
                    }

                    Divider(
                        color = MaterialTheme.codeyardColors.grayBlue,
                        thickness = MaterialTheme.codeyardDimens.dividerThickness,
                        modifier = Modifier.padding(
                            start = MaterialTheme.codeyardDimens.gapVeryLarge + MaterialTheme.codeyardDimens.detailIconSize,
                            top = MaterialTheme.codeyardDimens.gapNormal,
                            bottom = MaterialTheme.codeyardDimens.gapNormal
                        )
                    )

                    CardRow(
                        title = person.email,
                        description = stringResource(R.string.home),
                        icon = Icons.Rounded.Email
                    )
                }
            }
        }
    }
}

@Composable
fun CardRow(
    title: String,
    description: String,
    icon: ImageVector? = null,
    content: @Composable () -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(MaterialTheme.codeyardDimens.gapNormal),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            var myModifier =
                Modifier.padding(start = MaterialTheme.codeyardDimens.gapNormal + MaterialTheme.codeyardDimens.detailIconSize)
            if (icon != null) {
                Icon(
                    icon,
                    contentDescription = null,
                    tint = MaterialTheme.codeyardColors.grayBlue,
                    modifier = Modifier.size(MaterialTheme.codeyardDimens.detailIconSize)
                )
                myModifier = Modifier.padding(start = MaterialTheme.codeyardDimens.gapNormal)
            }
            Column(
                modifier = myModifier
                    .clickable { }
            ) {
                CodeYardText(
                    text = title,
                    textStyle = MaterialTheme.codeyardTypography.cardTitleTextStyle
                )
                CodeYardText(
                    text = description,
                    textStyle = MaterialTheme.codeyardTypography.grayTextStyle
                )
            }
        }
        content()
    }
}