package com.vamosina.pokemon.domain.usecase

import com.vamosina.pokemon.data.repository.PokemonStateRepository

class UpdatePokemonUseCase(private val pokemonStateRepository: PokemonStateRepository) {

    suspend fun execute(id: Int, selected: Boolean) {
        pokemonStateRepository.selectPokemon(id, selected)
    }
}