package com.sena.project_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sena.project_1.ui.theme.Project_1Theme
import com.sena.project_1.view.ActivityOne
import com.sena.project_1.view.ActivityThree
import com.sena.project_1.view.ActivityTwo


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_1Theme {
                ActivityOne()
            }
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview() {
    Project_1Theme {
        ActivityOne()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Dos() {
    Project_1Theme {
        ActivityTwo()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Tres() {
    Project_1Theme {
        ActivityThree()
    }
}
