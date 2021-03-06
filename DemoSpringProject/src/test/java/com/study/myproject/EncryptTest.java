package com.study.myproject;

import java.security.MessageDigest;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EncryptTest 
{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Test
	public void encryptTest()
	{
		String helloJava = "8a02f0ce1395252b16a296f285d7631f24cfb8e7112adde97f1fbfcc0c178498";
		
		String testEncrypt = testSHA256("Hello, Java");
		if(helloJava.equals(testEncrypt))
		{
			logger.info("pwd encrypted!");
		}
		else
		{
			logger.info("encrypt fail");
		}
	}
	
	public String testSHA256(String pwd)
	{
		try 
		{
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(pwd.getBytes());
			byte[] bytes = md.digest();

			StringBuilder builder = new StringBuilder();
		    for (byte b: bytes) {
		      builder.append(String.format("%02x", b));
		    }
		    System.out.println(builder.toString());
		    return builder.toString();

		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
