package com.piggg.oa.model.table.piggg;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface FieldMeta {

	String type() default "";
	
	boolean isAutoIncrement() default false;
	
	boolean isNullable() default false;
}
