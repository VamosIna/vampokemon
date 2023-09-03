package com.vamosina.pokemon.domain.di

import com.vamosina.pokemon.data.repository.PokemonDetailsRepository
import com.vamosina.pokemon.data.repository.PokemonListRepository
import com.vamosina.pokemon.data.repository.PokemonStateRepository
import com.vamosina.pokemon.domain.usecase.GetPokemonByNameUseCase
import com.vamosina.pokemon.domain.usecase.GetPokemonListUseCase
import com.vamosina.pokemon.domain.usecase.GetPokemonDetailsByIdUseCase
import com.vamosina.pokemon.domain.usecase.UnselectPokemonUseCase
import com.vamosina.pokemon.domain.usecase.UpdatePokemonUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun providePokemonListUseCase(pokemonListRepository: PokemonListRepository): GetPokemonListUseCase {
        return GetPokemonListUseCase(pokemonListRepository)
    }

    @Provides
    fun providePokemonDetailsUseCase(detailsRepository: PokemonDetailsRepository): GetPokemonDetailsByIdUseCase {
        return GetPokemonDetailsByIdUseCase(detailsRepository)
    }

    @Provides
    fun providePokemonByNameUseCase(pokemonListRepository: PokemonListRepository): GetPokemonByNameUseCase {
        return GetPokemonByNameUseCase(pokemonListRepository)
    }

    @Provides
    fun provideUpdatePokemonSelectedUseCase(pokemonStateRepository: PokemonStateRepository): UpdatePokemonUseCase {
        return UpdatePokemonUseCase(pokemonStateRepository)
    }

    @Provides
    fun provideUnselectPokemonUseCase(pokemonStateRepository: PokemonStateRepository): UnselectPokemonUseCase {
        return UnselectPokemonUseCase(pokemonStateRepository)
    }
}