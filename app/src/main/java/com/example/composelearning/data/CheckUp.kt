package com.example.composelearning.data

import java.time.LocalDate

data class CheckUp(
    val id: Int,
    val date: LocalDate,
    val heartRate: Int,
    val cholesterol: Int,
    val obesityPercentage: Int,
    val cancerProbability: Int
)