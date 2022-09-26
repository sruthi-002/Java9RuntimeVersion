package com.company;
public class Main {
    public static void main(String[] args) {
        Runtime.Version V = Runtime.version();
        System.out.println("Version : "+V.version());
        System.out.println("Major version number : "+V.major());
        System.out.println("Minor version number : "+V.minor());
        System.out.println("Security version : "+V.security());
        System.out.println("Build number : "+V.build());
    }
}
