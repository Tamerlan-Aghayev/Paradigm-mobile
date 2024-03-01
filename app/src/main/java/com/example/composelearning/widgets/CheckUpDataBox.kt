package com.example.composelearning.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.composelearning.data.CheckUp

@Composable
fun CheckUpDataBox(checkUp: CheckUp) {
    Column(modifier = Modifier.padding(start = 10.dp, end = 10.dp)) {
        Spacer(Modifier.height(5.dp))
        Row {
            Text(text = "Heart rate")
            Spacer(modifier = Modifier.weight(1.0F))
            Text(text = checkUp.heartRate.toString() + "/s")
        }
        Spacer(Modifier.height(5.dp))
        Row {
            Text(text = "Cholesterol")
            Spacer(modifier = Modifier.weight(1.0F))
            Text(text = checkUp.cholesterol.toString() + "mg/dL")
        }
        Spacer(Modifier.height(5.dp))

        Row {
            Text(text = "Obesity Percentage")
            Spacer(modifier = Modifier.weight(1.0F))
            Text(text = checkUp.obesityPercentage.toString() + "%")
        }
        Spacer(Modifier.height(5.dp))

        Row {
            Text(text = "Cancer probability")
            Spacer(modifier = Modifier.weight(1.0F))
            Text(text = checkUp.cancerProbability.toString() + "%")
        }
    }
}