package com.david.mvvm_online.ui.theme.screens.about

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.david.mvvm_online.navigation.ROUTE_ABOUT
import com.david.mvvm_online.navigation.ROUTE_HOME

@Composable
fun Aboutscreen(navController:NavHostController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

      Text(text = "This is about screens",
          color = Color.Blue,
          fontSize = 30.sp,
          fontFamily = FontFamily.SansSerif
      )
        Spacer(modifier = Modifier.height(25.dp))
        Button(onClick = {
            navController.navigate(ROUTE_HOME)

        },
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Text(text = "Home page",
                color = Color.Green,
            )

        }
    }
}

@Preview
@Composable
private fun Aboutprev () {
    Aboutscreen(navController = rememberNavController())
}