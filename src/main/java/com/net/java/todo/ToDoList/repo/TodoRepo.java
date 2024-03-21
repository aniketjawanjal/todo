package com.net.java.todo.ToDoList.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.java.todo.ToDoList.entity.ToDo;

public interface TodoRepo extends JpaRepository<ToDo, Integer> {

}
