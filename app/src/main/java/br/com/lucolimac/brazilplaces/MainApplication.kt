package br.com.lucolimac.brazilplaces

import android.app.Application
import br.com.lucolimac.brazilplaces.di.PlaceModule.placeModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            allowOverride(true)
            androidLogger()
            // Reference Android context
            androidContext(this@MainApplication)
            modules(placeModule)
        }
    }
}