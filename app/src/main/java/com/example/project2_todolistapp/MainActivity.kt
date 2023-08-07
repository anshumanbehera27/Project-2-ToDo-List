package com.example.project2_todolistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.project2_todolistapp.Db.Todo
import com.example.project2_todolistapp.Db.TodoListDataBase
import com.example.project2_todolistapp.databinding.ActivityMainBinding
import java.sql.Date
import kotlin.concurrent.thread

// TODO  4: Create a ViewHolder for the Recycler View Done
// TODO 5: Create an Adapter for the Recycler View Done
// TODO 6: Handle Click events on the ToDos
// TODO 7: Add a Floating Action Button
// TODO 8: Create a Dialog Box to create a ToDo (Bottom Sheet Optional)
// TODO 9: Build a DBHelper class with (Entities, DAOs, Database and TypeConverters)
// TODO 10: Push new ToDos in the DB
// TODO 11: Whenever the App is launched sync your data with DB

//  Optional TODOs
// 1. Create a user login/signup flow
// 2. Add a side navigation bar
// 3. Add a profile section where users can set the profile (Profile Pic, Name, DOB, Bio, etc.)
// 4. Push all todos data in Firebase (if user logs in from another device)
// 5. Add search feature
// 6. Add filter by date feature
// 7. Add section in Recycler View, on the basis of Date
// 8. Add reminders on Todos that have a deadline
// 9. Add new screen to display the tasks that are done

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var database: TodoListDataBase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Create a random To-do , put this from the data-Base
        thread {
            database = Room.databaseBuilder(
                this@MainActivity,
                TodoListDataBase::class.java,
                "todoListDB"
            ).build()
        }
        val todo = Todo(
            title = "randomTodoTitle",
            desc = "RandomTodoDesc", 
           date = Date(System.currentTimeMillis())
        )
        database.TodoDAO().insertTodo(todo)

    }


}







