package com.codestates.ToDoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
    @GetMapping("/")
    public String hello(){
        return "To-do Application !";
    }
}
