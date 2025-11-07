package com.example.questnavigasitugas_249.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

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

        }