package com.lp.rule2;

import org.junit.Assert;
import org.junit.Test;

public class OpalAppleTest {
    @Test
    public void shouldInheritFromLowerInterface() {
        OpalApple appleA = new OpalApple();
        Assert.assertEquals("Red", appleA.color());
    }
}