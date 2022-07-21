package com.fsv.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsv.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
