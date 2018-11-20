package com.tcl.liyu.singleton;

import com.tcl.liyu.singleton.Singleton8_enum;

public class Main {

    public static void main(String[] args) {

//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
        Singleton8_enum s1 = Singleton8_enum.INSTANCE;
        Singleton8_enum s2 = Singleton8_enum.INSTANCE;
        System.out.println(s1==s2);
        System.out.println("Hello World!");
    }
}
