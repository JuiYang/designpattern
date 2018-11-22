package com.tcl.liyu.disgnmode.factorymode;

// 基类
public abstract class Operator {
    private int a;
    private int b;

    public abstract int getResult();

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
