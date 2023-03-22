package com.example.demo.controller;

import com.example.demo.dto.TodoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("todo")
public class TodoController {

    @GetMapping("/testTodo")
    public ResponseEntity<?> TodoController() {
        TodoDTO<Object> response = TodoDTO.builder().id("123").build();
        response.setTitle("조다은");
        response.setDone(true);
        return ResponseEntity.ok().body(response);
    }
}
