package com.net.java.todo.ToDoList.custom.annotation;


import java.lang.annotation.*;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = {ValidPriorityValidator.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPriority {
    String message() default "Invalid priority";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

