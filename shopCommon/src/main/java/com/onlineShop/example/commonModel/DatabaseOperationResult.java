package com.onlineShop.example.commonModel;

import org.apache.commons.lang3.StringUtils;

/*
 * 
 * @Author Mohd Sharik
 * 
   generic class talking between persistance and dao layer for response/request
*/

import org.apache.commons.lang3.builder.ToStringBuilder;

public class DatabaseOperationResult<T> {
	
	
	private T modelOrEntity;
	private PaginationAttribute pageAttribute;
	private ErrorParameter errorParam;
	private Boolean sucess;
	
	
	public DatabaseOperationResult()
	{
		pageAttribute = new PaginationAttribute();
		errorParam = new ErrorParameter();
	}


	

	public T getModelOrEntity() {
		return modelOrEntity;
	}

	public void setModelOrEntity(T modelOrEntity) {
		this.modelOrEntity = modelOrEntity;
	}

	public PaginationAttribute getPageAttribute() {
		return pageAttribute;
	}


	public void setPageAttribute(PaginationAttribute pageAttribute) {
		this.pageAttribute = pageAttribute;
	}


	public ErrorParameter getErrorParam() {
		return errorParam;
	}


	public void setErrorParam(ErrorParameter errorParam) {
		this.errorParam = errorParam;
	}


	public Boolean getSucess() {
		
		this.sucess = StringUtils.isNoneEmpty(errorParam.getErrDesc()) ? true : false;
		return sucess;
	}


	public void setSucess(Boolean sucess) {
		this.sucess = sucess;
	}


	@Override
	public String toString() {
		getSucess();
		return  ToStringBuilder.reflectionToString(this);
	}
	
	
	

}
