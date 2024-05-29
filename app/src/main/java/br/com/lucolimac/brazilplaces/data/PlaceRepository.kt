package br.com.lucolimac.brazilplaces.data

import android.content.Context
import br.com.lucolimac.brazilplaces.dao.PlaceDatabase
import br.com.lucolimac.brazilplaces.model.Place

class PlaceRepository(context: Context) {
    private val placeDatabase = PlaceDatabase.getInstance(context)
    private val placeDAO = placeDatabase.placeDAO()

    fun createPlace(place: Place) {
        placeDAO.createPlace(place)
    }

    fun getAllPlace(): List<Place> {
        return placeDAO.gelAllPlace()
    }

    fun getPlaceByName(name: String): Place {
        return placeDAO.getPlaceByName(name)
    }

    fun updatePlace(place: Place) {
        placeDAO.updatePlace(place)
    }

    fun deletePlace(place: Place) {
        placeDAO.deletePlace(place)
    }
}