package com.tcl.liyu.singleton;


// 枚举式
//
//在1.5之前，实现单例一般只有以上几种办法，在1.5之后，还有另外一种实现单例的方式，那就是使用枚举：
public enum Singleton8_enum {
    INSTANCE;
    Singleton8_enum() {
    }
}
