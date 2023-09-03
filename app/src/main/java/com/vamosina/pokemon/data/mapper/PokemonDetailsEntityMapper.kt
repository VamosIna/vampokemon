package com.vamosina.pokemon.data.mapper

import com.vamosina.pokemon.data.local.model.PokemonDetailsEntity
import com.vamosina.pokemon.domain.model.Ability
import com.vamosina.pokemon.domain.model.PokemonDetails
import com.vamosina.pokemon.domain.model.Sprites

class PokemonDetailsEntityMapper : Mapper<PokemonDetailsEntity, PokemonDetails> {
    override fun mapFromEntity(entity: PokemonDetailsEntity): PokemonDetails {
        return PokemonDetails(
            id = entity.id,
            name = entity.name,
            abilityName = entity.abilityName,
            sprites = Sprites(entity.sprites.associateBy { it }),
            types = entity.types,
            weightInHg = entity.weightInHg,
            heightInDm = entity.heightInDm,
            locationAreaEncounters = entity.locationAreaEncounters,
            abilitiesXDto = entity.ability
        )
    }

    override fun mapToEntity(domain: PokemonDetails): PokemonDetailsEntity {
        val sprites = mutableListOf<String>()
        domain.sprites.sprites.forEach {
            if (it.value != null) {
                sprites.add(it.value!!)
            }
        }
        return PokemonDetailsEntity(
            id = domain.id,
            name = domain.name,
            sprites = sprites,
            types = domain.types,
            weightInHg = domain.weightInHg,
            heightInDm = domain.heightInDm,
            locationAreaEncounters = domain.locationAreaEncounters,
            ability = domain.abilitiesXDto,
            abilityName = domain.abilityName
        )
    }
}