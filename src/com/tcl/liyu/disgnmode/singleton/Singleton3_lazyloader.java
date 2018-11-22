package com.tcl.liyu.singleton;


// 懒汉模式
/**
 * 线程不安全
 *
 * */
public class Singleton3_lazyloader {


    // 静态内部类，并实例化对象
    private static Singleton3_lazyloader instance;

    // 私有化构造方法
    private Singleton3_lazyloader(){
    }

    // 对外提供实例化的静态方法
    public static final Singleton3_lazyloader getInstance(){
        if (instance == null){
            return new Singleton3_lazyloader();
        }
        return instance;
    }
}
