package com.lp.rule1;


import org.junit.Assert;
import org.junit.Test;

public class BullDogTest {

    @Test
    public void shouldInheritFromClassOverInterface() {
        BullDog max = new BullDog();
        Assert.assertEquals("From Dog Class", max.say());
    }
}