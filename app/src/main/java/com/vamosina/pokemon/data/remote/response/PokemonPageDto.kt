package com.vamosina.pokemon.data.remote.response

data class PokemonPageDto(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonDto>
)