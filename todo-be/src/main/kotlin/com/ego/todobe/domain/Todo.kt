package com.ego.todobe.domain

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

import java.time.LocalDateTime

@Document(collection = "todos")
class Todo (
            @Id
            val id: ObjectId = ObjectId.get(),
            val title: String,
            val description: String?,
            val completed: Boolean? = false,
            val createdAt: LocalDateTime? = LocalDateTime.now(),
            val updatedAt: LocalDateTime? = LocalDateTime.now(),
            val deletedAt: LocalDateTime? = null,
            val userid: ObjectId
    )