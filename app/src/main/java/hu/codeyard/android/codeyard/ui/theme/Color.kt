package hu.codeyard.android.codeyard.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class CodeYardColors(
    val white: Color = Color(0xFFFFFFFF),
    val black: Color = Color(0xFF000000),
    val gray: Color = Color.Gray,

    val blue: Color = Color(0xFF2A56C6),
    val grayBlue: Color = Color(0xFF607D8B),

    val colors: Colors = lightColors(
        primary = blue,
        onPrimary = black,
        secondary = grayBlue,
        onSecondary = black,
        background = white
    )
)

val LocalColors = staticCompositionLocalOf { CodeYardColors() }

val MaterialTheme.codeyardColors: CodeYardColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current