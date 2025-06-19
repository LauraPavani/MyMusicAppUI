package com.example.mymusicappui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mymusicappui.ui.theme.BrowseScreen
import com.example.mymusicappui.ui.theme.Home
import com.example.mymusicappui.ui.theme.Library

@Composable
fun Navigation(navController: NavController, viewModel: MainViewModel, pd: PaddingValues){
    NavHost(navController = navController as NavHostController,
        startDestination = Screen.DrawerScreen.Account.route,
        modifier = Modifier.padding(pd) ){

        composable(Screen.BottomScreen.Home.bRoute){
            //Add Home Screen
            Home()
        }
        composable(Screen.BottomScreen.Browse.bRoute){
            //Add Browser Screen
            BrowseScreen()
        }
        composable(Screen.BottomScreen.Library.bRoute){
            //Add Library Screen
            Library()
        }
        composable(Screen.DrawerScreen.Account.route){
            AccountView()
        }
        composable(Screen.DrawerScreen.Subscription.route){
            SubscriptionView()
        }
    }
}