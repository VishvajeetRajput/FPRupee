package com.example.encryption;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class Encryption {

	static int max = 998876;
	static int min = 2234;
	public static int decimalPlaces = 2;

	public static String encString(String enc) {

		try {
			// convert value into utf-8
			byte[] text64 = enc.getBytes("UTF-8");

			// Converted into base64
			String base64String = new String(Base64.encodeBase64(text64));

			String key = "Bar12345Bar12345"; // 128 bit key
			Key aesKey = new SecretKeySpec(key.getBytes(), "AES");

			Cipher cipher = Cipher.getInstance("AES");

			cipher.init(Cipher.ENCRYPT_MODE, aesKey);

			// base 63 value converted into AES
			byte[] encrypted = cipher.doFinal(base64String.getBytes("UTF-8"));

			// Aes encrypted code converted into Base64 again
			String Aes_base64 = new String(Base64.encodeBase64(encrypted));
			enc = Aes_base64;
		} catch (UnsupportedEncodingException e) {
			return enc;

		} catch (NoSuchAlgorithmException e) {
			return enc;

		} catch (NoSuchPaddingException e) {
			return enc;

		} catch (InvalidKeyException e) {
			return enc;

		} catch (IllegalBlockSizeException e) {
			return enc;

		} catch (BadPaddingException e) {
			return enc;

		} catch (Exception e) {
			return enc;
		}
		return enc;
	}

	public static String decString(String dec) {

		if (dec == null) {
			return dec;
		}

		try {
			byte[] byteArray = Base64.decodeBase64(dec.getBytes());
			String key = "Bar12345Bar12345"; // 128 bit key
			// Create key and cipher
			Key aesKey = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, aesKey);
			byte[] decrypted = cipher.doFinal(byteArray);// decrypt the text
			byte[] byteArray_magic = Base64.decodeBase64(decrypted);
			String decodedString = new String(byteArray_magic, "UTF-8");
			dec = decodedString;
		} catch (UnsupportedEncodingException e) {

			return dec;
		} catch (final IllegalBlockSizeException | BadPaddingException e) {

			return dec;
		} catch (final GeneralSecurityException e) {

			return dec;
		}

		return dec;
	}

	public static double encFloat(Double vDouble) {

		// System.out.println("Double to encFloat : " + vDouble);

		vDouble = round_to_decimal(vDouble, decimalPlaces);

		// System.out.println("Double to encFloat After RoundOff to two Decimal Places :
		// "
		// +df.format( vDouble));

		double dr = (max - min) + vDouble;

		// System.out.println("Return from encFloat : " + dr);

		return dr;
	}

	public static double decFloat(double dr) {

		// System.out.println("Double to decFloat : " + dr);

		double df = max - min;
		double dec = (dr - df);

		// System.out.println("Decrypted Result : " + dec);

		dec = round_to_decimal(dec, decimalPlaces);

		// System.out.println("Return from decFloat After RoundOff to two decimal Places
		// : "
		// +decss.format(dec));

		return dec;
	}

	public static double round_to_decimal(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();
		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}

	public static String encryptForSSO(String value) {
		try {
			String key = "fidypay@general_insurance_tech_#";
			String initVector = "fidypay@insure_#";

			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

			byte[] encrypted = cipher.doFinal(value.getBytes());
			System.out.println("encrypted string: " + Base64.encodeBase64String(encrypted));

			return Base64.encodeBase64String(encrypted);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "";
	}

}