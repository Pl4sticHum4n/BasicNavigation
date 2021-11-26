package com.example.basicnavigation.database

import androidx.room.Database
import androidx.room.RoomDatabase

const val DATABASEVERSION = 1
const val TABLE_USERS = "users"
const val DATABASE_NAME = "myappname.sqlite"

@Database(
    entities = [UserEntity::class],
    version = DATABASEVERSION,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
}