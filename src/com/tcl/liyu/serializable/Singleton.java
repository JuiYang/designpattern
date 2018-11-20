package com.tcl.liyu.serializable;

import java.io.Serializable;

// 验证双重校验锁单粒模式
public class Singleton implements Serializable {
    private volatile static Singleton instance;

    private Singleton(){}


    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}