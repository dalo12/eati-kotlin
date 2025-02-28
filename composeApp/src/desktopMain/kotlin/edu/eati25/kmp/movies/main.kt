package edu.eati25.kmp.movies

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import edu.eati25.kmp.movies.data.database.getDatabaseBuilder

fun main() = application {
    initKoin()
    Window(
        onCloseRequest = ::exitApplication,
        title = "KmpMovies",
    ) {
        val db = getDatabaseBuilder().build()
        App(db.moviesDao())
    }
}