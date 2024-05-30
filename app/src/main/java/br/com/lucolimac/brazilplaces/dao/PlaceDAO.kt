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
    suspend fun gelAllPlace(): List<Place>

    @Query("SELECT * FROM place WHERE name LIKE :name")
   suspend fun getPlaceByName(name: String): Place

    @Update
   suspend fun updatePlace(place: Place)

    @Delete
   suspend fun deletePlace(place: Place)
}