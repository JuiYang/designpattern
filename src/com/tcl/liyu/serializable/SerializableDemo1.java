package com.tcl.liyu.serializable;

import java.io.*;


/**
 * 到目前为止，也就可以解释，为什么序列化可以破坏单例了？
 *  readObject --> readOrdinaryObject --> var2.isInstantiable() ? var2.newInstance() : null;
 *     答：序列化会通过反射调用无参数的构造方法创建一个新的对象。
 * */


/**
 *
 * readObject --> readOrdinaryObject --> hasReadResolveMethod --> invokeReadResolve
 * hasReadResolveMethod:如果实现了serializable 或者 externalizable接口的类中包含readResolve则返回true
 *
 * invokeReadResolve:通过反射的方式调用要被反序列化的类的readResolve方法。
 *
 * */

//<a href="http://www.hollischuang.com/archives/1140">深入分析Java的序列化与反序列化</a>
public class SerializableDemo1 {

    public static void main(String[] args) throws Exception{
/**
        Singleton instance = Singleton.getInstance();
        // 将对象序列化后存储到文件中
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("tmp"));
        output.writeObject(instance);

        File file = new File("tmp");
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        Singleton singleton = (Singleton) input.readObject();
        System.out.println(singleton==instance?"是同一个对象":"不是同一个对象");
        // 返回false
 */

        // 加入readResolve()方法
        Singleton2 instance = Singleton2.getInstance();
        // 将对象序列化后存储到文件中
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("tmp"));
        output.writeObject(instance);

        File file = new File("tmp");
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        Singleton2 singleton = (Singleton2) input.readObject();
        System.out.println(singleton==instance?"是同一个对象":"不是同一个对象");
        // 返回true

    }
}
