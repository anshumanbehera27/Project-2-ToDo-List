package com.example.project2_todolistapp.Db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

// 1. Entity -> Table Strucure -> How your data is stored
@Entity(tableName = "Notes_table")
data class Todo(
    @PrimaryKey(autoGenerate = true)
    val isMarkedDone: Boolean = false,
    val id: Int = 0,
    val title: String,
    val desc: String,
    val date: Date
)
// Integer
// text
// Char
// Boolean -> Integer (0,1)

// to store a Custom Object - We need to convert

