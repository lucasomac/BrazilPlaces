package br.com.lucolimac.brazilplaces.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.lucolimac.brazilplaces.model.Place

@Dao
interface PlaceDAO {

    @Insert
    fun createPlace(place: Place)

    @Query("SELECT * FROM place")
    fun gelAllPlace(): List<Place>

    @Query("SELECT * FROM place WHERE name LIKE :name")
    fun getPlaceByName(name: String): Place

    @Update
    fun updatePlace(place: Place)

    @Delete
    fun deletePlace(place: Place)
}