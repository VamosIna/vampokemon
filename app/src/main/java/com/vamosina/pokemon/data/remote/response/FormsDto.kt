package com.vamosina.pokemon.data.remote.response

import com.google.gson.annotations.SerializedName

data class FormsDto(
    @SerializedName("name") val name: String?,
    @SerializedName("url") val url: String?
)