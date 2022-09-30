package pe.edu.ulima.pm.misnotas.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import pe.edu.ulima.pm.misnotas.presentation.components.CoursesList
import pe.edu.ulima.pm.misnotas.presentation.components.Header

@Composable
fun CoursesScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Header()
        CoursesList()
    }
}