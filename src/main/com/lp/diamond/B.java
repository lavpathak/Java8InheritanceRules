package com.lp.diamond;


public interface B extends A {
    default String hello() {
        return "Hello From B";
    }
}
