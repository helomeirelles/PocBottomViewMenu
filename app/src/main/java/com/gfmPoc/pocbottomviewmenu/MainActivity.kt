package com.gfmPoc.pocbottomviewmenu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.gfmPoc.pocbottomviewmenu.ui.navigation.Navigation
import com.gfmPoc.pocbottomviewmenu.ui.theme.PocBottomViewMenuTheme
import com.gfmPoc.pocbottomviewmenu.ui.widgets.BottomNavigationMenu

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PocBottomViewMenuTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationMenu(navController, R.drawable.ic_green_home) },
        content = { padding ->
            Box(modifier = Modifier.padding(padding)) {
                Navigation(navController)
            }
        },
        backgroundColor = Color.White
    )

}

@Preview
@Composable
fun MainPreview(){
    MainScreen()
}