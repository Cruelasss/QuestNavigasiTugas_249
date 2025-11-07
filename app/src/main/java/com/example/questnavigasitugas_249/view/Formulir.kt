package com.example.questnavigasitugas_249.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasitugas_249.R



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormDataDiri(
    onBackToBtnClick: () -> Unit
) {

    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }
    var textStatus by remember { mutableStateOf(value = "") }


    var dataNama by remember { mutableStateOf(value = "") }
    var dataAlamat by remember { mutableStateOf(value = "") }
    var dataJenis by remember { mutableStateOf(value = "") }
    var dataStatus by remember { mutableStateOf(value = "") }


    val gender: List<String> = listOf("Laki-laki", "Perempuan")
    val status1: List<String> = listOf("Janda", "Lajang", "Duda")


    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFB39DDB))
                    .padding(vertical = 20.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Formulir Pendaftaran",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 10.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
            ) {

                Text(text = "NAMA LENGKAP", modifier = Modifier.padding(all = 10.dp), fontWeight = FontWeight.Bold)
                OutlinedTextField(
                    value = textNama,
                    onValueChange = { textNama = it },
                    singleLine = true,
                    shape = MaterialTheme.shapes.large,
                    label = { Text(text = "Isian Nama Lengkap") },
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                    )
                )

                Text(text = "JENIS KELAMIN", modifier = Modifier.padding(all = 10.dp), fontWeight = FontWeight.Bold)
                Column {
                    gender.forEach { item ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .selectable(
                                    selected = textJK == item,
                                    onClick = { textJK = item }
                                )
                                .padding(horizontal = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = textJK == item,
                                onClick = { textJK = item }
                            )
                            Text(
                                text = item,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }
                Text(text = "STATUS PERKAWINAN", modifier = Modifier.padding(all = 10.dp), fontWeight = FontWeight.Bold)
                Column {
                    status1.forEach { item ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .selectable(
                                    selected = textStatus == item,
                                    onClick = { textStatus = item }
                                )
                                .padding(horizontal = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = textStatus == item,
                                onClick = { textStatus = item }
                            )
                            Text(
                                text = item,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }

                Text(text = "ALAMAT LENGKAP", modifier = Modifier.padding(all = 10.dp), fontWeight = FontWeight.Bold)
                OutlinedTextField(
                    value = textAlamat,
                    onValueChange = { textAlamat = it },
                    singleLine = true,
                    shape = MaterialTheme.shapes.large,
                    label = { Text(text = "Alamat Lengkap") },
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                    )
                )

                Spacer(modifier = Modifier.height(10.dp))


                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    onClick = {
                        dataNama = textNama
                        dataAlamat = textAlamat
                        dataJenis = textJK
                        dataStatus = textStatus

                        onBackToBtnClick()
                    }
                ) {
                    Text(text = stringResource(id = R.string.submit))
                }
            }
        }
    }
}