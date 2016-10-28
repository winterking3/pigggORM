package com.piggg.oa.model.table.piggg;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME) // 注解会在class字节码文件中存在，在运行时可以通过反射获取到  
@Target({ElementType.FIELD})//定义注解的作用目标**作用范围字段、枚举的常量/方法  
@Documented//说明该注解将被包含在javadoc中  
public @interface FieldMeta {
	/**
	 * 是否为主键
	 * @return
	 */
	boolean isKey() default false;
	
	/**
	 * 是否自增
	 * @return
	 */
	boolean autoIncrement() default false;
	
    /** 
     * 字段描述 
     * @return 
     */  
    String description() default "";  
	
    /**
     * 字段长度
     * @return
     */
    int length() default 0;
}
