package com.vamosina.pokemon.data.remote

import com.vamosina.pokemon.data.remote.response.PokemonDetailsDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonDetailsApi {

    @GET("pokemon/{id}")
    suspend fun getPokemonDetailsById(
        @Path("id") id: Int
    ): Response<PokemonDetailsDto>
}