package com.onlineShop.example.exception;

public class BusinessException extends NestedException {
	
	
	/**@author MohdSharik
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessException(String message)
	{
		super(message);
	}
	
	public BusinessException(String message, Throwable cause) 
	{
		super(message, cause);
	}
	
	public BusinessException(Throwable error)
	{
		super("unknown code Exception : ",error);
	}

}
