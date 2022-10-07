package pe.edu.ulima.pm.misnotas.presentation.viewmodels

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import pe.edu.ulima.pm.misnotas.model.Course
import pe.edu.ulima.pm.misnotas.model.CoursesManager

class CoursesViewModel : ViewModel() {
    val coursesList = mutableStateListOf<Course>()

    fun getCourses() : Unit {
        CoursesManager.getInstance().getCourses().forEach {
            coursesList.add(it)
        }
    }
}