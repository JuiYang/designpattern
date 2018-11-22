package com.tcl.liyu.java_reflect;

public class ReflectDemo02 {

    public static void main(String[] args) {
        Integer i = new Integer(10);

        ReflectUtils.getName(i);

        // 获取Integer类自己声明的所有方法，不问访问权限
        ReflectUtils.getAllMethods(i);
        // 获取public函数，包括从父类继承而来的方法
        ReflectUtils.getPublicMethods(i);
        // 获取成员变量,获取Integer类自己声明的所有方法，不问访问权限
        ReflectUtils.getDeclaredFields(i);
        // 获取public成员变量，包括从父类继承而来的方法
        ReflectUtils.getFields(i);
        // 获取构造函数
        ReflectUtils.getConstructor(i);
    }
}
