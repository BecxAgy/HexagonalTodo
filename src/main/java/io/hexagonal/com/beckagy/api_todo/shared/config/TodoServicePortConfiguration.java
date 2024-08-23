package io.hexagonal.com.beckagy.api_todo.shared.config;


import io.hexagonal.com.beckagy.api_todo.domain.ports.TodoRepositoryPort;
import io.hexagonal.com.beckagy.api_todo.domain.ports.TodoServicePort;
import io.hexagonal.com.beckagy.api_todo.domain.services.TodoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoServicePortConfiguration {
    @Bean
    public TodoServicePort todoServicePort(TodoRepositoryPort todoRepositoryPort) {
        return new TodoService(todoRepositoryPort);
    }
}
