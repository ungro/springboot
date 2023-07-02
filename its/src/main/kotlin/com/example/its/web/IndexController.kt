package com.example.its.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class IndexController {

    @GetMapping("/")
    fun index(): String {
        return "index"
    }
}