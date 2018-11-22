package com.tcl.liyu.disgnmode.factorymode;

public class MulFactory extends Factory {
    @Override
    public Operator getOperator() {
        return new MulOperator();
    }
}
