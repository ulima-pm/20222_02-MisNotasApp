package pe.edu.ulima.pm.misnotas.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import pe.edu.ulima.pm.misnotas.R

@Composable
fun DrawerMenu() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                start = 24.dp,
                end = 48.dp
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo ULima" 
        )
        Divider(
            modifier = Modifier.fillMaxWidth()
        )
        Text(text = "Cursos")
        Text(text = "Mi cuenta")
    }
}