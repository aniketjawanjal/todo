package com.net.java.todo.ToDoList.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.net.java.todo.ToDoList.entity.ToDo;
import com.net.java.todo.ToDoList.exception.ResourceNotFoundException;
import com.net.java.todo.ToDoList.repo.TodoRepo;
import com.net.java.todo.ToDoList.service.TodoService;

@Repository
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoRepo repo;

	@Override
	public List<ToDo> getAllTodos() {
		return repo.findAll();
	}

	@Override
	public ToDo save(ToDo todo) {
		return repo.save(todo);
	}

	@Override
	public ToDo getTodoById(int id) {
		ToDo toDo = repo.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("user", "id", id));

		return toDo;
	}

	@Override
	public void deleteTodoById(int id) {
		repo.deleteById(id);
		
	}

	
	@Override
	public ToDo saveOrUpdate(ToDo updatedTodo) {
//		EmployeeEntity existingUser = employeeRepo.findById(user.getId()).get();
		ToDo existingTodo = repo.findById(updatedTodo.getId()).orElseThrow(
				()->new ResourceNotFoundException("user", "id", updatedTodo.getId())
				);
		existingTodo.setTodo(updatedTodo.getTodo());
        existingTodo.setStatus(updatedTodo.getStatus());
        existingTodo.setPriority(updatedTodo.getPriority());
        
        ToDo save = repo.save(existingTodo);
		return save;
	}


	

}
