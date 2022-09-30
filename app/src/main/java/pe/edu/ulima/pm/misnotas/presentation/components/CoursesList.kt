package pe.edu.ulima.pm.misnotas.presentation.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import pe.edu.ulima.pm.misnotas.model.Course

enum class CourseListType {
    List,Grid
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CoursesList(
    courses : MutableList<Course>,
    type : CourseListType
) {
    if (type == CourseListType.List){
        LazyColumn() {
            items(courses.size) { index ->
                CourseItem(courseData = courses[index])
            }
        }
    }else {
        LazyVerticalGrid(
            cells = GridCells.Adaptive(minSize = 128.dp)
        ) {
            items(courses.size) { index ->
                CourseCard(courseData = courses[index])
            }
        }
    }

}