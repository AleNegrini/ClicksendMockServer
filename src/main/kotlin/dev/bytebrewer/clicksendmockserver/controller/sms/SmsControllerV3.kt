package dev.bytebrewer.clicksendmockserver.controller.sms

import dev.bytebrewer.clicksendmockserver.model.dto.SendSmsRequestBody
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v3/sms")
class SmsControllerV3 {

    @Operation(summary = "Send SMS")
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200",
                description = "SUCCESS. Message added to queue OK",
            ),
            ApiResponse(
                responseCode = "400",
                description = "BAD_REQUEST. The request was invalid or cannot be otherwise served. " +
                        "An accompanying error message will explain further."
            ),
            //TODO fill missing codes
            //TODO add response object
            //TODO deal with exceptions
        ]
    )
    @PostMapping("send")
    fun sendSms(@Valid @RequestBody sendSmsRequest: SendSmsRequestBody) {
        println("Send")
    }

}