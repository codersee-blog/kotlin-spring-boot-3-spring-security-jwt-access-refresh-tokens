package com.codersee.jwtauth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JwtAuthApplication

fun main(args: Array<String>) {
	runApplication<JwtAuthApplication>(*args)
}
