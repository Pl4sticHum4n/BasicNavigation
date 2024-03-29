package com.example.basicnavigation.database

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.basicnavigation.database.User
import com.example.basicnavigation.database.DatabaseManager
import com.example.basicnavigation.database.MyAppDataSource
import kotlinx.coroutines.launch

class LeftViewModel: ViewModel() {
    fun save(user: User){
        viewModelScope.launch {
            val userDao = DatabaseManager.instance.database.userDao()
            MyAppDataSource(userDao).save(user)
        }
    }
}