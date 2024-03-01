package com.example.composelearning.data

import java.time.LocalDate

data class User(
    val id: Int,
    val name: String,
    val surname: String,
    val birthDate: LocalDate,
    val gender: Gender,
    val email: String,
    val phoneNumber: String
)
