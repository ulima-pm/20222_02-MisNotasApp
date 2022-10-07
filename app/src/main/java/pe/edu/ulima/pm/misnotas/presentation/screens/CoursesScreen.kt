package pe.edu.ulima.pm.misnotas.presentation.screens

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import pe.edu.ulima.pm.misnotas.model.Course
import pe.edu.ulima.pm.misnotas.model.CoursesManager
import pe.edu.ulima.pm.misnotas.presentation.components.CourseListType
import pe.edu.ulima.pm.misnotas.presentation.components.CoursesList
import pe.edu.ulima.pm.misnotas.presentation.components.Header
import pe.edu.ulima.pm.misnotas.presentation.viewmodels.CoursesViewModel

@Composable
fun CoursesScreen(
    coursesViewModel : CoursesViewModel = viewModel()
) {
    LaunchedEffect(key1 = true){
        coursesViewModel.getCourses()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Header()
        CoursesList(
            courses = coursesViewModel.coursesList,
            type = CourseListType.Grid
        )
    }
}

@Composable
@Preview(showBackground = true)
fun ShowCoursesScreen() {
    CoursesScreen()
}