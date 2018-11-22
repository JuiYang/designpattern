package com.tcl.liyu.disgnmode.factorymode;

public class SubOperator extends Operator {
    @Override
    public int getResult() {
        return getA()-getB();
    }
}
