package br.com.lucolimac.brazilplaces.data

import br.com.lucolimac.brazilplaces.dao.PlaceDAO
import br.com.lucolimac.brazilplaces.domain.PlaceUseCase
import br.com.lucolimac.brazilplaces.model.Place
import kotlinx.coroutines.flow.Flow
class PlaceRepository(private val placeDAO: PlaceDAO) : PlaceUseCase {


    override suspend fun savePlace(place: Place) {
        placeDAO.createPlace(place)
    }

    override suspend fun updatePlace(place: Place) {
        placeDAO.updatePlace(place)
    }

    override suspend fun deletePlace(place: Place) {
        placeDAO.deletePlace(place)
    }

    override suspend fun getPlaceById(name: String): Place {
        return placeDAO.getPlaceByName(name)
    }

    override suspend fun getAllPlaces(): Flow<List<Place>> {
        return placeDAO.gelAllPlace()
    }
}