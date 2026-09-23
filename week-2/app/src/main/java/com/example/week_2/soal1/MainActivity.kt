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
import androidx.compose.foundation.shape.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll


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
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .background(Color.Black, shape = RoundedCornerShape(2.dp))
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "0:00",
                    fontSize = 12.sp,
                    color = Color.Black.copy(alpha = 0.7f)
                )
                Text(
                    text = "-2:12",
                    fontSize = 12.sp,
                    color = Color.Black.copy(alpha = 0.7f)
                )
            }
        }
        Spacer(modifier = Modifier.height(32.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.SkipPrevious,
                contentDescription = "Previous",
                tint = Color.Black,
                modifier = Modifier.size(40.dp)
            )
            Box(
                modifier = Modifier
                    .size(72.dp)
                    .background(Color.Black, shape = CircleShape),
                contentAlignment = Alignment.Center
            ){
                Icon(
                    imageVector = Icons.Default.Pause,
                    contentDescription = "Pause",
                    tint = Color.White,
                    modifier = Modifier.size(36.dp)
                )
            }
            Icon(
                imageVector = Icons.Default.SkipNext,
                contentDescription = "Next",
                tint = Color.Black,
                modifier = Modifier.size(40.dp)
            )
        }
        Spacer(modifier = Modifier.height(32.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(
                    color = Color(0xFF421A1A),
                    shape = RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp)
                )
                .padding(horizontal = 20.dp, vertical = 16.dp)
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = "Lyrics",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "I don't care what people say\n" +
                            "We both know I couldn't change you\n" +
                            "I guess you could say the same\n" +
                            "Can't rearrange truth\n" +
                            "I've never seen someone lie like you do\n" +
                            "So much, even you start to think it's true\n" +
                            "Get me out of this loop\n" +
                            "So now we play our separate scenes\n" +
                            "Now, now she's in my bed laying on your chest\n" +
                            "Now I'm in my head, wondering how it ends\n" +
                            "I'll be the first to say I'm sorry\n" +
                            "Now you got me feeling sorry\n" +
                            "I showed you all my demons, all my lies\n" +
                            "Yet you played me like Atari\n" +
                            "Now it's like I'm looking in the mirror\n" +
                            "Hope you feel alright when you're in her\n" +
                            "I found a good boy and he's on my side\n" +
                            "You're just my eternal sunshine, sunshine\n" +
                            "So I try to wipe my mind\n" +
                            "Just so I feel less insane\n" +
                            "Rather feel painless\n" +
                            "I'd rather forget than know, know for sure\n" +
                            "What we could've fought through behind this door\n" +
                            "So I close it and move\n" +
                            "So now we play our separate scenes\n" +
                            "Now, now he's in your bed, laying on my chest\n" +
                            "Now I'm in my head, wondering how it ends, ends, ends\n" +
                            "I'll be the first to say I'm sorry\n" +
                            "Now you got me feeling sorry\n" +
                            "I showed you all my demons, all my lies\n" +
                            "Yet you played me like Atari\n" +
                            "Now it's like I'm looking in the mirror\n" +
                            "Hope you feel alright when you're in her\n" +
                            "I found a good boy and he's on my side\n" +
                            "You're just my eternal sunshine, sunshine\n" +
                            "Won't break, can't shake\n" +
                            "This fate, rewrite\n" +
                            "Deep breaths, tight chest\n" +
                            "Life, death, rewind\n" +
                            "Won't break, can't shake\n" +
                            "This fate, rewrite\n" +
                            "Deep breaths, tight chest\n" +
                            "Life, death\n" +
                            "I'll be the first to say I'm sorry\n" +
                            "Now you got me feeling sorry\n" +
                            "I showed you all my demons, all my lies\n" +
                            "Yet you played me like Atari\n" +
                            "Now it's like I'm looking in the mirror\n" +
                            "Hope you feel alright when you're in her\n" +
                            "I found a good boy and he's on my side\n" +
                            "You're just my eternal sunshine, sunshine\n" +
                            "Won't break, can't shake\n" +
                            "This fate, rewrite\n" +
                            "Deep breaths, tight chest\n" +
                            "Life, death, rewind\n" +
                            "Won't break, can't shake\n" +
                            "This fate, rewrite\n" +
                            "Deep breaths, tight chest\n" +
                            "Life, death",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    lineHeight = 26.sp
                )
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun spotifyPreview(){
    spotify()
}