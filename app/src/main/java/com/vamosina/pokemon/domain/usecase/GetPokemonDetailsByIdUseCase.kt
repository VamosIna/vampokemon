package com.vamosina.pokemon.domain.usecase

import com.vamosina.pokemon.data.DetailsNotFoundException
import com.vamosina.pokemon.domain.model.PokemonDetails
import com.vamosina.pokemon.domain.repository.IPokemonDetailsRepository
import kotlin.jvm.Throws

class GetPokemonDetailsByIdUseCase(private val pokemonDetailsRepository: IPokemonDetailsRepository) {

    /**
    * @throws DetailsNotFoundException
    * @param id identifier of pokemon
    * */
    @Throws(DetailsNotFoundException::class)
    suspend fun getDetails(id: Int): PokemonDetails {
        return pokemonDetailsRepository.getDetails(id)
    }
}