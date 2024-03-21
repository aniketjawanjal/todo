package com.net.java.todo.ToDoList.service;

import java.util.List;

import com.net.java.todo.ToDoList.entity.ToDo;

public interface TodoService {

	List<ToDo> getAllTodos();

	ToDo save(ToDo todo);

	ToDo getTodoById(int id);

	void deleteTodoById(int id);


	ToDo saveOrUpdate(ToDo updatedTodo);
	

}
