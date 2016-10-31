package com.piggg.oa.core;

import java.util.List;
import java.util.Map;

import com.piggg.oa.model.viewModel.TableColumnModel;

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
	 * @param tableName
	 */
	public static <T> void Add(T t, String tableName)
	{
		String sql = new String();
		String strFields = new String();
		String strValues = new String();
		List<TableColumnModel> columnList = DBHelper.getTableColumn(tableName);
		Map<String, Object> fieldsMap = EntityHelper.getEntityAttributeAndValue(t);
		if (!fieldsMap.isEmpty())
		{
			for (Map.Entry<String, Object> entry : fieldsMap.entrySet())
			{
				String fieldName = entry.getKey().toUpperCase();

				
			}
		}

		sql += "insert into " + tableName;

	}
	

	
}


