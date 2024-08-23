package io.hexagonal.com.beckagy.api_todo.domain.ports;

import io.hexagonal.com.beckagy.api_todo.domain.Todo;

import java.util.List;

public interface TodoRepositoryPort {
     Todo save(Todo todo);
     List<Todo> findAll();
}
