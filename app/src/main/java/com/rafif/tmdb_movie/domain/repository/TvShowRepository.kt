package com.rafif.tmdb_movie.domain.repository

import com.rafif.tmdb_movie.data.model.tv.TvShow

interface TvShowRepository {

    suspend fun getTvShows(): List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?

}