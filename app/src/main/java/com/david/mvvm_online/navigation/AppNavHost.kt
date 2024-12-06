package com.david.mvvm_online.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.david.mvvm_online.ui.theme.screens.about.Aboutscreen
import com.david.mvvm_online.ui.theme.screens.home.Homescreen
import com.david.mvvm_online.ui.theme.screens.login.loginscreen
import com.david.mvvm_online.ui.theme.screens.signup.signupscreen
import com.david.mvvm_online.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination: String= ROUTE_SPLASH) {
    NavHost(navController =navController,
        startDestination =startDestination,
        modifier=modifier){

        composable(ROUTE_HOME){
            Homescreen(navController)
        }
        composable(ROUTE_ABOUT){
            Aboutscreen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_LOGIN){
             loginscreen(navController)
        }
        composable(ROUTE_SIGNUP){
            signupscreen(navController)
        }
    }

}