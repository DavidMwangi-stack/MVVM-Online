package com.david.mvvm_online.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.david.mvvm_online.navigation.ROUTE_ABOUT
import com.david.mvvm_online.navigation.ROUTE_LOGIN


@Composable
fun Homescreen(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Magenta)) {


        Text(
            text = "This is highlands",
            color = Color.Green,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive
           // fontFamily = androidx.compose.ui.text.font.FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(25.dp))
        Button(
            onClick = {
                navController.navigate(ROUTE_LOGIN)

            },
            modifier = Modifier
                .width(300.dp)
        ) {
            Text(text = "Login page")

        }

        Spacer(modifier = Modifier.height(25.dp))
        Button(
            onClick = {
                navController.navigate(ROUTE_ABOUT)

            },
            modifier = Modifier
                .width(300.dp)
        ) {
            Text(text = "About page")

        }
    }

}
    @Preview
    @Composable
    private fun Homepre() {
        Homescreen(navController = rememberNavController())
    }
