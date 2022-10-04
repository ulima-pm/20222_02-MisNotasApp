package pe.edu.ulima.pm.misnotas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.ulima.pm.misnotas.model.CoursesManager
import pe.edu.ulima.pm.misnotas.presentation.screens.CoursesScreen
import pe.edu.ulima.pm.misnotas.presentation.screens.MainNavigationScreen
import pe.edu.ulima.pm.misnotas.ui.theme.MisNotasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val courses = CoursesManager.getInstance().getCourses()

        setContent {
            MisNotasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainNavigationScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MisNotasTheme {
        Greeting("Android")
    }
}