package com.lp.diamond;


public interface A {
    default String hello() {
        return "Hello From A";
    }
}
