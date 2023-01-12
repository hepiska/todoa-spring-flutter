package com.ego.todobe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoBeApplication

fun main(args: Array<String>) {
	runApplication<TodoBeApplication>(*args)
}
