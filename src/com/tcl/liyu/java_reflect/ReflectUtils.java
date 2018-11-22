package com.tcl.liyu.java_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectUtils {

    public static void getName(Object obj){
        // 要获取类的信息，首先获取类的类类型
        Class c1 = obj.getClass();
        System.out.println(c1.getName());
    }

    // 获取所有方法，没有权限区分（public, private）
    public static void getAllMethods(Object obj){
        Class c1 = obj.getClass();
        Method[] methods = c1.getDeclaredMethods();
        // 获取所有方法的信息（返回值类型， 函数名，参数列表）
        for (Method method: methods) {

            // 获取方法的返回值类型
            Class<?> returnType = method.getReturnType();
            System.out.print(returnType+" ");
            // 获取方法名称
            String methodName = method.getName();
            System.out.print(methodName);

            System.out.print(" (");
            // 获取 方法参数列表
            Class<?>[] parameters = method.getParameterTypes();
            for (Class parameter: parameters) {
                System.out.print(" "+parameter.getTypeName());
            }
            System.out.println(")");
        }
    }

    public static void getPublicMethods(Object obj){
        Class c1 = obj.getClass();
        Method[] methods = c1.getMethods();
        for (Method method: methods) {
            // 获取方法的返回值类型
            Class<?> returnType = method.getReturnType();
            System.out.print(returnType+"  ");
            // 获取方法名称
            String methodName = method.getName();
            System.out.print(methodName);

            System.out.print("  (");
            // 获取 方法参数列表
            Class<?>[] parameters = method.getParameterTypes();
            for (Class parameter: parameters) {
                System.out.print(" "+parameter.getTypeName());
            }
            System.out.println(")");
        }
    }

    public static void getDeclaredFields(Object obj){
        Class c1 = obj.getClass();
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            // 获取成员变量数据类型的类类型
            Class fieldType = field.getType();
            System.out.print(fieldType.getTypeName() +"  ");
            // 获取成员变量名称
            System.out.println(field.getName());
        }
    }

    public static void getFields(Object obj){
        Class c1 = obj.getClass();

    }


    public static void getConstructor(Object obj){
        Class c1 = obj.getClass();
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName()+"(");
            Class[] parameters = constructor.getParameterTypes();
            for (Class parameter : parameters){
                System.out.print(parameter.getTypeName());
            }
            System.out.println(")");
        }
    }
}
