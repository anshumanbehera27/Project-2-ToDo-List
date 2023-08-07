package com.example.project2_todolistapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.project2_todolistapp.Db.Todo
import com.example.project2_todolistapp.databinding.TodoListIteamBinding

class TodoListViewHolder(private val itemBInding: TodoListIteamBinding ): RecyclerView.ViewHolder(itemBInding.root){

    fun bindData(todo: Todo){
        itemBInding.cdItemTodo.isChecked = todo.isMarkedDone
        itemBInding.tvItemTodoTitle.text = todo.title
        itemBInding.tvItemTodoDesc.text = todo.desc
        itemBInding.tvItemTodoDate.text = todo.date.toString()

        // Todo :  it will check where it si clicked
        itemBInding.cdItemTodo.setOnClickListener{

        }
    }

}
class TodoListAdapter(
    private val listOfTodo: MutableList<Todo>
) : RecyclerView.Adapter<TodoListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListViewHolder {

        return TodoListViewHolder(TodoListIteamBinding.inflate(LayoutInflater.from(parent.context) , parent , false))

    }

    override fun getItemCount() = listOfTodo.size

    override fun onBindViewHolder(holder: TodoListViewHolder, position: Int) {
        holder.bindData(listOfTodo[position])
    }

}
interface TodoStateChangedListener {
    fun onCheckStateChnaged(position: Int)
}
