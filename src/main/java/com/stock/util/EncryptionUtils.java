/**
 * 
 */
package com.stock.util;

/**
 * @author Dinesh
 *
 */
public class EncryptionUtils {
	
	public static final String getEncryptedPassword(String password) {
		try {
			String hash = byteArrayToHexString(computeHash(password));
			return hash;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * 
	 * @param b
	 * @return
	 */
	private static String byteArrayToHexString(byte[] b) {
		StringBuffer sb = new StringBuffer(b.length * 2);
		for (int i = 0; i < b.length; i++) {
			int v = b[i] & 0xff;
			if (v < 16) {
				sb.append('0');
			}
			sb.append(Integer.toHexString(v));
		}
		return sb.toString().toUpperCase();
	}

	/**
	 * 
	 * @param x
	 * @return
	 * @throws Exception
	 */
	private static byte[] computeHash(String x) throws Exception {
		java.security.MessageDigest d = null;
		d = java.security.MessageDigest.getInstance("SHA-1");
		d.reset();
		d.update(x.getBytes());
		return d.digest();
	}
}
