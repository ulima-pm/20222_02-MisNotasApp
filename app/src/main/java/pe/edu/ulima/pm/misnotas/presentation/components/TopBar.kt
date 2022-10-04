package pe.edu.ulima.pm.misnotas.presentation.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable

@Composable
fun TopBar(
    title : String,
    onOpenDrawer : () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = title)
        },
        navigationIcon = {
            IconButton(
                onClick = { onOpenDrawer() },
            ) {
                Icon(
                    imageVector = Icons.Filled.Menu ,
                    contentDescription = "Menu drawer"
                )
            }
        }
    )
}