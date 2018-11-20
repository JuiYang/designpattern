package com.tcl.liyu.serializable;

import java.io.Serializable;

// 验证双重校验锁单粒模式
public class Singleton2 implements Serializable {
    private volatile static Singleton2 instance;

    private Singleton2(){}


    public static Singleton2 getInstance(){
        if (instance == null){
            synchronized (Singleton2.class){
                if (instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}