package com.piggg.oa.model.table.piggg;

/**
 * @author wd07098
 *
 */
@EntityMeta(tableName = "user", primaryKey = "ID", isPKAtuo = true)
public class UserEntity {
	@FieldMeta(isAutoIncrement = true)
	private int id = 0;
	
	private String jobNumber = "";
	
	private String name = "";

	private String nikeName = "";
	
	private byte sex = 0;
	
	private byte married = 0;

	public int getId()
	{
		return id;
	}

	public String getJobNumber()
	{
		return jobNumber;
	}

	public void setJobNumber(String jobNumber)
	{
		this.jobNumber = jobNumber;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getNikeName()
	{
		return nikeName;
	}

	public void setNikeName(String nikeName)
	{
		this.nikeName = nikeName;
	}

	public byte getSex()
	{
		return sex;
	}

	public void setSex(byte sex)
	{
		this.sex = sex;
	}

	public byte getMarried()
	{
		return married;
	}

	public void setMarried(byte married)
	{
		this.married = married;
	}
}
