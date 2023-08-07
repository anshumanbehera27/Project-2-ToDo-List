package com.example.project2_todolistapp.Db

import androidx.room.Dao
import androidx.room.Index
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

// DAO -> data access Object -> This is helps You in Acessing the Db without Writing a lot of code

@Dao
interface TodoDAO {

    // CURD -> Create  | Read | Update | Delete
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTodo(todo: Todo)


    @Query("select * from notes_table")
    fun fetchAllTodos():MutableList<Todo>



}