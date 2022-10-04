package pe.edu.ulima.pm.misnotas.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import pe.edu.ulima.pm.misnotas.R

@Composable
fun DrawerMenu(
    navController: NavController,
    onCloseDrawer : () -> Unit,
    onChangeTitle : (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                start = 24.dp,
                end = 24.dp
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo ULima" 
        )
        Divider(
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Cursos",
            modifier = Modifier
                .height(32.dp)
                .clickable {
                    navController.navigate("courses")
                    onCloseDrawer()
                    onChangeTitle("Cursos")
                }
        )
        Divider(
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Mi cuenta",
            modifier = Modifier
                .height(32.dp)
                .clickable {
                    navController.navigate("account")
                    onCloseDrawer()
                    onChangeTitle("Mi Cuenta")
                }
        )
    }
}