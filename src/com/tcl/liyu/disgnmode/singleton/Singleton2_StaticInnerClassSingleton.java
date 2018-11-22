package com.tcl.liyu.singleton;


// 静态内部类方法
/**
 *
 *
 * */
public class Singleton2_StaticInnerClassSingleton {


    // 静态内部类，并实例化对象
    private static class SingletonHolder{
          private static final Singleton2_StaticInnerClassSingleton INSTANCE =
                new Singleton2_StaticInnerClassSingleton();
    }

    // 私有化构造方法
    private Singleton2_StaticInnerClassSingleton(){
    }

    // 对外提供实例化的静态方法
    public static final Singleton2_StaticInnerClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
