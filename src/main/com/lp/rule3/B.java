package com.lp.rule3;

public interface B {
    default String hello() {
        return "Hello from B";
    }
}
