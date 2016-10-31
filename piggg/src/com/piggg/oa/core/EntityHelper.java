package com.piggg.oa.core;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EntityHelper {

	/**
	 * get entity's attributes and types
	 * @param t
	 * @return
	 */
	public static <T> Map<String, String> getEntityAttributeAndType(T t)
	{
		Map<String, String> map = new HashMap<String, String>();
		Class<? extends Object> thisClass = t.getClass();
		Field[] fieldArr = thisClass.getDeclaredFields();
		for (Field field : fieldArr)
		{
			field.setAccessible(true);
			map.put(field.getName().toUpperCase(), field.getType().getSimpleName());
		}
		return map;
	}
	
	/**
	 * get entity's attributes and values
	 * @param t
	 * @return
	 */
	public static <T> Map<String, Object> getEntityAttributeAndValue(T t)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		Class<? extends Object> thisClass = t.getClass();
		Method[] methodArr = thisClass.getDeclaredMethods();
		if (methodArr != null && methodArr.length > 0)
		{
			for (Method method : methodArr)
			{
				if (method.getName().startsWith("get") && !method.getName().equals("getClass"))
				{
					try
					{
						map.put(method.getName().substring(3).toUpperCase(), method.invoke(t));
					} catch (IllegalAccessException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return map;
	}
}
