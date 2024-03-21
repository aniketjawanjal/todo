package com.net.java.todo.ToDoList.custom.annotation;

import java.util.EnumSet;

import com.net.java.todo.ToDoList.enu.Priority;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidPriorityValidator implements ConstraintValidator<ValidPriority, Priority>{

	@Override
	public boolean isValid(Priority value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value != null&& EnumSet.allOf(Priority.class).contains(value);
	}

}
