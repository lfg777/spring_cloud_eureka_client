package com.me;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        String[] aa = new String[]{"1","3","r"};
        System.out.println(Arrays.toString(aa));
        System.out.println(String.join(",",aa));

        System.out.println("Hello World!");
    }
}
