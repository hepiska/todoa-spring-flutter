package com.ego.todobe.controllers

import com.ego.todobe.domain.Todo
import com.ego.todobe.dtos.TodoDto
import com.ego.todobe.repositories.TodoRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = [ "/todos" ])
class TodoControllers(private  val todoRepository: TodoRepository) {

    @PostMapping("")
    @ResponseBody
    fun createTodo(@RequestBody todoRequest : TodoDto): String{
        todoRepository.save(todoRequest.toTodo())
        return "Todo created"
    }

    @GetMapping("")
    @ResponseBody()
    fun getTodos(): List<Todo>{
         return todoRepository.findAll()
    }
    @GetMapping("/testa")
    @ResponseBody
    fun getTodosTest(): String{
       return "Todo list"
    }
}