package com.lp.rule3;


import org.junit.Assert;
import org.junit.Test;

public class CTest {
    @Test
    public void shouldProvideItsOwnImplementation() {
        C cObj= new C();
        Assert.assertEquals("Hello From A", cObj.hello());
    }
}