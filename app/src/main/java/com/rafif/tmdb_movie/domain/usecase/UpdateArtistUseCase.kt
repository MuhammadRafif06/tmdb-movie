package com.rafif.tmdb_movie.domain.usecase

import com.rafif.tmdb_movie.data.model.artist.Artist
import com.rafif.tmdb_movie.domain.repository.ArtistRepository

class UpdateArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtist()
}