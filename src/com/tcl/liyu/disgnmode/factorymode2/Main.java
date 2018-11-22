package com.tcl.liyu.disgnmode.factorymode;

public class Main {

    public static void main(String[] args){
        // 创建产品工厂
        Factory factory = new AddFactory();
        Operator operator = factory.getOperator();
        operator.setA(100);
        operator.setB(12);
        int result = operator.getResult();
        System.out.println("result: "+result);
    }
}
