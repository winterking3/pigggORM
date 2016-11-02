package com.piggg.oa.service;

import com.piggg.oa.core.DBHelper;
import com.piggg.oa.core.EntityHelper;
import com.piggg.oa.core.SqlHelper;
import com.piggg.oa.model.table.piggg.UserEntity;

public class test {
	public static void main(String[] args)
	{
		UserEntity user = new UserEntity();
		String sql = SqlHelper.getSqlForInsert(user);
		System.out.println(sql);
	}
}
