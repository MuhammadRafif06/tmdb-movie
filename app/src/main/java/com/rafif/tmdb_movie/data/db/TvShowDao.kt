package com.rafif.tmdb_movie.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rafif.tmdb_movie.data.model.tv.TvShow

@Dao
interface TvShowDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShow(movies: List<TvShow>)

    @Query("DELETE FROM popular_tv_shows")
    suspend fun deleteAllTvShow()

    @Query("SELECT * FROM popular_tv_shows")
    suspend fun getTvShow(): List<TvShow>
}