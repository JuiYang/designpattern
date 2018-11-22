package com.tcl.liyu.disgnmode.factorymode;

public class SubFactory extends Factory {
    @Override
    public Operator getOperator() {
        return new SubOperator();
    }
}
