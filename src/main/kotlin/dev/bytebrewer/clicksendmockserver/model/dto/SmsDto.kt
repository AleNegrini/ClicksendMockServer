package dev.bytebrewer.clicksendmockserver.model.dto

data class SmsDto (
    val source: String,
    val body: String,
    val to: String,
)