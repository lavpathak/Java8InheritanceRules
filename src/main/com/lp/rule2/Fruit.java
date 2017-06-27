package com.lp.rule2;


public interface Fruit {
    default String color() {
        return "Default Color";
    }
}
