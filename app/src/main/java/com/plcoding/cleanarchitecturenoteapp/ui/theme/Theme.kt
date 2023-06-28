package com.plcoding.cleanarchitecturenoteapp.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color.White,
    background = ClrBlanc,
    onBackground = Color.White,
    surface = LightBlue,
    onSurface = ClrBlanc
)

/**
 * Pour définir le thème de mon application.
 */
private val PaletteCouleurBlancs = darkColors(
    primary = Color.Black,
    background = ClrBlanc,
    onBackground = Color.Black,
    surface = MainPageColorSurface,
    onSurface = Color.White
)

@Composable
fun CleanArchitectureNoteAppTheme(darkTheme: Boolean = true, content: @Composable() () -> Unit) {
    MaterialTheme(
        colors = PaletteCouleurBlancs,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}