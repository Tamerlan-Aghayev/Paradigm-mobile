package com.example.composelearning.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelearning.data.Payment

@Composable
fun PaidHistory(
    list: List<Payment>
) {
    var totalPaid = 0
    for (i in list) {
        totalPaid += i.paymentAmount
    }
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(Color.Black)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Total paid", fontSize = 23.sp)
                Spacer(Modifier.weight(1.0F))
                Text(text = totalPaid.toString() + "\$", fontSize = 23.sp)
            }
            Spacer(Modifier.height(5.dp))
            Spacer(
                Modifier
                    .height(1.dp)
                    .background(Color.White)
                    .fillMaxWidth()
            )
            Spacer(Modifier.height(5.dp))

            LazyColumn {
                items(list) {
                    Column {
                        Row(horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(text = "Date: ${it.currentDate}", fontSize = 18.sp)
                            Spacer(Modifier.weight(1.0F))
                            Text(text = it.paymentAmount.toString() + "\u20BC", fontSize = 18.sp)
                        }
                        Spacer(Modifier.height(5.dp))

                    }
                }
            }
        }
    }


}