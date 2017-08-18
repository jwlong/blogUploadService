package com.dxfjyygy.util;

import java.io.UnsupportedEncodingException;

/**
 * base64 util
 */
public class Base64Util {

    /**
     *
     * @param s
     * @return
     */
    public static String encode(byte[] s) {
        if (s == null)
            return null;
        return (new sun.misc.BASE64Encoder()).encode(s);
    }

    /**
     * @param s
     * @return
     */
    public static String encodeForUrl(byte[] s){
        if (s == null)
            return null;
        String standerBase64 = encode(s);
        String encodeForUrl = standerBase64;
        encodeForUrl = encodeForUrl.replace("=", "");
        encodeForUrl = encodeForUrl.replace("+", "*");
        encodeForUrl = encodeForUrl.replace("/", "-");
        //remove \n
        encodeForUrl = encodeForUrl.replace("\n", "");
        encodeForUrl = encodeForUrl.replace("\r", "");

        //change * to  -x-
        encodeForUrl = encodeSpecialLetter1(encodeForUrl);

        return encodeForUrl;

    }

    /**
     * @param str
     * @return
     */
    private static String encodeSpecialLetter1(String str){
        str = str.replace("-x", "-xx");
        str = str.replace("*", "-x-");
        return str;
    }

    /**
     * @param str
     * @return
     */
    private static String decodeSpecialLetter1(String str){
        str = str.replace("-x-", "*");
        str = str.replace("-xx", "-x");
        return str;
    }
    /**
     * @param s
     * @return
     */
    public static String encode(String s) {

        if (s == null)
            return null;
        return encode(s.getBytes());
    }

    /**
     * @param s
     * @return
     */
    public static byte[] decode(String s) {
        if (s == null)
            return null;
        sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
        try {
            byte[] b = decoder.decodeBuffer(s);
            return b;
        } catch (Exception e) {
            return null;
        }
    }
    /**
     *
     * @param s
     * @return
     */
    public static byte[] decodeForUrl(String s) {
        if (s == null)
            return null;
        s = decodeSpecialLetter1(s);
        s = s.replace("*", "+");
        s = s.replace("-", "/");
        s += "=";
        sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
        try {
            byte[] b = decoder.decodeBuffer(s );
            return b;
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s =  "ฉันชอบคุณ";
        String s1 = encodeForUrl(s.getBytes());
        System.out.println(s1);
        String test = new String(decodeForUrl(s1));
        System.out.println(test);
    }

}