package edu.eati25.kmp.movies.data

data class Movie(
    val id: Int,
    val title: String,
    val poster: String,
)

val movies = (0..100).map {
    Movie(
        id = it,
        title = "Movie $it",
        poster = "https://picsum.photos/200/300?id=$it",
    )
}