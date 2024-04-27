package dev.bytebrewer.clicksendmockserver.sms.model.payload

import dev.bytebrewer.clicksendmockserver.sms.model.dto.SmsDto

data class SendSmsRequestBody(
    val messages: List<SmsDto>
)
