package pe.edu.ulima.pm.misnotas.presentation.screens

import android.util.Log
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun AccountScreen() {
    val contador = remember {
        mutableStateOf(0)
    }
    val texto = remember {
        mutableStateOf("")
    }

    val aumentarContador = {
        contador.value = contador.value + 1
        Log.i("contador", contador.value.toString())
    }

    LaunchedEffect(key1 = true){
        aumentarContador()
    }

    Text(text = "Account Screen")
    OutlinedTextField(
        value = texto.value,
        onValueChange = {
            texto.value = it
        }
    )
}