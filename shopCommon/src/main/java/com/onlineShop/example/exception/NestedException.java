package com.onlineShop.example.exception;

public class NestedException extends RuntimeException {

	/**
	 * @author MohdSharik
	 */
	private static final long serialVersionUID = 1L;
	
	static
	{
		NestedException.class.getName();
	}
	
	public NestedException(String message)
	{
		super(message);
	}
	
	
	public NestedException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
	public String getMessage()
	{
		return getBuildMessage(super.getMessage(), getCause());
	}
	
	
	
	private String getBuildMessage(String message, Throwable cause)
	{
		if(cause == null)
		{
			return message;
		}
		StringBuilder sb = new StringBuilder(64);
		if(message != null)
		{
			 sb.append(message).append("," );
		}
		
		sb.append("Nexted Exception is : ").append(cause);
		
		return sb.toString();
	}
	
	public Throwable getRootCause()
	{
		return getRootCause(this);
	}
	
	private Throwable getRootCause(Throwable original)
	{
		if(original == null)
		{
			return null;
		}
		Throwable rootCause = null;
		Throwable cause = original.getCause();
		while (cause != null && cause != rootCause) {
			rootCause = cause;
			cause = cause.getCause();
		}
		return rootCause;
	}
	
	
	
	
	
	
	
	
	
	

}
