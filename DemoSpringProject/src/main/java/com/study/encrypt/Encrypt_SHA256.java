package com.study.encrypt;

import java.security.MessageDigest;

public class Encrypt_SHA256 
{
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
