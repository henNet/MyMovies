package com.example.MyMovies

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.data.jpa.repository.JpaRepository

@Entity
@Table(name = "movies")
data class Movies (
  @Id val name: String
)

interface Repository: JpaRepository<Movies, String>