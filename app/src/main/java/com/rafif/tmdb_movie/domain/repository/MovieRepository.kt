package com.rafif.tmdb_movie.domain.repository

import com.rafif.tmdb_movie.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}