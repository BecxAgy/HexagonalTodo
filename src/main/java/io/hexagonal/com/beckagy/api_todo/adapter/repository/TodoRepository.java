package io.hexagonal.com.beckagy.api_todo.adapter.repository;


import io.hexagonal.com.beckagy.api_todo.adapter.entities.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}
