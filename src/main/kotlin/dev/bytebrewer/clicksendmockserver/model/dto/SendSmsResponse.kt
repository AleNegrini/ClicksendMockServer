package dev.bytebrewer.clicksendmockserver.model.dto

import org.springframework.http.HttpStatusCode

data class SendSmsResponse (
    val httpCode: Int,
    val responseCode: String
)