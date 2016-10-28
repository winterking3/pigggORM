package com.piggg.oa.model.viewModel;

public class LoginUserModel {
	//工号
	private String jobNumber;
	
	//姓名
	private String Name;
	
	//部门ID
	private String DepartmentID;
	
	//部门名称
	private String DepartmentName;
	
	//手机号
	private String Mobile;
	
	//邮箱
	private String Email;
	
	//性别
	private int Gender;
	
	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartmentID() {
		return DepartmentID;
	}

	public void setDepartmentID(String departmentID) {
		DepartmentID = departmentID;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getGender() {
		return Gender;
	}

	public void setGender(int gender) {
		Gender = gender;
	}
	
}
