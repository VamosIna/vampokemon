package com.vamosina.pokemon.data.mapper

import com.vamosina.pokemon.data.remote.response.PokemonDetailsDto
import com.vamosina.pokemon.domain.model.PokemonDetails
import com.vamosina.pokemon.domain.model.Sprites

class PokemonDetailsDtoMapper(
    private val sprites: Sprites,
//    private val ability: Ability
) : Mapper<PokemonDetailsDto, PokemonDetails> {
    override fun mapFromEntity(entity: PokemonDetailsDto): PokemonDetails {

        return PokemonDetails(
            id = entity.id,
            name = entity.name,
            abilityName =entity.abilities[0].abilityDto.name.toString(),
            sprites = sprites,
            types = TypeDtoMapper().mapFromEntity(entity.types),
            weightInHg = entity.weight,
            heightInDm = entity.height,
            locationAreaEncounters = entity.locationAreaEncounters,
            abilitiesXDto = AbilityDtoMapper().mapFromEntity(entity.abilities.map { it.abilityDto })
//            abilitiesXDto = entity.abilities.map { it.abilityDto.name.toString() }
        )
    }

    override fun mapToEntity(domain: PokemonDetails): PokemonDetailsDto {
        throw UnsupportedOperationException("Not implemented")
    }
}