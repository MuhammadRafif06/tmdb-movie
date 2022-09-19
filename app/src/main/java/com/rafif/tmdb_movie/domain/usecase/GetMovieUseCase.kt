package com.rafif.tmdb_movie.domain.usecase

import com.rafif.tmdb_movie.data.model.movie.Movie
import com.rafif.tmdb_movie.domain.repository.MovieRepository

class GetMovieUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute() : List<Movie>? = movieRepository.getMovies()
}