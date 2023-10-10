package com.kotlin.practice

import com.kotlin.practice.domain.Order
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PracticeApplication

fun main(args: Array<String>) {
    runApplication<PracticeApplication>(*args)
}
