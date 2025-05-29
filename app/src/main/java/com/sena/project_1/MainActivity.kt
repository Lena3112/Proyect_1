package com.sena.project_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.sena.project_1.ui.theme.Proyect_1Theme
import com.sena.project_1.view.NavegacionApp
import com.sena.project_1.view.Navigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Proyect_1Theme {
                //Navigation()
                NavegacionApp()
            }
        }
    }
}











