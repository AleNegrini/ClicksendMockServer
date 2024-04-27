package dev.bytebrewer.clicksendmockserver.sms.model.payload

import dev.bytebrewer.clicksendmockserver.model.dto.ResponseCode
import org.springframework.http.HttpStatusCode
import java.math.BigDecimal

/**
 * Send SMS Endpoint returning object
 * Reference Link: https://developers.clicksend.com/docs/rest/v3/#send-sms
 */
@Suppress("ConstructorParameterNaming")
data class SendSmsResponse (
    val httpCode: HttpStatusCode,
    val responseCode: ResponseCode,
    val responseMsg: String,
    val data: Data,
) {
    data class Data(
        val totalPrice: BigDecimal,
        val totalCount: Int,
        val queuedCount: Int,
        val messages: List<MessageResponse>,
        val _currency: CurrencyDetails,
    ) {

        data class MessageResponse(
            val direction: String,
            val date: Long,
            val to: String,
            val body: String,
            val from: String,
            val schedule: Long,
            val messageId: String,
            val messageParts: Int,
            val messagePrice: BigDecimal,
            val customString: String,
            val userId: Int,
            val subAccountId: Int,
            val country: String,
            val carrier: String,
            val status: ResponseCode
        )

        data class CurrencyDetails(
            val currencyNameShort: String,
            val currencyPrefixD: String,
            val currencyPrefixC: String,
            val currencyNameLong: String,
        )

    }
}
