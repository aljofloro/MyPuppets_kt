package com.example.mypuppets

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun MascotaListItem(mascota: Mascota) {
  Card(modifier = Modifier
    .padding(horizontal = 8.dp, vertical = 8.dp)
    .fillMaxWidth(), elevation = 2.dp,
      shape = RoundedCornerShape(corner = CornerSize(16.dp))
  ){
    Row(modifier = Modifier.fillMaxWidth()) {
      MascotaImage(mascota = mascota)
      Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .align(Alignment.CenterVertically)) {
        Text(text = mascota.title, style = typography.h6)
        Text(text = "VIEW DETAIL", style = typography.caption)
      }
    }
  }
}

@Composable
fun MascotaImage(mascota: Mascota) {
  AsyncImage(model = mascota.mascotaImageUrl
    , contentDescription = mascota.title,
    contentScale = ContentScale.Crop,
    modifier = Modifier
      .padding(8.dp)
      .size(85.dp)
      .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
  )
}