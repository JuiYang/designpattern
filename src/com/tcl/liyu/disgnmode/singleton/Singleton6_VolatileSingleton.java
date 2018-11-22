package com.tcl.liyu.singleton;

/**
 * 解决的问题：双重检查锁有潜在的危险，有时会正常工作
 * （区分正确实现和有小问题的实现是很困难的。取决于编译器，线程的调度和其他并发系统活动，
 * 不正确的实现双重检查锁导致的异常结果可能会间歇性出现。重现异常是十分困难的。）
 * 在J2SE 5.0中，这一问题被修正了。volatile关键字保证多个线程可以正确处理单件实例
 *
 *
 * 存在的问题：
 *  存在问题，那就是遇到序列化的时候
 *
 * */
public class Singleton6_VolatileSingleton {
    private static volatile Singleton6_VolatileSingleton instance;

    private Singleton6_VolatileSingleton(){}


    public static Singleton6_VolatileSingleton getInstance(){
        if (instance == null){
            synchronized(Singleton6_VolatileSingleton.class){
                if (instance == null){
                    instance = new Singleton6_VolatileSingleton();
                }
            }
        }
        return instance;
    }
}
