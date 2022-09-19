package com.rafif.tmdb_movie.data.model.tv


import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("results")
    val tvShows: List<TvShow?>?,
)