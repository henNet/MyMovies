package com.example.MyMovies

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(val repository: Repository) {
  @GetMapping("/")
  fun getAllMovies(): List<Movies>{
    try {
      val movies = repository.findAll()
      return movies;
    }catch (e: Exception){
      return listOf(Movies("Nao deu certo"));
    }
  }
}