package com.piggg.oa.model.viewModel;

public class TableColumnModel {

	//列号
	private int columnNO;

	//列名
	private String columnName;

	//列类型
	private String columnType;

	//列的最大标准宽度，以字符为单位
	private int columnDisplaySize;

	//是否自动为指定列进行编号。
	private boolean isAutoIncrement;

	//列中的值是否可以为 null
	private int isNullable;
	
	//列的指定列宽
	private int precision;
	
	//列的小数点右边的位数
	private int scale;
	
	//备注
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
