package com.ego.todobe.repositories

import com.ego.todobe.domain.Todo
import org.springframework.data.mongodb.repository.MongoRepository

interface TodoRepository : MongoRepository<Todo, String> {
    fun findByTitle(title: String): Todo
    fun findByCompleted(completed: Boolean): List<Todo>
    fun findByUserid(userid: String): List<Todo>
}