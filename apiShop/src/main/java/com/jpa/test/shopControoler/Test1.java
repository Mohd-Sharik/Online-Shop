//package com.jpa.test.shopControoler;
//
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//
//import org.apache.commons.lang3.StringUtils;
//
//public class Test1 {
//	
//	//Test1 t = new Test1();
//	
//	public static void main (String[] args) throws NoSuchAlgorithmException {
//		System.out.println("GfG!");
//		
//		String haspass = "SRK1" + "sharik@123";
//		System.out.println(Test1.getHash(haspass));
//	}
//			
//			//String haspass = "SRK1" + "sharik@123";
//			
//			
//		
//	 public static String getHash(String inputStr) throws NoSuchAlgorithmException {
//				String result = null;
//
//				if (StringUtils.isNotBlank(inputStr)) {
//					MessageDigest md = MessageDigest.getInstance("SHA-256");
//					byte[] bytes = md.digest(inputStr.getBytes());
//					result = byteArrayToHex(bytes);
//				}
//				return result;
//			}
//	 
//	 public static String byteArrayToHex(byte[] by)
//		{
//			StringBuilder sb = new StringBuilder(by.length*2);
//			for(byte b : by)
//			{
//				sb.append(String.format("%02x",b));
//			}
//			return sb.toString();
//		}
//	}
