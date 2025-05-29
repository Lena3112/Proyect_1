package com.sena.project_1.view

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavegacionApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "ActivityOne") {
        composable("ActivityOne") { ActivityOne(navController) }
        composable("ActivityTwo") { ActivityTwo(navController) }
        composable("ActivityThree") { ActivityThree(navController) }
    }
}
