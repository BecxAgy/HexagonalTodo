package io.hexagonal.com.beckagy.api_todo.domain.services;

import io.hexagonal.com.beckagy.api_todo.domain.Todo;
import io.hexagonal.com.beckagy.api_todo.domain.ports.TodoRepositoryPort;
import io.hexagonal.com.beckagy.api_todo.domain.ports.TodoServicePort;
import org.springframework.stereotype.Service;
import java.util.List;


public class TodoService implements TodoServicePort {

    private final TodoRepositoryPort todoRepositoryPort;
    public TodoService(TodoRepositoryPort todoRepositoryPort) {
        this.todoRepositoryPort = todoRepositoryPort;
    }

    @Override
    public Todo createTodo(Todo todo) {
        return todoRepositoryPort.save(todo);
    }

    @Override
    public List<Todo> findAll() {
       List<Todo> all = todoRepositoryPort.findAll();
       System.out.println(all);
       return all;
    }
}
