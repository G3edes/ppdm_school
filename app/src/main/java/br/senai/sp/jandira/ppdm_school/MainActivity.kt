package br.senai.sp.jandira.ppdm_school

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.ppdm_school.screen.CourseScreen
import br.senai.sp.jandira.ppdm_school.screen.HomeScreen
import br.senai.sp.jandira.ppdm_school.screen.PerfilScreen
import br.senai.sp.jandira.ppdm_school.screen.StudentsScreen
import br.senai.sp.jandira.ppdm_school.ui.theme.Ppdm_schoolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ppdm_schoolTheme{
                var navegacao= rememberNavController()
                NavHost(
                    navController = navegacao,
                    startDestination = "home",
                )
                {
                    composable(route="home"){ HomeScreen(navegacao)}
                    composable(route="dados"){ CourseScreen(navegacao) }
                    composable(route="students") { StudentsScreen(navegacao)  }
                    composable(route="perfil") { PerfilScreen(navegacao)  }
                }
            }

        }
    }
}
