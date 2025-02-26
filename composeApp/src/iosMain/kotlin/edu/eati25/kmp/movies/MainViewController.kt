package edu.eati25.kmp.movies

import androidx.compose.ui.window.ComposeUIViewController
import edu.eati25.kmp.movies.data.database.getDatabaseBuilder

fun MainViewController() = ComposeUIViewController {
    val db = getDatabaseBuilder().build()
    App(db.moviesDao())
}