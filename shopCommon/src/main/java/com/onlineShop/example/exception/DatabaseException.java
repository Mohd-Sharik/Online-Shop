package com.onlineShop.example.exception;

import javax.xml.crypto.Data;

public class DatabaseException extends NestedException {
	
	/**@author MohdSharik
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DatabaseException(String message)
	{
		super(message);
	}
	
	public DatabaseException(String message, Throwable clause)
	{
		super(message, clause);
	}
	
	public DatabaseException(Throwable error)
	{
		super("no Code Ecxeption ", error);
	}

}
