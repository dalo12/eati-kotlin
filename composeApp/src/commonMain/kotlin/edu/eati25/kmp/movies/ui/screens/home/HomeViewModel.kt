package edu.eati25.kmp.movies.ui.screens.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.eati25.kmp.movies.data.Movie
import edu.eati25.kmp.movies.data.MoviesService
import edu.eati25.kmp.movies.data.RemoteMovie
import kotlinx.coroutines.launch

class HomeViewModel(
    private val moviesService: MoviesService
) : ViewModel() {

    var state by mutableStateOf(UiState())
        private set

    init {
        viewModelScope.launch {
            state = UiState(isLoading = true)
            state =
                UiState(
                    isLoading = false,
                    movies = moviesService.getPopularMovies().results.map {
                        it.toDomainMovie()
                    })
        }
    }

    private fun RemoteMovie.toDomainMovie(): Movie {
        return Movie(id, title, "https://image.tmdb.org/t/p/w185$posterPath")
    }

    data class UiState(
        val isLoading: Boolean = false,
        val movies: List<Movie> = emptyList(),
    )
}