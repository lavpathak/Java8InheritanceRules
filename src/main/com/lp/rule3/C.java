package com.lp.rule3;

public class C implements A, B {
    public String hello() {
        return A.super.hello();
    }
}
