package com.onlineShop.example.commonModel;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ErrorParameter {
	
	
	private String errCode;
	private String errDesc;
	
	
	public ErrorParameter(String errCode, String errDesc)
	{
		this.errCode = errCode;
		this.errDesc = errDesc;
	}
	
	public ErrorParameter()
	{
		
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrDesc() {
		return errDesc;
	}

	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	

}
