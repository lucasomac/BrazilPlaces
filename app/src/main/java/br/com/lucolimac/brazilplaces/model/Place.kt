package br.com.lucolimac.brazilplaces.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Place(
    @PrimaryKey(autoGenerate = true)
    val id: Int=0,
    val name: String,
    val description: String,
    val location: String,
    val hasBeenVisited: Boolean = false
)
