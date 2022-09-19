package com.rafif.tmdb_movie.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rafif.tmdb_movie.data.model.artist.Artist
import com.rafif.tmdb_movie.data.model.movie.Movie
import com.rafif.tmdb_movie.data.model.tv.TvShow

@Database(
    entities = [Movie::class, TvShow::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {

    abstract fun movieDao() : MovieDao
    abstract fun tvShowDao() : TvShowDao
    abstract fun artistDao() : ArtistDao

}