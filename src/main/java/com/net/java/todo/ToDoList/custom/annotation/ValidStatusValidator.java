package com.net.java.todo.ToDoList.custom.annotation;

import java.util.EnumSet;

import com.net.java.todo.ToDoList.enu.Status;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidStatusValidator implements ConstraintValidator<ValidStatus, Status> {

	@Override
	public boolean isValid(Status value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value != null && EnumSet.allOf(Status.class).contains(value);
	}

}
