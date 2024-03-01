package com.example.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelearning.data.BootStrapData
import com.example.composelearning.ui.theme.ComposeLearningTheme
import com.example.composelearning.widgets.InsuranceBox
import com.example.composelearning.widgets.PaidHistory


@OptIn(ExperimentalFoundationApi::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val bankList = listOf(
            "Active",
            "History",
            "Profile"
        )

        setContent {
            ComposeLearningTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {

                    var selectedTabRowIndex by remember {
                        mutableIntStateOf(0)
                    }

                    val pagerState = rememberPagerState {
                        bankList.size
                    }

                    LaunchedEffect(selectedTabRowIndex) {
                        pagerState.animateScrollToPage(selectedTabRowIndex)
                    }

                    LaunchedEffect(pagerState.currentPage, pagerState.isScrollInProgress) {

                        if (!pagerState.isScrollInProgress) {
                            selectedTabRowIndex = pagerState.currentPage

                        }
                    }


                    Column(modifier = Modifier.fillMaxSize()) {

                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ) {
                            bankList.forEachIndexed { index, bankText ->
                                Button(
                                    onClick = { selectedTabRowIndex = index },
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = if (index == selectedTabRowIndex) {
                                            Color.Black
                                        } else {
                                            Color.White
                                        }
                                    ),
                                    contentPadding = PaddingValues(8.dp),
                                    shape = RoundedCornerShape(16.dp),
                                    modifier = Modifier
                                        .height(IntrinsicSize.Min)
                                        .width(100.dp)
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Text(
                                            text = bankText,
                                            color = if (index == selectedTabRowIndex) {
                                                Color.White
                                            } else {
                                                Color.Black
                                            },
                                            fontSize = 20.sp
                                        )
                                    }
                                }
                            }
                        }

                        HorizontalPager(
                            state = pagerState,
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f)
                        ) { index ->
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(start = 20.dp, end = 20.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                when (index) {
                                    0 -> Column(verticalArrangement = Arrangement.SpaceBetween) {
                                        InsuranceBox(
                                            title = "Insurance Type",
                                            payment = BootStrapData.payment7
                                        )
                                        Spacer(modifier = Modifier
                                            .fillMaxWidth()
                                            .height(50.dp))
                                        PaidHistory(list = BootStrapData.list)
                                    }

                                    else -> Column() {}
                                }


                            }
                        }

                    }
                }
            }
        }
    }
}



