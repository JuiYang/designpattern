package com.tcl.liyu.disgnmode.factorymode;

public class MulOperator extends Operator {
    @Override
    public int getResult() {
        return getA()*getB();
    }
}
