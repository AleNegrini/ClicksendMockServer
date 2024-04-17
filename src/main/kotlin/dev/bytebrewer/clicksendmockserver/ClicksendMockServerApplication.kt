package dev.bytebrewer.clicksendmockserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClicksendMockServerApplication

fun main(args: Array<String>) {
	runApplication<ClicksendMockServerApplication>(*args)
}
