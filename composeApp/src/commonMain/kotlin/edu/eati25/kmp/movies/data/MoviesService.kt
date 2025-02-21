package edu.eati25.kmp.movies.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class MoviesService(
    private val client: HttpClient
) {

    suspend fun getPopularMovies(): RemoteResult {
        return client.get("/discover/movie?sort_by=popularity.desc")
            .body()
    }
}