package com.example.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.taglibs.standard.lang.jstl.parser.ParseException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class dd {

	public static void main(String[] args) {
		System.out.println("NAME:  "+decString("sDbbWBvHfZyfFMl+9SemdA="));
	}

	public static String encString(String enc) {

		try { // convert value into utf-8
			byte[] text64 = enc.getBytes("UTF-8");
			// Converted into base64
			String base64String = new String(Base64.encodeBase64(text64));
			String key = "Bar12345Bar12345";
			// 128 bit key
			Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, aesKey);
			// base 63 value converted into AES
			byte[] encrypted = cipher.doFinal(base64String.getBytes("UTF-8"));
			// Aes encrypted code converted into Base64 again
			String Aes_base64 = new String(Base64.encodeBase64(encrypted));
			enc = Aes_base64;
		} catch (UnsupportedEncodingException e) {
			// Log.e("UnsupportedEncodingException : " + e.fillInStackTrace());
			return enc;
		} catch (NoSuchAlgorithmException e) {
			// logger.error("NoSuchAlgorithmException : " + e.fillInStackTrace());
			return enc;
		} catch (NoSuchPaddingException e) {
			// logger.error("NoSuchPaddingException : " + e.fillInStackTrace());
			return enc;
		} catch (InvalidKeyException e) {
			// logger.error("InvalidKeyException : " + e.fillInStackTrace());
			return enc;
		} catch (IllegalBlockSizeException e) {
			// logger.error("IllegalBlockSizeException : " + e.fillInStackTrace());
			return enc;
		} catch (BadPaddingException e) {
			// logger.error("BadPaddingException : " + e.fillInStackTrace());
			return enc;
		} catch (Exception e) {
			// logger.error("Exception : " + e.fillInStackTrace());
			return enc;
		}
		return enc;
	}

	public static String decString(String dec) {
		// logger.info("String to Decrypt : " + dec);
		if (dec == null) {
			return dec;
		}
		try {
			byte[] byteArray = Base64.decodeBase64(dec.getBytes());
			String key = "Bar12345Bar12345";
			// 128 bit key
			// Create key and cipher
			Key aesKey = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, aesKey);
			byte[] decrypted = cipher.doFinal(byteArray);
			// decrypt the text
			byte[] byteArray_magic = Base64.decodeBase64(decrypted);
			String decodedString = new String(byteArray_magic, "UTF-8");
			dec = decodedString;
		} catch (UnsupportedEncodingException e) {
			// logger.error("UnsupportedEncodingException : " + e.fillInStackTrace());
			return dec;
		} catch (final IllegalBlockSizeException | BadPaddingException e) {
			// logger.error("IllegalBlockSizeException | BadPaddingException : " +
			// e.fillInStackTrace());
			return dec;
		} catch (final GeneralSecurityException e) {
			// logger.error("GeneralSecurityException : " + e.fillInStackTrace()); return
			// dec;
		}
		return dec;
	}
}
