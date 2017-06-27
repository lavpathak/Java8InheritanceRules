package com.lp.diamond;


public interface C extends A {
    default String hello() {
        return "Hello From C";
    }
}
