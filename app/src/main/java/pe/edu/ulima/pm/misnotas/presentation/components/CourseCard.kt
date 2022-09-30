package pe.edu.ulima.pm.misnotas.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.ulima.pm.misnotas.model.Course

@Composable
fun CourseCard(
    courseData : Course
) {
    Card(
        elevation = 4.dp
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
                .height(100.dp),
        ) {
            Text(
                text = courseData.id,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.TopCenter)
            )
            Text(
                text = courseData.name,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}