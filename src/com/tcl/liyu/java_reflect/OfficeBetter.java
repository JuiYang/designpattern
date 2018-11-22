package com.tcl.liyu.java_reflect;

public class OfficeBetter {

    public static void main(String[] args){
        try{
            // 动态加载，在运行时加载类
            Class c1 = Class.forName("com.tcl.liyu.java_reflect.Office");
            // 通过类类型创建该对象的实例对象
            Base base = (Base) c1.newInstance();
            base.printWork();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
