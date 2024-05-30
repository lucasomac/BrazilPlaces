package br.com.lucolimac.brazilplaces.domain

import br.com.lucolimac.brazilplaces.model.Place

interface PlaceUseCase {
    suspend fun savePlace(place: Place)
    suspend fun updatePlace(place: Place)
    suspend fun deletePlace(place: Place)
    suspend fun getPlaceById(name: String): Place
    suspend fun getAllPlaces(): List<Place>
}