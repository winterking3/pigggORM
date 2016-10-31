package com.piggg.oa.model.viewModel;

public class TableColumnModel {

	private int columnNO;

	private String columnName;

	private String columnType;

	private int columnDisplaySize;

	private boolean isAutoIncrement;

	private int isNullable;
	
	private int precision;
	
	private int scale;
	
	private String remark;

	public int getIsNullable() {
		return isNullable;
	}

	public void setIsNullable(int isNullable) {
		this.isNullable = isNullable;
	}

	public int getColumnNO() {
		return columnNO;
	}

	public void setColumnNO(int columnNO) {
		this.columnNO = columnNO;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnType() {
		return columnType;
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public int getColumnDisplaySize() {
		return columnDisplaySize;
	}

	public void setColumnDisplaySize(int columnDisplaySize) {
		this.columnDisplaySize = columnDisplaySize;
	}

	public boolean isAutoIncrement() {
		return isAutoIncrement;
	}

	public void setAutoIncrement(boolean isAutoIncrement) {
		this.isAutoIncrement = isAutoIncrement;
	}

	public int isNullable() {
		return isNullable;
	}

	public void setNullable(int isNullable) {
		this.isNullable = isNullable;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
