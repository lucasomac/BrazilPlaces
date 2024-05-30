package br.com.lucolimac.brazilplaces.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.lucolimac.brazilplaces.domain.PlaceUseCase
import br.com.lucolimac.brazilplaces.model.Place
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RegisterPlaceViewModel(
    private val placeUseCase: PlaceUseCase,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel() {
    private val _places = MutableStateFlow<List<Place>>(listOf())

    val places = _places.asStateFlow()

    fun savePlace(place: Place) {
        viewModelScope.launch(dispatcher) {
            placeUseCase.savePlace(place)
        }
    }

    fun updatePlace(place: Place) {
        viewModelScope.launch(dispatcher) {
            placeUseCase.updatePlace(place)
        }
    }

    fun deletePlace(place: Place) {
        viewModelScope.launch(dispatcher) {
            placeUseCase.deletePlace(place)
        }
    }

    fun getPlaceById(name: String) {
        viewModelScope.launch(dispatcher) {
            placeUseCase.getPlaceById(name)
        }
    }

    fun getAllPlaces() {
        viewModelScope.launch(dispatcher) {
            _places.value = placeUseCase.getAllPlaces()
        }
    }
}
