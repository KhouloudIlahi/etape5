package com.example.etape5

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AllTasksCompletedScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize() // Utilise le modifier passé
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Image des tâches terminées (sans l'extension .png)
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null,
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(24.dp)) // Marge intérieure supérieure de 24dp

        // Texte "All tasks completed" avec police en gras
        Text(
            text = stringResource(id = R.string.all_tasks_completed),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp) // Marge intérieure inférieure de 8dp
        )

        // Texte "Nice work!" avec taille de police de 16sp
        Text(
            text = stringResource(id = R.string.nice_work),
            fontSize = 16.sp
        )
    }
}
