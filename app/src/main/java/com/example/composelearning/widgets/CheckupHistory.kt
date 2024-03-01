package com.example.composelearning.widgets

import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.composelearning.data.CheckUp
import java.time.format.DateTimeFormatter


@Composable
fun CheckupHistory(checkUps: List<CheckUp>) {
    LazyColumn {
        items(checkUps) {
            ExpandableDropdown(checkUp = it)
            Spacer(Modifier.height(10.dp))
        }
    }
}


@Composable
fun ExpandableDropdown(checkUp: CheckUp) {
    val dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy")
    val checkUpDate = dateFormat.format(checkUp.date)
    var isExpanded by remember { mutableStateOf(false) }

    val transition = updateTransition(isExpanded, label = "")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { isExpanded = !isExpanded }
        ) {
            Text("Date: $checkUpDate", modifier = Modifier.weight(1f))
            Icon(
                imageVector = if (isExpanded) Icons.Default.ArrowDropDown else Icons.Default.ArrowRight,
                contentDescription = null
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        val height by transition.animateDp(label = "") { state ->
            if (state) 120.dp else 0.dp
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray.copy(alpha = 0.2f))
                .clip(MaterialTheme.shapes.medium)
                .padding(16.dp)
                .height(height)
        ) {
            CheckUpDataBox(checkUp = checkUp)
        }
    }
}

