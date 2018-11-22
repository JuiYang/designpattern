package com.tcl.liyu.singleton;

// 单粒模式之------饿汉模式
/**
 *
 * 饿汉式单例，在类被加载的时候对象就会实例化。这也许会造成不必要的消耗，
 * 因为有可能这个实例根本就不会被用到。
 * 而且，如果这个类被多次加载的话也会造成多次实例化。
 * 线程安全
 *
 * 解决方法: 静态类部内/懒汉模式
 * */
public class Singleton {

    // 私有构造方法
    private Singleton(){}

    // 在类内实例化一个对象
    private static Singleton singleton = new Singleton();

    // 对外提供静态访问该对象方法
    public static Singleton getInstance(){
        return singleton;
    }
}
