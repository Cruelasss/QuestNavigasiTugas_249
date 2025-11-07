package com.example.questnavigasitugas_249

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
// Perbaiki package name
import com.example.questnavigasitugas_249.view.DaftarPeserta
import com.example.questnavigasitugas_249.view.FormDataDiri
import com.example.questnavigasitugas_249.view.HomePage

enum class Navigasi {
    Beranda,
    Formulir,
    List
}

@Composable
fun HomeApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Beranda.name,
            modifier = Modifier.padding(isiRuang)
        ) {
            composable(route = Navigasi.Beranda.name) {
                HomePage(
                    // Perbaiki nama callback
                    onNextButtonClicked = {
                        navController.navigate(Navigasi.List.name)
                    }
                )
            }

            composable(route = Navigasi.List.name) {
                DaftarPeserta(
                    onBackToBerandaClick = {
                        cancelAndBackToBeranda(navController)
                    },
                    OnBtnToFormulirClick = {
                        navController.navigate(Navigasi.Formulir.name)
                    }
                )
            }

            composable(route = Navigasi.Formulir.name) {
                FormDataDiri(
                    onBackToBtnClick = {
                        cancelAndBackToList(navController)
                    }
                )
            }
        }
    }
}

private fun cancelAndBackToBeranda(navController: NavController) {
    navController.popBackStack(
        route = Navigasi.Beranda.name,
        inclusive = false
    )
}

private fun cancelAndBackToList(navController: NavController) {
    navController.popBackStack(
        route = Navigasi.List.name,
        inclusive = true
    )
}