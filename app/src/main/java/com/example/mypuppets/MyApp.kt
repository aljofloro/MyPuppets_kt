package com.example.mypuppets

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyApp() {
  Scaffold(content = {
    CentroAdopcionContent()
  })
}