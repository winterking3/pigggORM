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
	public static <T> String getSqlForInsert(T t, String baseTableName)
	{
		String sql = new String();
		String strFields = new String();
		String strValues = new String();
		List<TableColumnModel> columnList = DBHelper.getTableColumn(baseTableName);
		Map<String, Object> fieldsMap = EntityHelper.getEntityAttributeAndValue(t);
		
		
		if(!columnList.isEmpty() && !fieldsMap.isEmpty())
		{
			for(TableColumnModel column : columnList)
			{
				if(column != null && column.isAutoIncrement() == false && fieldsMap.containsKey(column.getColumnName().toUpperCase()))
				{
					strFields += (column.getColumnName() + ",");
					strValues += ("?,");
				}
			}
			strFields = strFields.substring(0, strFields.length()-1);
			strValues = strValues.substring(0, strValues.length()-1);
			if(!strFields.isEmpty() && !strValues.isEmpty())
			{
				sql += "insert into (" + strFields + ") values (" + strValues + ")";
			}
		}
		return sql;
	}
	
	
	public static <T> String getSqlForSelectByID(int id, String baseTableName)
	{
		String sql = new String();
		
		return sql;
	}
	

	
}


