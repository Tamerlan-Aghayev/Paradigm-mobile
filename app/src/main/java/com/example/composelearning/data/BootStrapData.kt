package com.example.composelearning.data

import java.time.LocalDate

class BootStrapData {
    companion object {
        val payment = Payment(
            id = 1,
            startDate = LocalDate.of(2024, 1, 25),
            dueDate = LocalDate.of(2024, 9, 25),
            paymentAmount = 300
        )
        val payment2 = Payment(
            id = 1,
            startDate = LocalDate.of(2024, 1, 25),
            dueDate = LocalDate.of(2024, 8, 25),
            paymentAmount = 350
        )
        val payment3 = Payment(
            id = 1,
            startDate = LocalDate.of(2024, 1, 25),
            dueDate = LocalDate.of(2024, 7, 25),
            paymentAmount = 350
        )
        val payment4 = Payment(
            id = 1,
            startDate = LocalDate.of(2024, 1, 25),
            dueDate = LocalDate.of(2024, 6, 25),
            paymentAmount = 350
        )
        val payment5 = Payment(
            id = 1,
            startDate = LocalDate.of(2024, 1, 25),
            dueDate = LocalDate.of(2024, 5, 25),
            paymentAmount = 350
        )
        val payment6 = Payment(
            id = 1,
            startDate = LocalDate.of(2024, 1, 25),
            dueDate = LocalDate.of(2024, 4, 25),
            paymentAmount = 350
        )
        val payment7 = Payment(
            id = 1,
            startDate = LocalDate.of(2024, 1, 25),
            dueDate = LocalDate.of(2024, 3, 25),
            paymentAmount = 350
        )
        val payment8 = Payment(
            id = 1,
            startDate = LocalDate.of(2024, 1, 25),
            dueDate = LocalDate.of(2024, 2, 25),
            paymentAmount = 350
        )

        val list = listOf<Payment>(payment, payment2, payment3, payment4, payment5, payment6, payment7, payment8)
    }
}