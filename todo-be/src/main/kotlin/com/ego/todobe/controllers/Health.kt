package com.ego.todobe.controllers

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = [ "/health" ])
class Health {
    @GetMapping("")
    fun getHealth(): String{

        return "health"
    }

}