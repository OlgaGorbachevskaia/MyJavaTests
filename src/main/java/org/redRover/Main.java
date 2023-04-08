package org.redRover;

import org.apache.commons.lang3.StringUtils;

public class Main {
//    public static void main(String[] args) {
//        testAbbr();
////        System.out.println(StringUtils.abbreviate("Hello world!", 8));
////        System.out.println(Utils.abbr("Hello world!", 8));
//    }
        private static void testAbbr() {
            if(!"Hello...".equals(Utils.abbr("Hello world", 10))){
                System.out.println("bug1");
            }
            if(6 != Utils.sum(2, 5)) {
                System.out.println("bug2");
            }
        }
    }