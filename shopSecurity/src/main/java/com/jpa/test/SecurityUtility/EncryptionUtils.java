package com.jpa.test.SecurityUtility;

import java.nio.charset.StandardCharsets;
import java.security.Security;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;

public class EncryptionUtils {
	
	
	static
	{
		Security.addProvider(new BouncyCastleProvider());
	}
	
	private EncryptionUtils()
	{
		
	}
	
	private static class CipherParam
	{
		private IvParameterSpec ivSpec;
		private SecretKeySpec secKey;
		
		public CipherParam(IvParameterSpec ivSpec, SecretKeySpec secKey)
		{
			this.ivSpec = ivSpec;
			this.secKey = secKey;
		}
		
	}
	
	// to store Key Value for Encryption/Decryption data
	private static Map<String, CipherParam> dataMap = new HashMap<>();
	
	private static String doCipher(int cipherMode, String data, String secret, String salt) throws Exception
	{
		String key = secret + salt;
		CipherParam cp = null;
		if(dataMap.containsKey(key))
		{
			cp = dataMap.get(key);
		}
		else
		{
			byte[] iv = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
			IvParameterSpec ivSpec = new IvParameterSpec(iv);
			SecretKeyFactory factory = SecretKeyFactory.getInstance(SecurityConstantsUtils.SECRET_ALGO, SecurityConstantsUtils.BC);
			KeySpec spec = new PBEKeySpec(secret.toCharArray(), salt.getBytes(), 65536, 256);
			SecretKey tmp = factory.generateSecret(spec);
			SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), SecurityConstantsUtils.SECRETKEY_ALGO);
			cp = new CipherParam(ivSpec, secretKey);
			dataMap.put(key, cp);
		}
		
		Cipher ciper = Cipher.getInstance(SecurityConstantsUtils.CIPHER_ALGO, SecurityConstantsUtils.BC);
		ciper.init(cipherMode, cp.secKey, cp.ivSpec);
		
		if(StringUtils.isBlank(data))
		{
			return null;
		}
		
		if(cipherMode == Cipher.ENCRYPT_MODE)
		{
			return new String(Base64.encode(ciper.doFinal(data.getBytes(StandardCharsets.UTF_8))),
					StandardCharsets.UTF_8);
		}
		else
		{
			return new String(ciper.doFinal(Base64.decode(data)), StandardCharsets.UTF_8);
		}
		
	}
	
	// for data encrypt
	public static String encrypt(String data, String secret, String dekSalt) throws RuntimeException
	{
		String result = data;
		if(StringUtils.isEmpty(data))
		{
			return data;
		}
		if(StringUtils.isNotBlank(secret) && StringUtils.isNoneBlank(dekSalt))
		{
			try
			{
				result = doCipher(Cipher.ENCRYPT_MODE, data, secret, dekSalt);
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		
		return result;
	}
	
	
	//  for data decrypt
	
	public static String decrypt(String data, String secret, String dekSalt) throws RuntimeException
	{
		String result = data;
		if(data == null)
		{
			return data;
		}
		if(StringUtils.isBlank(secret) && StringUtils.isBlank(dekSalt))
		{
			try
			{
				result = doCipher(Cipher.DECRYPT_MODE, data, secret, dekSalt);
			} 
			catch (Exception e) {
				
				throw new RuntimeException(e);
			}
		}
		
		return result;
	}

}
