package com.piggg.oa.model.table.piggg;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME) // ע�����class�ֽ����ļ��д��ڣ�������ʱ����ͨ�������ȡ��  
@Target({ElementType.FIELD})//����ע�������Ŀ��**���÷�Χ�ֶΡ�ö�ٵĳ���/����  
@Documented//˵����ע�⽫��������javadoc��  
public @interface FieldMeta {
	/**
	 * �Ƿ�Ϊ����
	 * @return
	 */
	boolean isKey() default false;
	
	/**
	 * �Ƿ�����
	 * @return
	 */
	boolean autoIncrement() default false;
	
    /** 
     * �ֶ����� 
     * @return 
     */  
    String description() default "";  
	
    /**
     * �ֶγ���
     * @return
     */
    int length() default 0;
}
