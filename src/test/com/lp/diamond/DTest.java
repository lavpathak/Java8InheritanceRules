package com.lp.diamond;

import org.junit.Assert;
import org.junit.Test;

public class DTest {

    @Test
    public void shouldProvideItsOwnImplementation() {
        D dObj= new D();
        Assert.assertEquals("Hello From D", dObj.hello());
    }
}