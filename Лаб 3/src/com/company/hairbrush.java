package com.company;

public class hairbrush {
    public hairbrush(String str1, String str2) {

    }

    public static String hairbrush(String A, String B) {
        String result = "";
        int len = Math.min(A.length(), B.length());
        for (int i = 0; i < len; i++) {
            result = result + A.charAt(i) + B.charAt(i);
        }
        result = result + A.substring(len) + B.substring(len);
        return result;
    }
}
