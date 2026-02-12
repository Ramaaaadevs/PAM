package id.ac.itera.tugas1

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Tugas1KMP",
    ) {
        App()
    }
}