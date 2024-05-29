package br.com.lucolimac.brazilplaces.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.lucolimac.brazilplaces.model.Place

@Database(entities = [Place::class], version = 1, exportSchema = false)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDAO(): PlaceDAO

    companion object {
        private const val DATABASE_NAME = "place_db"
        private var INSTANCE: PlaceDatabase? = null
        fun getInstance(context: Context): PlaceDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    PlaceDatabase::class.java,
                    DATABASE_NAME
                ).build()
            }
            return INSTANCE as PlaceDatabase
        }
    }
}