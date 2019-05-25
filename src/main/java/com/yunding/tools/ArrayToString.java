package com.yunding.tools;

import java.util.*;

/**
 * 数组转化为字符串
 */
public class ArrayToString {

    private static StringBuilder stringBuilder = new StringBuilder();
    public static String valueOf(String[] array) {
        List<String> stringList = Arrays.asList(array);
        return valueOf(stringList);
    }

    public static String valueOf(List<String> array) {

        for (String s : array) {
            stringBuilder.append(s);
            stringBuilder.append("#");
        }
        return stringBuilder.toString();
    }

    public static List<String> toList(String string) {
        String[] array = string.split("#");
        List<String> list = new ArrayList<String>();
        Collections.addAll(list,array);
        return list;
    }
}
