package com.example.week_2.soal1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material3.Icon
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import androidx.compose.runtime.*
import androidx.compose.material3.*



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            spotify()
        }
    }
}

@Composable
fun spotify(){
    var sliderPosition by remember { mutableFloatStateOf(0.15f) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFA5A5))
            .statusBarsPadding()
            .navigationBarsPadding()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = "Back",
                tint = Color.Black
            )
            Text(
                text = "Liked Song",
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Icon(
                imageVector = Icons.Default.MoreHoriz,
                contentDescription = "Option",
                tint = Color.Black
            )
        }

        AsyncImage(
            model = "https://gambarnya_gabisa_ko_R_ga_mau_diimport.jpg",
            contentDescription = "Album Cover",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.DarkGray)
        )
        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Ga bisa ko fotonya",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = "Rnya gamau di import",
                    fontSize = 16.sp,
                    color = Color.Black.copy(alpha = 0.7f)
                )
            }
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Like",
                tint = Color.Black,
                modifier = Modifier.size(28.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier.fillMaxWidth()) {
            Slider(
                value = sliderPosition,
                onValueChange = { sliderPosition = it},
                colors = SliderDefaults.colors(
                    
                )
            )
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun spotifyPreview(){
    spotify()
}