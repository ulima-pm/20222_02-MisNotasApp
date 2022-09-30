package pe.edu.ulima.pm.misnotas.presentation.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import pe.edu.ulima.pm.misnotas.R

@Composable
fun Header() {
    Text(
        text = LocalContext.current.getString(
            R.string.courses_list_title
        )
    )
}