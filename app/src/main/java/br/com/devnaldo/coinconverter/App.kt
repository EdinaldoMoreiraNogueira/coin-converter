package br.com.devnaldo.coinconverter

import android.app.Application
import br.com.devnaldo.coinconverter.data.di.DataModules
import br.com.devnaldo.coinconverter.domain.di.DomainModule
import br.com.devnaldo.coinconverter.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}