package com.jpa.test.SecurityUtility;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringUtils;

public class SecurityHelper {
	
	
	
	public class PasswordSecurityCheck
	{
		private int len;
		 String pass;
		 
		 
		 public PasswordSecurityCheck(int len, String pass)
		 {
			 this.len = len;
			 this.pass = pass;
		 }
		 
		 public void checkEmpty(String pass) throws Exception
		 {
			 if(pass.isEmpty())
			 {
				 throw new Exception("password field is empty : password is very insecure : ");
			 }
		 }
		 
		 
		 public void checkLength(int l) throws Exception
		 {
			 if(len < l)
			 {
				 throw new Exception("password is less then "+len+" Character :");
			 }
		 }
		 
		 public void checkAlphaNumericPattern() throws Exception
		 {
			 Pattern p = Pattern.compile(SecurityConstantsUtils.PASS_REGEX1);
			 Matcher m = p.matcher(pass);
			 
			 if(!m.find())
			 {
				 throw new Exception("Password should be UpperCase, LowerCase, Alphabatic and numaric : ");
			 }
		 }
		 
		 
	}
	
	public static class MessageDiagestUtil
	{
		
		public static String getHash256(String str) throws NoSuchAlgorithmException
		{
			String result;
			MessageDigest dia = MessageDigest.getInstance(SecurityConstantsUtils.SHA256);
			
			byte[] bte = dia.digest(str.getBytes());
			
			result = byteArrayToHex(bte);
			return result;
			
		}
		
		public static String getHash512(String str) throws NoSuchAlgorithmException
		{
			String result;
			MessageDigest dia = MessageDigest.getInstance(SecurityConstantsUtils.SHA512);
			byte[] bte = dia.digest(str.getBytes());
			
			result = byteArrayToHex(bte);
			
			return result;
		}
		
		
		public static String getHashMD5(String str) throws NoSuchAlgorithmException
		{
			String result;
			
			MessageDigest dia = MessageDigest.getInstance(SecurityConstantsUtils.MD5);
			byte[] bte = dia.digest(str.getBytes());
			
			result = byteArrayToHex(bte);
			return result;
		}
	}
	
	public static String byteArrayToHex(byte[] by)
	{
		StringBuilder sb = new StringBuilder(by.length*2);
		for(byte b : by)
		{
			sb.append(String.format(SecurityConstantsUtils.HEX_B_FMT,b));
		}
		return sb.toString();
	}
	
	public static String convertStringToHex(String str)
	{
		char[] ch = Hex.encodeHex(str.getBytes(StandardCharsets.UTF_8), false);
		
		return String.valueOf(ch);
	}
	
	public static String convertHexToString(String st)
	{
		String result = StringUtils.EMPTY;
		try
		{
			byte[] by = Hex.decodeHex(st);
			result = new String(by, StandardCharsets.UTF_8);
		}
		catch(DecoderException e)
		{
			throw new IllegalArgumentException("String formate is not valid : ");
		}
		return result;
	}
	
	
	
	
	
	
	

}
