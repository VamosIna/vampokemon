package com.vamosina.pokemon.data.mapper

import com.vamosina.pokemon.data.remote.response.PokemonPageDto
import com.vamosina.pokemon.domain.model.PokemonItem

class PokemonPageDtoMapper : Mapper<PokemonPageDto, List<PokemonItem>> {
    override fun mapFromEntity(entity: PokemonPageDto): List<PokemonItem> {
        val pokemonDtoMapper = PokemonDtoMapper()
        return entity.results.map { pokemonDtoMapper.mapFromEntity(it) }
    }

    override fun mapToEntity(domain: List<PokemonItem>): PokemonPageDto {
        throw UnsupportedOperationException("Not implemented")
    }
}