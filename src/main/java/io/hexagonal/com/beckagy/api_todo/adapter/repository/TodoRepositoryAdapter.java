package io.hexagonal.com.beckagy.api_todo.adapter.repository;

import io.hexagonal.com.beckagy.api_todo.adapter.entities.TodoEntity;
import io.hexagonal.com.beckagy.api_todo.domain.Todo;
import io.hexagonal.com.beckagy.api_todo.domain.ports.TodoRepositoryPort;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


@Component
@AllArgsConstructor
public class TodoRepositoryAdapter implements TodoRepositoryPort {

    public final TodoRepository todoRepository;
    public final ModelMapper modelMapper;

    @Override
    public Todo save(Todo todo) {
        TodoEntity todoEntity = modelMapper.map(todo, TodoEntity.class);
        todoRepository.save(todoEntity);
        return modelMapper.map(todoEntity, Todo.class);
    }

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll()
                .stream()
                .map(e -> modelMapper.map(e, Todo.class))
                .collect(Collectors.toList());
    }
}
