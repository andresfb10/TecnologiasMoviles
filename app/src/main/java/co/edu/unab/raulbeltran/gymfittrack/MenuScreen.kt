package co.edu.unab.raulbeltran.gymfittrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
@OptIn(ExperimentalMaterial3Api ::class)
fun MenuScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Menú", color = Color.White) },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFF388E3C))
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(Color(0xFFECEFF1))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Bienvenido al Menú", fontSize = 24.sp, color = Color(0xFF388E3C))

                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    onClick = { /* Acción para el botón 1 */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White, shape = RoundedCornerShape(8.dp))
                ) {
                    Text("Opción 1", color = Color(0xFF388E3C))
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = { /* Acción para el botón 2 */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White, shape = RoundedCornerShape(8.dp))
                ) {
                    Text("Opción 2", color = Color(0xFF388E3C))
                }

                Spacer(modifier = Modifier.weight(1f)) // Empuja el botón hacia abajo

                Button(
                    onClick = {navController.navigate("login")}, // Cierra la actividad actual y vuelve a la pantalla anterior
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)

                ) {
                    Text("Cerrar Sesión", color = Color.White)
                }
            }
        }
    }
}
