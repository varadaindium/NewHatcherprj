package iSAFE;

import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class EncryptData {

	public static void main(String[] args) {

		String originalString = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter actual value to encrypt");
		originalString = sc.nextLine();
		if (originalString != null && originalString != "") {
			String encryptedString = encrypt(originalString);
			System.out.println("Encryption value is: " + encryptedString);
			System.out.println(encryptedString.replaceAll("[!-~]", "*"));
			System.out.println(originalString.replaceAll("[!-~]", "*"));
		} else {
			System.out.println("Invalid input. Thanks for using our encryption utility.");
		}
	}

	private static String encrypt(String strToEncrypt) {
		try {
			byte[] iv = new byte[16];
			IvParameterSpec ivspec = new IvParameterSpec(iv);
			SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			KeySpec spec = new PBEKeySpec("boooooooooom!!!!".toCharArray(), "ssshhhhhhhhhhh!!!!".getBytes(), 65536,
					256);
			SecretKey tmp = factory.generateSecret(spec);
			SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(1, secretKey, ivspec);
			return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
		} catch (Exception var8) {
			System.err.println("Error while encrypting: " + var8.toString());
			return null;
		}
	}
	private static String decrypt(String strToDecrypt) {
	      try {
	         byte[] iv = new byte[16];
	         IvParameterSpec ivspec = new IvParameterSpec(iv);
	         SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
	         KeySpec spec = new PBEKeySpec("boooooooooom!!!!".toCharArray(), "ssshhhhhhhhhhh!!!!".getBytes(), 65536, 256);
	         SecretKey tmp = factory.generateSecret(spec);
	         SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");
	         Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
	         cipher.init(2, secretKey, ivspec);
	         return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
	      } catch (Exception var8) {
	         System.err.println("Error while decrypting: " + var8.toString());
	         return null;
	      }
	   }
}