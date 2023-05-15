package com.onlineShop.example.commonModel;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ServiceOperationResult<T> {
	
	
	/*@Author Mohd Sharik
	 * 
	 * 
	 * generic class talk between service and controller layer
	 */
	
	private T response;
	private PaginationAttribute pageAttribute;
	private ErrorParameter errParam;
	private Boolean succes;
	
	
	public ServiceOperationResult()
	{
		pageAttribute = new PaginationAttribute();
		errParam = new ErrorParameter();
		succes = false;
	}


	public T getResponse() {
		return response;
	}


	public void setResponse(T response) {
		this.response = response;
	}


	public PaginationAttribute getPageAttribute() {
		return pageAttribute;
	}


	public void setPageAttribute(PaginationAttribute pageAttribute) {
		this.pageAttribute = pageAttribute;
	}


	public ErrorParameter getErrParam() {
		return errParam;
	}


	public void setErrParam(ErrorParameter errParam) {
		this.errParam = errParam;
	}


	public Boolean getSucces() {
		this.succes = succes || (StringUtils.isEmpty(errParam.getErrCode()) && StringUtils.isEmpty(errParam.getErrDesc()));
				
		return succes;
	}


	public void setSucces(Boolean succes) {
		this.succes = succes;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public String validate()
	{
		if(!getSucces())
		{
			return errParam.toString();
		}
		return "";
	}
	
	
	
	
	
	
	
}

