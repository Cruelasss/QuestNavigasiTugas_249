package com.example.questnavigasitugas_249.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn (ExperimentalMaterial3Api::class))
        @Composable
        fun FormDataDiri(
            onBackToBtnClick: () -> Unit
        ){
            var textNama by remember { mutableStateOf(value = "") }
            var textAlamat by remember { mutableStateOf(value = "") }
            var textJK by remember { mutableStateOf(value = "") }
            var textStatus by remember { mutableStateOf("") }

            var nama by remember { mutableStateOf(value = "") }
            var alamat by remember { mutableStateOf(value = "") }
            var jenis by remember { mutableStateOf(value = "") }
            var status by remember { mutableStateOf("") }

            val gender: List<String> = listOf("Laki-laki", "Perempuan")
            val status1: List<String> = listOf("Janda", "Lajang", "Duda")

            Box(modifier = Modifier.fillMaxSize()
                    Column(modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFB39DDB))
                        .padding(vertical = 20.dp)
                ){
                    Text(
                        text = "Formulir Pendaftaran",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            ) {

        }
