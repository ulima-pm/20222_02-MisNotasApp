package pe.edu.ulima.pm.misnotas.presentation.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import pe.edu.ulima.pm.misnotas.model.Course

@Composable
fun CoursesList(
    courses : MutableList<Course>
) {
    LazyColumn() {
        items(courses.size) { index ->
            CourseItem(courseData = courses[index])
        }
    }
}