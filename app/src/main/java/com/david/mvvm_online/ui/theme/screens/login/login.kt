package com.david.mvvm_online.ui.theme.screens.login

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.david.mvvm_online.R
import com.david.mvvm_online.navigation.ROUTE_LOGIN

@Composable
fun loginscreen(navController: NavHostController) {
 var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.redbull),
            contentDescription = "logo",
            modifier = Modifier
                .size(
                    200.dp
                )
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Login",
            color = Color.Black,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(value = email, onValueChange = {
                 email=it
        }, label = {
            Text(text = "Email address")
        })
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(value = password, onValueChange = {
                           password=it
        }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {

                navController.navigate(ROUTE_LOGIN)

            },
            modifier = Modifier
                .fillMaxWidth())
        {Text(text = "Login")

        }

        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "Or sign in with")

        Spacer(modifier = Modifier.height(4.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){


            Image(painter = painterResource(id = R.drawable.facebook), contentDescription = "",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //facebook clickable
                    })
            Image(painter = painterResource(id = R.drawable.instagram), contentDescription = "",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //instagram clickable
                    })
            Image(painter = painterResource(id = R.drawable.twitter), contentDescription = "",
                modifier = Modifier
                    .size(45.dp)
                    .clickable {
                        //twitter clickable
                    })


        }
    }
}
    @Preview
@Composable
private fun loginpre() {
        loginscreen(navController = rememberNavController())
    
}


