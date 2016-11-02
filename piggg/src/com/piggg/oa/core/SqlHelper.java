package com.piggg.oa.core;

import java.util.List;
import java.util.Map;
import com.piggg.oa.model.table.piggg.EntityMeta;
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
	public static <T> String getSqlForInsert(T t)
	{
		String sql = new String();
		String strFields = new String();
		String strValues = new String();
		String tableName = new String();
		String primaryKey = new String();
		boolean isAutoIncrement = false; 
		
		EntityMeta entityMeta = EntityHelper.getEntityMeta(t);
		if(entityMeta != null)
		{
			tableName = entityMeta.tableName();
			primaryKey = entityMeta.primaryKey();
			isAutoIncrement = entityMeta.isPKAtuo();
		}
		
		if (!tableName.isEmpty())
		{
			Map<String, String> fieldsMap = EntityHelper.getEntityAttributeAndType(t);
			for (String fieldName : fieldsMap.keySet())
			{
				if (!(fieldName.toUpperCase().equals(primaryKey.toUpperCase()) && isAutoIncrement))
				{
					strFields += (fieldName + ",");
					strValues += ("?,");
				}
			}
			strFields = strFields.substring(0, strFields.length() - 1);
			strValues = strValues.substring(0, strValues.length() - 1);
			// 拼接SQL语句
			if (!strFields.isEmpty() && !strValues.isEmpty())
			{
				sql += "insert into " + tableName + "(" + strFields + ") values (" + strValues + ")";
			}
		}
		return sql;
	}
	
	
	/**
	 * get SQL for select by id
	 * @param baseTableName
	 * @return
	 */
	public static String getSqlForSelectByID(String baseTableName)
	{
		String sql = new String();
		List<TableColumnModel> columnList = DBHelper.getTableColumn(baseTableName);
		List<String> keyColumnNameList = DBHelper.getKeyColumnName(baseTableName);
		if(!columnList.isEmpty() && !keyColumnNameList.isEmpty() && keyColumnNameList.size() == 1)
		{
			String keyName = keyColumnNameList.get(0);
			sql += "select * from " + baseTableName + " with(nolock) where " + keyName + "= ?";		
		}
		return sql;
	}
	
	public static <T> String getSqlForUpdate(T t, String baseTableName)
	{
		String sql = new String();
		List<String> keyColumnNameList = DBHelper.getKeyColumnName(baseTableName);
		
		if(!keyColumnNameList.isEmpty() && keyColumnNameList.size() == 1)
		{
			String keyName = keyColumnNameList.get(0);
			
		}
		return sql;
	}
	

	
}


