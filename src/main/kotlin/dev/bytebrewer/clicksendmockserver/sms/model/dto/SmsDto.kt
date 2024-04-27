package dev.bytebrewer.clicksendmockserver.sms.model.dto

data class SmsDto (
    val source: String,
    val body: String,
    val to: String,
)
