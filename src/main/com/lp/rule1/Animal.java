package com.lp.rule1;

public interface Animal {
    default String say() {
        return "From Animal interface";
    }

}
