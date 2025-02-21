package edu.eati25.kmp.movies.data

class MoviesRepository(
    private val moviesService: MoviesService
) {

    suspend fun getPopularMovies(): List<Movie> {
        return moviesService.getPopularMovies().results.map {
            it.toDomainMovie()
        }
    }

    private fun RemoteMovie.toDomainMovie(): Movie {
        return Movie(id, title, "https://image.tmdb.org/t/p/w185$posterPath")
    }
}