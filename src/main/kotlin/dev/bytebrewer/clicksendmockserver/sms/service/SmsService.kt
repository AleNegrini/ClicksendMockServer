package dev.bytebrewer.clicksendmockserver.sms.service

import dev.bytebrewer.clicksendmockserver.sms.faker.successSendSmsResponse
import dev.bytebrewer.clicksendmockserver.sms.model.payload.SendSmsRequestBody
import dev.bytebrewer.clicksendmockserver.sms.model.payload.SendSmsResponse
import io.github.serpro69.kfaker.Faker
import org.springframework.stereotype.Service

@Service
class SmsService(
    val faker: Faker
) {
    fun sendSms(body: SendSmsRequestBody): SendSmsResponse  = faker.successSendSmsResponse(body)
}
