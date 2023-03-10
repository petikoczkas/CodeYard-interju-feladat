package hu.codeyard.android.codeyard.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)

data class CodeYardTypography(
    val cardTitleTextStyle: TextStyle = TextStyle(
        fontSize = 20.sp
    ),
    val grayTextStyle: TextStyle = TextStyle(
        color = Color.Gray
    ),
    val detailScreenName: TextStyle = TextStyle(
        fontSize = 40.sp,
        color = Color.White,
    )
)

val LocalTypography = staticCompositionLocalOf { CodeYardTypography() }

val MaterialTheme.codeyardTypography: CodeYardTypography
    @Composable
    @ReadOnlyComposable
    get() = LocalTypography.current