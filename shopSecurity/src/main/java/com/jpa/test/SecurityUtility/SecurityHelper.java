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
		private int pLength;
		 String pass;
		 
		 
		 public PasswordSecurityCheck(String pass)
		 {
			 this.pLength = pass.length();
			 this.pass = pass;
		 }
		 
		 public void checkEmpty() throws Exception {
				if (pass.isEmpty()) {
					throw new Exception("Password Field is Empty! Password is Very Insecure.");
				}
			}

			public void checkLenght(int len) throws Exception {
				if (pLength < len) {
					throw new Exception("Password Field is Less Than " + len + " Characters.");
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
		
		
		public static String getHash(String inputStr) throws NoSuchAlgorithmException {
			String result = null;

			if (StringUtils.isNotBlank(inputStr)) {
				MessageDigest md = MessageDigest.getInstance(SecurityFrameworkConstant.SHA256);
				byte[] bytes = md.digest(inputStr.getBytes());
				result = byteArrayToHex(bytes);
			}
			return result;
		}
		
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
