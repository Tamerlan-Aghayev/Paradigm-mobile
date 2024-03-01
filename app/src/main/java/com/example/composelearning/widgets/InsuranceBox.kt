package com.example.composelearning.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelearning.data.Payment
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

@Composable
fun InsuranceBox(
    title: String,
    payment: Payment
) {
    val dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy")
    val formattedStartDate = dateFormat.format(payment.startDate)
    val formattedDueDate = dateFormat.format(payment.dueDate)
    val daysBetweenStartAndCurrent = ChronoUnit.DAYS.between(payment.startDate, payment.currentDate)
    val totalDays = ChronoUnit.DAYS.between(payment.startDate, payment.dueDate)

    val progress = daysBetweenStartAndCurrent.toDouble() / totalDays.toDouble()
    val remainingMonths = payment.dueDate.monthValue - payment.currentDate.monthValue
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .height(IntrinsicSize.Min)
            .fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        Column {
            Row(horizontalArrangement = Arrangement.Center) {
                Spacer(modifier = Modifier.weight(1.0F))
                Text(text = title, fontSize = 20.sp)
                Spacer(modifier = Modifier.weight(1.0F))

            }
            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Date: $formattedStartDate")
            Row {
                LinearProgressIndicator(
                    progress = progress.toFloat(),
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 16.dp, end = 16.dp)
                )
                Column {
                    Text(text = "Remaining")
                    Text(text = "$remainingMonths months")
                }
            }

            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Due: $formattedDueDate")
                Spacer(modifier = Modifier.weight(1.0F))

                Column {
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "${payment.paymentAmount}\u20BC", fontSize = 25.sp)
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray
                )
            ) {
                Text("Pay Now", color = Color.White, fontSize = 20.sp)
            }
        }


    }

}