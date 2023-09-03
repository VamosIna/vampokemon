package com.vamosina.pokemon.data.repository

import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import com.vamosina.pokemon.data.local.dao.PokemonPageDao
import com.vamosina.pokemon.data.local.tuple.UpdatePokemonSelectedTuple
import com.vamosina.pokemon.domain.repository.IPokemonStateRepository

class PokemonStateRepository(
    private val cm: ConnectivityManager?,
    private val pokemonPageDao: PokemonPageDao
) : IPokemonStateRepository {

    override suspend fun selectPokemon(id: Int, selected: Boolean) {
        if (isConnected()) {
            pokemonPageDao.updateIsSelectedOnline(UpdatePokemonSelectedTuple(id, selected))
        } else {
            pokemonPageDao.updateIsSelectedOffline(selected, id)
        }
    }

    override suspend fun unselectPokemon() = pokemonPageDao.unselectPokemon()

    private fun isConnected(): Boolean {
        var isConnected = false
        cm?.run {
            cm.getNetworkCapabilities(cm.activeNetwork)?.run {
                isConnected = when {
                    hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                    else -> false
                }
            }
        }
        return isConnected
    }
}