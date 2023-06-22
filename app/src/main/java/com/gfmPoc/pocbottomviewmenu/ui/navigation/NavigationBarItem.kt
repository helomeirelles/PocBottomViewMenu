package com.gfmPoc.pocbottomviewmenu.ui.navigation

import com.gfmPoc.pocbottomviewmenu.R

sealed class NavigationBarItem(
    val route: String,
    val name: String,
    val icon: Int,
    val selectedIcon: Int
) {
    object Fundraiser : NavigationBarItem(
        route = NavigationScreens.FundraiserScreen.name,
        name = "Fundraiser",
        icon = R.drawable.ic_fundraiser,
        selectedIcon = R.drawable.ic_selected_fundraiser
    )

    object Donations : NavigationBarItem(
        route = NavigationScreens.UpdatesScreen.name,
        name = "Donations",
        icon = R.drawable.ic_donations,
        selectedIcon = R.drawable.ic_selected_donations
    )

    object Updates : NavigationBarItem(
        route = NavigationScreens.DonationsScreen.name,
        name = "Updates",
        icon = R.drawable.ic_updates,
        selectedIcon = R.drawable.ic_selected_updates
    )

    object Account : NavigationBarItem(
        route = NavigationScreens.AccountScreen.name,
        name = "Account",
        icon = R.drawable.ic_account,
        selectedIcon = R.drawable.ic_selected_account
    )

    object Transfers : NavigationBarItem(
        route = NavigationScreens.TransfersScreen.name,
        name = "Transfers",
        icon = R.drawable.ic_transfers,
        selectedIcon = R.drawable.ic_selected_transfers
    )
}
