package com.tcl.liyu.singleton;

import java.io.Serializable;

/**
 * Hollis就分析过单例和序列化之前的关系——序列化可以破坏单例。
 * 要想防止序列化对单例的破坏，只要在Singleton类中定义readResolve就可以解决该问题
 *
 * */

public class Singleton7_Serializable implements Serializable {
    private static volatile Singleton7_Serializable instance;

    private Singleton7_Serializable(){}

    public static Singleton7_Serializable getInstance(){
        if (instance == null){
            synchronized(Singleton7_Serializable.class){
                if (instance == null){
                    instance = new Singleton7_Serializable();
                }
            }
        }
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
