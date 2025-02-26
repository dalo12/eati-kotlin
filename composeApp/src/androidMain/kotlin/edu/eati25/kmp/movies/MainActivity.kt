package edu.eati25.kmp.movies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import edu.eati25.kmp.movies.data.database.getDatabaseBuilder

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val db = getDatabaseBuilder(this).build()
            App(db.moviesDao())
        }
    }
}
