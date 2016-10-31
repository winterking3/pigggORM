package com.piggg.oa.core;

import java.sql.*;
import java.util.*;
import com.piggg.oa.model.viewModel.TableColumnModel;

public class DBHelper {
	
	/**
	 * get database connection
	 * @return Connection
	 */
	public static Connection getConnection() {
		Connection conn = null;
		final String url = "jdbc:mysql://localhost:3306/piggg";
		final String name = "com.mysql.jdbc.Driver";
		final String user = "root";
		final String password = "123456";

		try {
			Class.forName(name);
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * get connection by database's name
	 * @param databaseName
	 * @return Connection
	 */
	public static Connection getConnectionByDatabaseName(String databaseName) {
		Connection conn = null;
		if(databaseName != null && databaseName != "" )
		{
			final String url = "jdbc:mysql://localhost:3306/" + databaseName;
			final String name = "com.mysql.jdbc.Driver";
			final String user = "root";
			final String password = "123456";

			try {
				Class.forName(name);
				conn = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	/**
	 * get table's key column
	 * @param baseTableName
	 * @return
	 */
	public static List<String> getKeyColumnName(String baseTableName)
	{
		String dbName = new String();
		String tableName = new String();
		String[] names = baseTableName.split(".");
		if (names != null && names.length == 2)
		{
			dbName = names[0];
			tableName = names[1];
		}
		if (dbName.isEmpty() || tableName.isEmpty())
		{
			return null;
		}
		
		List<String> keyNameList = new ArrayList<String>();
		Connection conn = getConnectionByDatabaseName(dbName);
		try
		{
			DatabaseMetaData dbMetaData = conn.getMetaData();
			ResultSet pkRS = dbMetaData.getPrimaryKeys(null, null, tableName);
			while (pkRS.next())
			{
				keyNameList.add((String) pkRS.getObject("COLUMN_NAME"));
			}
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try
			{
				conn.close();
			} catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return keyNameList;
	}
	
	/**
	 * get table's meta data
	 * @param baseTableName
	 * @return
	 * @throws SQLException 
	 */
	public static ResultSetMetaData getResultSetMetaData(String baseTableName)
	{
		String dbName = new String();
		String tableName = new String();
		String[] names = baseTableName.split(".");
		if (names != null && names.length == 2)
		{
			dbName = names[0];
			tableName = names[1];
		}
		if(dbName.isEmpty() || tableName.isEmpty())
		{
			return null;
		}
		
		Connection conn = getConnectionByDatabaseName(dbName);
		String sql = "SELECT * FROM " + tableName.toUpperCase() + " WHERE 1 != 1";  
		PreparedStatement pst = null;
		try{
			pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			return rs.getMetaData();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * get table's column info
	 * @param metaData
	 * @return
	 * @throws Exception
	 */
	public static List<TableColumnModel> getTableColumnByMetaData(ResultSetMetaData metaData) {
		List<TableColumnModel> columnInfoList = new ArrayList<TableColumnModel>();
		try {
			if (metaData != null && metaData.getColumnCount() > 0) {
				for (int i = 0; i < metaData.getColumnCount(); i++) {
					int columnNo = i + 1;
					TableColumnModel tableColumnInfo = new TableColumnModel();
					tableColumnInfo.setColumnNO(columnNo);
					tableColumnInfo.setColumnName(metaData.getColumnName(columnNo));
					tableColumnInfo.setColumnType(metaData.getColumnTypeName(columnNo));
					tableColumnInfo.setColumnDisplaySize(metaData.getColumnDisplaySize(columnNo));
					tableColumnInfo.setAutoIncrement(metaData.isAutoIncrement(columnNo));
					tableColumnInfo.setNullable(metaData.isNullable(columnNo));
					tableColumnInfo.setPrecision(metaData.getPrecision(columnNo));
					tableColumnInfo.setScale(metaData.getScale(columnNo));
					columnInfoList.add(tableColumnInfo);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return columnInfoList;
	}
	
	/**
	 * get table's column info
	 * @param dbName
	 * @param tableName
	 * @return
	 */
	public static List<TableColumnModel> getTableColumn(String baseTableName) {
		ResultSetMetaData metaData = getResultSetMetaData(baseTableName);
		List<TableColumnModel> columnList = getTableColumnByMetaData(metaData);
		return columnList;
	}
	
	
	/**
	 * check entity's attributes with table's columns
	 * @param baseTableName
	 * @param t
	 * @return
	 */
	public static <T> boolean checkEntityWithTable(String baseTableName, T t) {
		boolean ifOk = false;
		if (baseTableName.isEmpty() || t == null) {
			return ifOk;
		}
		List<TableColumnModel> columnList = getTableColumn(baseTableName);
		
		if (columnList != null && !columnList.isEmpty()) {
			Map<String, String> map = EntityHelper.getEntityAttributeAndType(t);
			if (!map.isEmpty()) {
				for (TableColumnModel column : columnList) {
					if(map.containsKey(column.getColumnName().toUpperCase()))
					{
						ifOk = true;
					}
					else
					{
						ifOk = false;
						return ifOk;
					}
				}
			}
		}
		return ifOk;
	}
}
