package com.piggg.oa.core;
//今天是2016-10-31,必须把这个类完成
public class SqlHelper {

//	int Add(T)
//	bool Add(List<T>)
	
//	model Get(long id)
//	List<model> Get(List<WhereFields>, List<OrderFields>, int top)
//	ResultSet Get(List<ShowFields>, List<WhereFields>, List<OrderFields>,int top)
	
//	Update(T)
//	Update(int top, List<UpdateFields>, List<WhereFields>, List<OrderFields>)
//	
	
//	delete(id)
	
	
	/**
	 * get SQL for add a entity
	 * @param t
	 * @param dataBaseName
	 */
	public static <T> void Add(T t, String dataBaseName)
	{
		String sql = new String();
		Class<?> className = t.getClass();
		
	}
}


