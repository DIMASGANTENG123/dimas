package com.example.bottomnavigasi

sealed class Destination (
    val route: String, val icon:Int, val tittle: String) {
    object Transaction : Destination(
        route = "transactions",
        icon = R.drawable.baseline_account_balance_wallet_24,
        tittle = "transactions"
    )
    object Budgets : Destination(
        route = "budget",
        icon = R.drawable.baseline_attach_money_24,
        tittle = "Budget"
    )
    object  Tasks : Destination(
        route = "tasks",
        icon = R.drawable.baseline_add_24,
        tittle = "Tasks"
    )
    object Settings : Destination(
        route = "settings",
        icon = R.drawable.baseline_app_settings_alt_24,
        tittle = "settings"
    )
    companion object{
        val toList = listOf(Transaction,Budgets,Tasks,Settings)
    }
}