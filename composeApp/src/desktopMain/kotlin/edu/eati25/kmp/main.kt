package edu.eati25.kmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Hello KMP EATI 25",
    ) {
        App()
    }
}