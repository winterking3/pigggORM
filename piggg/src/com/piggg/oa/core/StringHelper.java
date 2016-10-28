package com.piggg.oa.core;

public class StringHelper {

	/**
	 * check string is empty
	 * @param object
	 * @return
	 */
	public boolean isNullOrEmpty(Object object)
	{
		if(object == null || object.toString().trim().equals(""))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
