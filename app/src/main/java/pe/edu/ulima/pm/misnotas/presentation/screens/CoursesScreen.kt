package pe.edu.ulima.pm.misnotas.presentation.screens

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.ulima.pm.misnotas.model.CoursesManager
import pe.edu.ulima.pm.misnotas.presentation.components.CoursesList
import pe.edu.ulima.pm.misnotas.presentation.components.Header

@Composable
fun CoursesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Header()
        CoursesList(
            courses = CoursesManager.getInstance().getCourses()
        )
    }
}

@Composable
@Preview(showBackground = true)
fun ShowCoursesScreen() {
    CoursesScreen()
}