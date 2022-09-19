package com.rafif.tmdb_movie.domain.usecase

import com.rafif.tmdb_movie.data.model.artist.Artist
import com.rafif.tmdb_movie.domain.repository.ArtistRepository

class GetArtistUseCase(private val artistRepository: ArtistRepository) {

    suspend fun execute(): List<Artist>? = artistRepository.getArtist()
}