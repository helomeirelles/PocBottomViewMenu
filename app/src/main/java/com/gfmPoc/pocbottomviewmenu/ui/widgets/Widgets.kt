package com.gfmPoc.pocbottomviewmenu.ui.widgets

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.gfmPoc.pocbottomviewmenu.R
import com.gfmPoc.pocbottomviewmenu.ui.navigation.NavigationBarItem
import com.gfmPoc.pocbottomviewmenu.ui.utils.AppColors

@Composable
fun BottomNavigationMenu(navController: NavController, selectIcon: Int = 0) {

    val items = listOf(
        NavigationBarItem.Fundraiser,
        NavigationBarItem.Donations,
        NavigationBarItem.Updates,
        NavigationBarItem.Transfers,
        NavigationBarItem.Account
    )


    BottomNavigation(elevation = 0.dp, backgroundColor = Color.White, contentColor = Color.White) {

        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route

        items.forEach { item ->

            BottomNavigationItem(icon = { Image(
                painter = painterResource(id = if(item.route != currentRoute) item.icon else item.selectedIcon),
                contentDescription = item.name
            )  },
                label = { Text(text = item.name, color = if(currentRoute != item.route) AppColors.lightGrey else AppColors.appGreen, fontSize = 9.sp)  },
                selectedContentColor = Color.White,
                alwaysShowLabel = true,
                selected = false,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                })
        }
    }
}
