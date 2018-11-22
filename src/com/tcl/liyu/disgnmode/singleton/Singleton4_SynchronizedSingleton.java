package com.tcl.liyu.singleton;

// 线程安全的懒汉模式
/**
 * 针对线程不安全的懒汉式的单例，其实解决方式很简单，就是给创建对象的步骤加锁：
 *
 * 缺点：
 * 他效率很低，因为99%情况下不需要同步。（因为上面的synchronized的加锁范围是整个方法，
 * 该方法的所有操作都是同步进行的，但是对于非第一次创建对象的情况，
 * 也就是没有进入if语句中的情况，根本不需要同步操作，
 * 可以直接返回instance。）
 * */
public class Singleton4_SynchronizedSingleton {
    private static Singleton4_SynchronizedSingleton instance;

    private Singleton4_SynchronizedSingleton(){}


    // 对外提供实例化对象的静态方法，并对该方法加锁
    public static synchronized Singleton4_SynchronizedSingleton getInstance(){
        if (instance == null){
            return new Singleton4_SynchronizedSingleton();
        }
        return instance;
    }
}
