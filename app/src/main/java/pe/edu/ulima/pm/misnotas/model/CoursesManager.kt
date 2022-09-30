package pe.edu.ulima.pm.misnotas.model

import androidx.compose.ui.graphics.Color

data class Course(
    val id : String,
    val name : String,
    val color : Color
)

// Fachada (Faccade)
class CoursesManager private constructor() {
    private val courses = mutableListOf<Course>()

    init {
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
        courses.add(Course("112312312", "Programación Movil", Color.Blue))
    }

    companion object{
        private var instance : CoursesManager? = null // propiedad de clase

        fun getInstance() : CoursesManager {
            if (instance == null) {
                instance = CoursesManager()
            }
            return instance!!
        }
    }
    fun getCourses() : MutableList<Course> {
        return courses
    }
}












