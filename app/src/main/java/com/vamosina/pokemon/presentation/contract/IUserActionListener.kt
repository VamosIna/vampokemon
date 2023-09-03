package com.vamosina.pokemon.presentation.contract

import com.vamosina.pokemon.domain.model.PokemonItem

interface IUserActionListener {
    fun onOpen(pokemonItem: PokemonItem)
    fun onSelect(pokemonItem: PokemonItem)
}