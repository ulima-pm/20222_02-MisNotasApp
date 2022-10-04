package pe.edu.ulima.pm.misnotas.presentation.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import pe.edu.ulima.pm.misnotas.presentation.screens.AccountScreen
import pe.edu.ulima.pm.misnotas.presentation.screens.CoursesScreen

@Composable
fun NavigationGraph(
    navController : NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "courses"
    ) {
        composable("courses"){
            CoursesScreen()
        }
        composable("account") {
            AccountScreen()
        }
    }
}