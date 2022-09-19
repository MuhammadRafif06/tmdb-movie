package com.rafif.tmdb_movie.data.api

import com.rafif.tmdb_movie.data.model.artist.Artist
import com.rafif.tmdb_movie.data.model.movie.MovieList
import com.rafif.tmdb_movie.data.model.tv.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBservices {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String) : Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(@Query("api_key") apiKey: String) : Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtist(@Query("api_key") apiKey: String) : Response<Artist>
}