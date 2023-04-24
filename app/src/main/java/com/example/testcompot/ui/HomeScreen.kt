package com.example.testcompot.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.testcompot.R

//@Preview(showBackground = true, device = "id:pixel")
@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column {
            GreetingSection()
            CurrentMeditation()
            FunctionalButton()
            RecyclerHistoryOperation()
        }
    }
}

@Composable
fun GreetingSection() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Spending In Compose",
                style = TextStyle(fontSize = 24.sp)
            )

        }
        Icon(
            painter = painterResource(id = R.drawable.image_resourse_1),
            contentDescription = "Search",
            tint = Color.Red,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun CurrentMeditation() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.Red)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = "Daily Thought",
                style = TextStyle(fontSize = 20.sp)
            )
            Text(
                text = "Meditation • 3-10 min",
                style = MaterialTheme.typography.body1,
                color = Color.White
            )
        }
        Box(
//            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Red)
                .padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.image_resourse_1),
                contentDescription = "Play",
                tint = Color.White,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}

@Composable
fun FunctionalButton() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(horizontal = 35.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        Button(
            modifier = Modifier
                .width(140.dp)
                .height(40.dp)
            ,
            onClick = { },

        ) {
            Text(text = "received")
        }
        Button(
            modifier = Modifier
                .width(140.dp)
                .height(40.dp)
            ,
            onClick = { /*TODO*/ }
        ) {
            Text(text = "spend")
        }
    }
}

@Composable
fun RecyclerHistoryOperation() {
    LazyColumn {
        itemsIndexed(
            listOf("Rodrigo", "Benzema", "Griezman", "Neymar", "Mbappe", "Camavinga", "Navas", "Ramos", "Hakimmi")
        ) { index, string ->
            Text(
                text = "item $string",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
            )
        }
    }
}