package com.qiuxk.more_thread.base.util;

import java.security.MessageDigest;

/**
 * md5加密工具
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.util.Md5Util
 * @date 2021-03-17 9:57 上午
 */
public class Md5Util {


    public static String string2MD5(String inStr){
        MessageDigest md5 = null;
        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16){
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    public static void main(String[] args) {
        String s = string2MD5("我爱南京民谣");
        System.out.println(s);
    }



}
