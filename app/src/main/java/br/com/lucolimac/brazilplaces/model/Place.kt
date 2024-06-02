package br.com.lucolimac.brazilplaces.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
class Place(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val description: String,
    val location: String,
    val hasBeenVisited: Boolean = false
) : Serializable
