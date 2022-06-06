package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.application.hooks.CallFailed.install

fun main() {
    embeddedServer(Netty, port = 5050, host = "127.0.0.1") {
        install(ContentNegotiation) {
            json()
        }
        configureRouting()
        contactUsModule()
    }.start(wait = true)
}
