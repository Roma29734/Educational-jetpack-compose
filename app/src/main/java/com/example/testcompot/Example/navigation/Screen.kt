package com.example.testcompot.Example.navigation

sealed class Screen(val route: String) {
    object MainScreen: Screen("MainScreen")
    object SecondScreen: Screen("SecondScreen")
}
