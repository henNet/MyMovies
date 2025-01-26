package com.example.MyMovies

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyMoviesApplication

fun main(args: Array<String>) {
	runApplication<MyMoviesApplication>(*args)
}
