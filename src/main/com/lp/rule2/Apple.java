package com.lp.rule2;


public interface Apple extends Fruit {

    default String color() {
        return "Red";
    }
}
