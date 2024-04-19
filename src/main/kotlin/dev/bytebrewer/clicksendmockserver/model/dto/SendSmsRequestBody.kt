package dev.bytebrewer.clicksendmockserver.model.dto

data class SendSmsRequestBody(
    val messages: List<SmsDto>
)
