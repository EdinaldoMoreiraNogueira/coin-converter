package br.com.devnaldo.coinconverter.domain.di

import br.com.devnaldo.coinconverter.domain.GetExchangeValueUseCase
import br.com.devnaldo.coinconverter.domain.ListExchangeUseCase
import br.com.devnaldo.coinconverter.domain.SaveExchangeUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory { ListExchangeUseCase(get()) }
            factory { SaveExchangeUseCase(get()) }
            factory { GetExchangeValueUseCase(get()) }
        }
    }
}