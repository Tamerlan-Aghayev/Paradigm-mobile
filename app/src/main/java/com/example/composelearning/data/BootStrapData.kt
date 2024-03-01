package com.example.composelearning.data

import java.time.LocalDate

class BootStrapData {
    companion object {
        val payment = Payment(
            id = 1,
            startDate = LocalDate.of(2024, 8, 25),
            dueDate = LocalDate.of(2024, 9, 25),
            paymentAmount = 300
        )
        val payment2 = Payment(
            id = 2,
            startDate = LocalDate.of(2024, 7, 25),
            dueDate = LocalDate.of(2024, 8, 25),
            paymentAmount = 300
        )
        val payment3 = Payment(
            id = 3,
            startDate = LocalDate.of(2024, 6, 25),
            dueDate = LocalDate.of(2024, 7, 25),
            paymentAmount = 300
        )
        val payment4 = Payment(
            id = 4,
            startDate = LocalDate.of(2024, 5, 25),
            dueDate = LocalDate.of(2024, 6, 25),
            paymentAmount = 300
        )
        val payment5 = Payment(
            id = 5,
            startDate = LocalDate.of(2024, 4, 25),
            dueDate = LocalDate.of(2024, 5, 25),
            paymentAmount = 300
        )
        val payment6 = Payment(
            id = 6,
            startDate = LocalDate.of(2024, 3, 25),
            dueDate = LocalDate.of(2024, 4, 25),
            paymentAmount = 300
        )
        val payment7 = Payment(
            id = 7,
            startDate = LocalDate.of(2024, 2, 25),
            dueDate = LocalDate.of(2024, 3, 25),
            paymentAmount = 300
        )


        val paymentList =
            listOf<Payment>(payment, payment2, payment3, payment4, payment5, payment6, payment7)


        val checkUp1 = CheckUp(
            id = 1,
            date = LocalDate.of(2024, 1, 20),
            heartRate = 60,
            cholesterol = 180,
            obesityPercentage = 20,
            cancerProbability = 10
        )
        val checkUp2 = CheckUp(
            id = 2,
            date = LocalDate.of(2024, 1, 20),
            heartRate = 60,
            cholesterol = 180,
            obesityPercentage = 20,
            cancerProbability = 10
        )
        val checkUp3 = CheckUp(
            id = 3,
            date = LocalDate.of(2024, 1, 20),
            heartRate = 60,
            cholesterol = 180,
            obesityPercentage = 20,
            cancerProbability = 10
        )
        val checkUp4 = CheckUp(
            id = 4,
            date = LocalDate.of(2024, 1, 20),
            heartRate = 60,
            cholesterol = 180,
            obesityPercentage = 20,
            cancerProbability = 10
        )
        val checkUp5 = CheckUp(
            id = 5,
            date = LocalDate.of(2024, 1, 20),
            heartRate = 60,
            cholesterol = 180,
            obesityPercentage = 20,
            cancerProbability = 10
        )
        val checkUp6 = CheckUp(
            id = 6,
            date = LocalDate.of(2024, 1, 20),
            heartRate = 60,
            cholesterol = 180,
            obesityPercentage = 20,
            cancerProbability = 10
        )
        val checkUp7 = CheckUp(
            id = 7,
            date = LocalDate.of(2024, 1, 20),
            heartRate = 60,
            cholesterol = 180,
            obesityPercentage = 20,
            cancerProbability = 10
        )

        val checkUpList = listOf<CheckUp>(checkUp1, checkUp2, checkUp3, checkUp4, checkUp5, checkUp6, checkUp7)

        val azim = User(
            id = 1,
            "Azim",
            "Azizov",
            birthDate = LocalDate.of(2003, 12, 9),
            gender = Gender.MALE,
            email = "azimazizov@gmail.com",
            phoneNumber = "+9946562196"
        )
    }
}