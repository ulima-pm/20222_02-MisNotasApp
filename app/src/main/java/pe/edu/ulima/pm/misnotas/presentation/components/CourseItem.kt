package pe.edu.ulima.pm.misnotas.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.ulima.pm.misnotas.model.Course

@Composable
fun CourseItem(
    courseData : Course
) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .height(100.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = courseData.id,
            fontSize = 20.sp
        )
        Spacer(
            modifier = Modifier.width(20.dp)
        )
        Text(
            text = courseData.name,
            fontSize = 20.sp
        )
    }
}