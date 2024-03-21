package com.net.java.todo.ToDoList.entity;

import com.net.java.todo.ToDoList.custom.annotation.ValidPriority;
import com.net.java.todo.ToDoList.custom.annotation.ValidStatus;
import com.net.java.todo.ToDoList.enu.Priority;
import com.net.java.todo.ToDoList.enu.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "todolist")
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	private String todo;

	@ValidStatus
	@Enumerated(EnumType.STRING)
	private Status status;

	@ValidPriority
	@Enumerated(EnumType.STRING)
	private Priority priority;

	public ToDo(int id, @NotNull String todo, @NotNull Status status, Priority priority) {
		super();
		this.id = id;
		this.todo = todo;
		this.status = status;
		this.priority = priority;
	}

	public ToDo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", todo=" + todo + ", status=" + status + ", priority=" + priority + "]";
	}

}
