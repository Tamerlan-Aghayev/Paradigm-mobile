package com.example.composelearning.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelearning.data.User
import java.time.format.DateTimeFormatter

@Composable
fun Profile(user: User) {
    val dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy")
    val dob = dateFormat.format(user.birthDate)
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .height(IntrinsicSize.Min)
            .fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        Column {
            Text("Profile", fontSize = 20.sp)
            Spacer(modifier = Modifier.height(5.dp))
            Spacer(modifier = Modifier
                .height(1.dp)
                .background(Color.White))
            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Name")
                Spacer(modifier = Modifier.weight(1.0F))
                Text(user.name)
            }
            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Surname")
                Spacer(modifier = Modifier.weight(1.0F))
                Text(user.surname)
            }

            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Birth date")
                Spacer(modifier = Modifier.weight(1.0F))
                Text(dob)
            }
            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Gender")
                Spacer(modifier = Modifier.weight(1.0F))
                Text(user.gender.name)
            }
            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Email")
                Spacer(modifier = Modifier.weight(1.0F))
                Text(user.email)
            }
            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Text(text = "Phone Number")
                Spacer(modifier = Modifier.weight(1.0F))
                Text(user.phoneNumber)
            }

        }
    }
}