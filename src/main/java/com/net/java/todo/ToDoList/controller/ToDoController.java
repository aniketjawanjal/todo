package com.net.java.todo.ToDoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.net.java.todo.ToDoList.entity.ToDo;
import com.net.java.todo.ToDoList.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class ToDoController {

	@Autowired
	private TodoService service;

	@GetMapping
	public ResponseEntity<List<ToDo>> getAllTodos() {
		return new ResponseEntity<>(service.getAllTodos(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<ToDo> createTodo(@RequestBody ToDo todo) {
		ToDo save = service.save(todo);

		return new ResponseEntity<ToDo>(save, HttpStatus.CREATED);

	}

	@GetMapping("/{id}")
	public ResponseEntity<ToDo> getTodoById(@PathVariable int id) {
		ToDo byId = service.getTodoById(id);
		if (byId != null) {
			return new ResponseEntity<ToDo>(byId, HttpStatus.OK);
		} else {
			return new ResponseEntity<ToDo>(byId, HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<ToDo> updateTodo(@PathVariable int id, @RequestBody ToDo updatedTodo) {
		updatedTodo.setId(id);
		ToDo existingTodo = service.saveOrUpdate(updatedTodo);
		return new ResponseEntity<>(existingTodo, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTodoById(@PathVariable int id) {
		ToDo toDoId = service.getTodoById(id);
		if (toDoId != null) {
			service.deleteTodoById(id);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
