package com.example.composelearning.data

import java.time.LocalDate

data class Payment(
    val id: Int,
    val startDate: LocalDate,
    var currentDate: LocalDate = LocalDate.now(),
    val dueDate: LocalDate,
    var paymentAmount: Int,

)
