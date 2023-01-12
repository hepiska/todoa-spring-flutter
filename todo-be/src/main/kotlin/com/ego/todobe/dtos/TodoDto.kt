package com.ego.todobe.dtos

import com.ego.todobe.domain.Todo
import org.bson.types.ObjectId


class TodoDto(var title: String,
                 var description: String?,
                 var completed: Boolean? = null,
                 var userid: String){

    fun  toTodo(): Todo{
        return Todo(title = title, description = description, completed = completed, userid = ObjectId(userid))
    }
}