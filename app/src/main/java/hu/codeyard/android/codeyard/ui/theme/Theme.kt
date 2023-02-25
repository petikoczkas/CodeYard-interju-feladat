package hu.codeyard.android.codeyard.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun CodeYardTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalColors provides CodeYardColors(),
        LocalTypography provides CodeYardTypography(),
        LocalDimens provides CodeYardDimens()
    ) {
        MaterialTheme(
            colors = LocalColors.current.colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}