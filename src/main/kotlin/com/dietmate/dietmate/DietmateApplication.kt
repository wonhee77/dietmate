package com.dietmate.dietmate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DietmateApplication

fun main(args: Array<String>) {
    runApplication<DietmateApplication>(*args)
}
