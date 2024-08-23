package io.hexagonal.com.beckagy.api_todo.adapter.controller;


import io.hexagonal.com.beckagy.api_todo.domain.Todo;
import io.hexagonal.com.beckagy.api_todo.domain.ports.TodoServicePort;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo")
@AllArgsConstructor
public class TodoController {

    private final TodoServicePort todoServicePort;
    @PostMapping
    private Todo create(@RequestBody Todo todo) {
        return todoServicePort.createTodo(todo);
    }

    @GetMapping
    private List<Todo> findAll() {
        return todoServicePort.findAll();
    }
}
