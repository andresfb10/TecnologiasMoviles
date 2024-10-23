package co.edu.unab.raulbeltran.gymfittrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.edu.unab.raulbeltran.gymfittrack.ui.theme.GymFitTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val myNavController = rememberNavController()

            NavHost(
                navController = myNavController,
                startDestination = "Login"
            ) {
                composable("Login"){ LoginScreen(myNavController)  }
                composable("Register") { RegisterScreen(myNavController )  }
                composable("Menu") { MenuScreen(myNavController )  }
                 }
            }
        }
    }

