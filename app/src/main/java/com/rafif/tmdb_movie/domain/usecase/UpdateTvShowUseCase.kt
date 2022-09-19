package com.rafif.tmdb_movie.domain.usecase

import com.rafif.tmdb_movie.data.model.tv.TvShow
import com.rafif.tmdb_movie.domain.repository.TvShowRepository

class UpdateTvShowUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute() : List<TvShow>? = tvShowRepository.updateTvShows()
}