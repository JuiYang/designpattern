package com.tcl.liyu.disgnmode.factorymode;

public class AddOperator extends Operator {

    @Override
    public int getResult() {
        return getA()+getB();
    }
}
