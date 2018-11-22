package com.tcl.liyu.singleton;

// 双重校验锁
/**
 * 其实上面的代码存在的问题主要是锁的范围太大了。
 * 只要缩小锁的范围就可以了。那么如何缩小锁的范围呢？
 * 相比于同步方法，同步代码块的加锁范围更小
 *
 *
 * 通过使用同步代码块的方式减小了锁的范围。这样可以大大提高效率。
 * （对于已经存在singleton的情况，无须同步，直接return）。
 *
 * 但是，事情这的有这么容易吗？上面的代码看上去好像是没有任何问题。
 * 实现了惰性初始化，解决了同步问题，还减小了锁的范围，提高了效率。
 * 但是，该代码还存在隐患。隐患的原因主要和Java内存模型（JMM）有关。
 * */
public class Singleton5_Singleton {
    private static Singleton5_Singleton instance;

    private Singleton5_Singleton(){}

    public static Singleton5_Singleton getInstance(){
        if (instance == null){
            synchronized(Singleton5_Singleton.class){
                if (instance == null){
                    instance = new Singleton5_Singleton();
                }
            }
        }
        return instance;
    }
}
