package br.com.lucolimac.brazilplaces.model

data class Place(
    val name: String,
    val description: String,
    val image: Int,
    val location: String,
    val hasBeenVisited: Boolean
)
