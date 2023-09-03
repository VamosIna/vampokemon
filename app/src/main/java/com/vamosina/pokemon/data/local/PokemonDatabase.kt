package com.vamosina.pokemon.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.vamosina.pokemon.data.local.converters.ListTypeConverter
import com.vamosina.pokemon.data.local.dao.PokemonDetailsDao
import com.vamosina.pokemon.data.local.dao.PokemonPageDao
import com.vamosina.pokemon.data.local.model.PokemonDetailsEntity
import com.vamosina.pokemon.data.local.model.PokemonItemEntity

@Database(
    entities = [PokemonItemEntity::class, PokemonDetailsEntity::class],
    version = 1
)
@TypeConverters(ListTypeConverter::class)
abstract class PokemonDatabase : RoomDatabase() {
    abstract val pokemonDetailsDao: PokemonDetailsDao
    abstract val pokemonPageDao: PokemonPageDao
}