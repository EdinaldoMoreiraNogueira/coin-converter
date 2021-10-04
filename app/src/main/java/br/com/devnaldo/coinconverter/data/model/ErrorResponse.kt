package br.com.devnaldo.coinconverter.data.model

data class ErrorResponse (
    val status: Long,
    val code: String,
    val message: String
)
