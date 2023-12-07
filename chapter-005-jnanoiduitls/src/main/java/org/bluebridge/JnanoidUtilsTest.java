package org.bluebridge;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;

import java.util.Random;

public class JnanoidUtilsTest {
    public static void main(String[] args) {
        //默认生成一个长度为21位的id
        String defaultId = NanoIdUtils.randomNanoId();
        System.out.println(defaultId);

        // Use a faster, but non-secure, random generator
        Random random = new Random();
        // Use a custom alphabet containing only a, b, and c
        char[] alphabet = {'a','b','c'};
        // Make IDs 10 characters long
        int size = 10;
        String seniorId = NanoIdUtils.randomNanoId(random, alphabet, 32);
        System.out.println(seniorId);
    }
}