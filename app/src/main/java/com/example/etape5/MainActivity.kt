package com.example.etape5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.etape5.ui.theme.Etape5Theme

// Assurez-vous d'importer votre composable AllTasksCompletedScreen
import com.example.etape5.AllTasksCompletedScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Etape5Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Applique le padding interne ici
                    AllTasksCompletedScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AllTasksCompletedScreenPreview() {
    Etape5Theme {
        AllTasksCompletedScreen()
    }
}
