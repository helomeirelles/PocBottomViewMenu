package com.gfmPoc.pocbottomviewmenu.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gfmPoc.pocbottomviewmenu.ui.screens.*
import com.gfmpoc.donations.screens.Donations2Screen
import com.gfmpoc.fundraiser.Fundraiser2Screen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationScreens.FundraiserScreen.name) {
        composable(route = NavigationScreens.FundraiserScreen.name) {
            Fundraiser2Screen(navController)
        }
        composable(route = NavigationScreens.UpdatesScreen.name) {
            UpdatesScreen(navController)
        }
        composable(route = NavigationScreens.DonationsScreen.name) {
            Donations2Screen(navController)
        }
        composable(route = NavigationScreens.TransfersScreen.name) {
            TransfersScreen(navController)
        }
        composable(route = NavigationScreens.AccountScreen.name) {
            AccountScreen(navController)
        }
    }
}