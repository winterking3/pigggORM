//用户实体Model
package com.piggg.oa.model.table.piggg;

/**
 * @author wd07098
 *用户实体
 */
public class UserEntity {
	
	@FieldMeta(isKey=true,autoIncrement=true,description="主键ID")  
	private int id = 0;
	
	@FieldMeta(description="姓名",length=45) 
	private String name = "";
	
	@FieldMeta(description="工号",length=20) 
	private String jobNumber = "";
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}
}
