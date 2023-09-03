package com.vamosina.pokemon.domain.usecase

import com.vamosina.pokemon.data.repository.PokemonStateRepository

class UnselectPokemonUseCase(private val pokemonStateRepository: PokemonStateRepository) {

    suspend fun execute() = pokemonStateRepository.unselectPokemon()
}