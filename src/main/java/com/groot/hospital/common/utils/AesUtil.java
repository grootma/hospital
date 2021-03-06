package com.groot.hospital.common.utils;


import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class AesUtil {


    public static final String bm = "utf-8";  
    // 密钥  
    public static final String VIPARA = "12695715&%#@?,:*";  
    public static final String password = "12596321&%#@?,:*"; 
  
    /** 
     * 字节数组转化为大写16进制字符串 
     *  
     * @param b 
     * @return 
     */  
    @SuppressWarnings("unused")
	private static String byte2HexStr(byte[] b) {  
        StringBuilder sb = new StringBuilder();  
        for (int i = 0; i < b.length; i++) {  
            String s = Integer.toHexString(b[i] & 0xFF);  
            if (s.length() == 1) {  
                sb.append("0");  
            }  
  
            sb.append(s.toUpperCase());  
        }  
  
        return sb.toString();  
    }  
  
    /** 
     * 16进制字符串转字节数组 
     *  
     * @param s 
     * @return 
     */  
    @SuppressWarnings("unused")
	private static byte[] str2ByteArray(String s) {  
        int byteArrayLength = s.length() / 2;  
        byte[] b = new byte[byteArrayLength];  
        for (int i = 0; i < byteArrayLength; i++) {  
            byte b0 = (byte) Integer.valueOf(s.substring(i * 2, i * 2 + 2), 16)  
                    .intValue();  
            b[i] = b0;  
        }  
  
        return b;  
    }  
  
  
    /** 
     * AES 加密 
     *  
     * @param content 
     *            明文 

     *            生成秘钥的关键字 
     * @return 
     */  
  
    public static String aesEncrypt(String content) {  
        try {  
            IvParameterSpec zeroIv = new IvParameterSpec(VIPARA.getBytes());  
            SecretKeySpec key = new SecretKeySpec(password.getBytes(), "AES");  
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");  
            cipher.init(Cipher.ENCRYPT_MODE, key, zeroIv);  
            byte[] encryptedData = cipher.doFinal(content.getBytes(bm));  
              
            return Base64.encode(encryptedData);  
//          return byte2HexStr(encryptedData);  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();  
        } catch (NoSuchPaddingException e) {  
            e.printStackTrace();  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        } catch (InvalidKeyException e) {  
            e.printStackTrace();  
        } catch (IllegalBlockSizeException e) {  
            e.printStackTrace();  
        } catch (BadPaddingException e) {  
            e.printStackTrace();  
        } catch (InvalidAlgorithmParameterException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
  
        return null;  
    }  
  
    /** 
     * AES 解密 
     *  
     * @param content 
     *            密文
     *            生成秘钥的关键字 
     * @return 
     */  
  
    public static String aesDecrypt(String content) {  
        try {  
            byte[] byteMi = Base64.decode(content);  
//          byte[] byteMi=  str2ByteArray(content);  
            IvParameterSpec zeroIv = new IvParameterSpec(VIPARA.getBytes());  
            SecretKeySpec key = new SecretKeySpec(password.getBytes(), "AES");  
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");  
            cipher.init(Cipher.DECRYPT_MODE, key, zeroIv);  
            byte[] decryptedData = cipher.doFinal(byteMi);  
            return new String(decryptedData, "utf-8");  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();  
        } catch (NoSuchPaddingException e) {  
            e.printStackTrace();  
        } catch (InvalidKeyException e) {  
            e.printStackTrace();  
        } catch (IllegalBlockSizeException e) {  
            e.printStackTrace();  
        } catch (BadPaddingException e) {  
            e.printStackTrace();  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        } catch (InvalidAlgorithmParameterException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
        return null;  
    }  
    
    public static void main(String[] args) {
    	String content = "{'body': {'username': '000001','password': '2D4143D17320C1363FF01CBF927B9934','imei': '8908908092345'}}";
    	aesEncrypt(content);
    	System.out.println();
	}
  
}  

