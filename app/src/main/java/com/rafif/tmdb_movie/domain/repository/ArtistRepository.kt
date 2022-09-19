package com.rafif.tmdb_movie.domain.repository

import com.rafif.tmdb_movie.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtist() : List<Artist>?
    suspend fun updateArtist(): List<Artist>?
}