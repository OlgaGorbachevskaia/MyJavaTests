package org.redRover;

import org.apache.commons.lang3.StringUtils;

public class Utils {
    static String hi = "hi";
    public static String abbr(String text, int lenght){
//        return text.substring(0, lenght -3) + "...";
        return StringUtils.abbreviate(text, lenght);
    }
    public static int sum(Integer first, int second){
        int sum = first + second;
        return sum;
    }
    public static int sum(int firstValue, int secondValue, int thirdValue){
        return firstValue + secondValue + thirdValue;
    }
    public static void printSum(int first, int second){
        int s = sum(first, (Integer)second);
//        StringUtils.abbreviate();
        System.out.println(hi + "sum = " + s);
    }

}
