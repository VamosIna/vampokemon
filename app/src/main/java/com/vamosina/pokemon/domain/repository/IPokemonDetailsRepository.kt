package com.vamosina.pokemon.domain.repository

import com.vamosina.pokemon.domain.model.PokemonDetails

interface IPokemonDetailsRepository {

    suspend fun getDetails(id: Int): PokemonDetails
}