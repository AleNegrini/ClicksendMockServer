package dev.bytebrewer.clicksendmockserver.model.entity

import org.springframework.data.annotation.Id

data class Message(
    @Id
    val id: Long,
    val source: String,
    val body: String,
    val to: String,
)
