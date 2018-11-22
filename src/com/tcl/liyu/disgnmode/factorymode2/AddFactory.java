package com.tcl.liyu.disgnmode.factorymode;

public class AddFactory extends Factory {

    @Override
    public Operator getOperator() {
        return new AddOperator();
    }
}
