package com.lp.rule3;

public interface A {
    default String hello() {
        return "Hello from A";
    }
}
