package org.example;

import org.apache.commons.lang3.RandomStringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(RandomStringUtils.random(15,true,false));
        System.out.println(RandomStringUtils.random(10,true,true));
        System.out.println(RandomStringUtils.random(11,true,true));
        System.out.println(RandomStringUtils.random(12,true,true));
        System.out.println("new branch");
    }
}