package dev.bytebrewer.clicksendmockserver.sms.faker

import dev.bytebrewer.clicksendmockserver.model.dto.ResponseCode
import dev.bytebrewer.clicksendmockserver.sms.model.dto.SmsDto
import dev.bytebrewer.clicksendmockserver.sms.model.payload.SendSmsRequestBody
import dev.bytebrewer.clicksendmockserver.sms.model.payload.SendSmsResponse
import io.github.serpro69.kfaker.Faker
import org.springframework.http.HttpStatusCode
import java.math.BigDecimal

fun Faker.successSendSmsResponse(body: SendSmsRequestBody): SendSmsResponse {

    val fakeMessages: List<SendSmsResponse.Data.MessageResponse> = body.messages.map {
        message -> messageResponse(message)
    }

    return SendSmsResponse(
        httpCode = HttpStatusCode.valueOf(200),
        responseCode = ResponseCode.SUCCESS,
        responseMsg = "Here are your data",
        data = SendSmsResponse.Data(
            totalPrice = fakeMessages
                .map { it.messagePrice }
                .reduce { acc, cost -> acc + cost },
            totalCount = fakeMessages.size,
            queuedCount = fakeMessages.size,
            messages = fakeMessages,
            _currency = currencyDetails()
        )
    )
}

fun Faker.messageResponse(sms: SmsDto): SendSmsResponse.Data.MessageResponse {
    return SendSmsResponse.Data.MessageResponse(
        direction = "out",
        date = this.random.nextLong(),
        from = sms.source,
        body = sms.body,
        to = sms.to,
        schedule = this.random.nextLong(),
        messageId = this.random.nextUUID().uppercase(),
        messageParts = 1,
        messagePrice = BigDecimal.valueOf(this.random.nextDouble()),
        customString = this.random.randomString(5),
        userId = this.random.nextInt(),
        subAccountId = this.random.nextInt(),
        country = this.address.countryCode(),
        carrier = this.app.name(),
        status = ResponseCode.SUCCESS,
    )
}

fun Faker.currencyDetails(): SendSmsResponse.Data.CurrencyDetails {
    return SendSmsResponse.Data.CurrencyDetails(
        currencyNameShort = "USD",
        currencyPrefixD = "$",
        currencyPrefixC = "¢",
        currencyNameLong = "Us Dollars"
    )
}