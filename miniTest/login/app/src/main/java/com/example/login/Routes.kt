package com.example.login

sealed class Routes(val route: String) {
    object Login : Routes("Login")
}