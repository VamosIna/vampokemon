package com.vamosina.pokemon.data.remote.response

import com.google.gson.annotations.SerializedName

data class SpeciesDto(
    @SerializedName("name") val name: String = "",
    @SerializedName("url") val url: String = ""
)