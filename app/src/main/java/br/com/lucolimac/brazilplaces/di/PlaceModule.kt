package br.com.lucolimac.brazilplaces.di

import br.com.lucolimac.brazilplaces.dao.PlaceDAO
import br.com.lucolimac.brazilplaces.dao.PlaceDatabase
import br.com.lucolimac.brazilplaces.data.PlaceRepository
import br.com.lucolimac.brazilplaces.domain.PlaceUseCase
import br.com.lucolimac.brazilplaces.ui.viewModel.RegisterPlaceViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object PlaceModule {
    val placeModule = module {

        single<PlaceDatabase> { PlaceDatabase.getInstance(androidContext()) }
        viewModel { RegisterPlaceViewModel(get()) }
        single<PlaceDAO> { get<PlaceDatabase>().placeDAO() }
        factory<PlaceUseCase> { PlaceRepository(get()) }
    }
}