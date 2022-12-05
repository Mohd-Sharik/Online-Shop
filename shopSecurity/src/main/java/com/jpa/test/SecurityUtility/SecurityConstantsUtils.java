package com.jpa.test.SecurityUtility;

public class SecurityConstantsUtils {
	
	
	public static final String SECRET_ALGO = "PBKDF2WithHmacSHA256";
	public static final String BC = "BC";
	public static final String CIPHER_ALGO = "AES/CBC/PKCS5Padding";
	public static final String SECRETKEY_ALGO = "AES";
	public static final String PASS_REGEX1 = "^(?=.{8,})(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\\W).*$";
	public static final String SHA512 = "SHA-512";
	public static final String SHA256 = "SHA-256";
	public static final String MD5="MD5";
	public static final String HEX_B_FMT = "%02x";

}
