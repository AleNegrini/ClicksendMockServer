package dev.bytebrewer.clicksendmockserver.sms.controller

import dev.bytebrewer.clicksendmockserver.sms.model.payload.SendSmsRequestBody
import dev.bytebrewer.clicksendmockserver.sms.model.payload.SendSmsResponse
import dev.bytebrewer.clicksendmockserver.sms.service.SmsService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v3/sms")
class SmsControllerV3(
    val smsService: SmsService
) {

    @Operation(summary = "Send SMS")
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200",
                description = "Message added to queue OK",
            ),
            ApiResponse(
                responseCode = "400",
                description = "The request was invalid or cannot be otherwise served. " +
                        "An accompanying error message will explain further."
            ),
            //TODO fill missing codes
            //TODO add response object
            //TODO deal with exceptions
        ]
    )
    @PostMapping("send")
    fun sendSms(@RequestBody sendSmsRequestBody: SendSmsRequestBody): SendSmsResponse =
        smsService.sendSms(sendSmsRequestBody)

}
