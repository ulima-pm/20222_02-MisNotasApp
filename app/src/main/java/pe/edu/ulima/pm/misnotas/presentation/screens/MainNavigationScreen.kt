package pe.edu.ulima.pm.misnotas.presentation.screens

import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch
import pe.edu.ulima.pm.misnotas.presentation.components.DrawerMenu
import pe.edu.ulima.pm.misnotas.presentation.components.NavigationGraph
import pe.edu.ulima.pm.misnotas.presentation.components.TopBar

@Composable
fun MainNavigationScreen() {
    val navController = rememberNavController()
    val scaffoldState  = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    val openDrawer : () -> Unit = {
        scope.launch {
            scaffoldState.drawerState.open()
        }

    }
    val closeDrawer : () -> Unit = {
        scope.launch {
            scaffoldState.drawerState.close()
        }
    }
    
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopBar(
                title = "App de Notas",
                onOpenDrawer = openDrawer
            )
        },
        drawerContent = {
            DrawerMenu()
        }
    ) {
        NavigationGraph(
            navController = navController
        )
    }
}