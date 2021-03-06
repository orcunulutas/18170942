package com.lessons.react1.customAnotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(TYPE)
@Retention(RUNTIME)
@Constraint(validatedBy = { PasswordComprasionValidator.class })
public @interface  PasswordComprasion {
	String message() default "test";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
