package br.com.devnaldo.coinconverter.domain

import br.com.devnaldo.coinconverter.core.UseCase
import br.com.devnaldo.coinconverter.data.model.ExchangeResponseValue
import br.com.devnaldo.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}