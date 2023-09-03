package com.vamosina.pokemon.domain.repository

import androidx.paging.PagingData
import com.vamosina.pokemon.domain.model.PokemonItem
import kotlinx.coroutines.flow.Flow

interface IPokemonListRepository {

    fun getList(): Flow<PagingData<PokemonItem>>
}