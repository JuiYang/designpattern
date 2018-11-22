package com.tcl.liyu.java_reflect;

import java.lang.reflect.Method;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception{
        // 反射获取Office类的类类型
        TT tt = new TT();
        Class c1 = tt.getClass();
        // 获取方法
        Method method = c1.getMethod("print",new Class[]{String.class, String.class});
        // invoke:传入类路径名，和方法参数
        method.invoke(tt,new Object[]{"10","40"});
    }
}

class TT {
    public void print(int a, int b){
        System.out.println(a+b);
    }

    public void print(String a, String b){
        System.out.println(a+b);
    }
}
