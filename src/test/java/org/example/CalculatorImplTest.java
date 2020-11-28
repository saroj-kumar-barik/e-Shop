package org.example;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorImplTest {

    @Test
    public void sum() {
        CalculatorImpl ci = new CalculatorImpl();
        int res = ci.sum(10,20);
        Assert.assertEquals(30,res);

    }

    @Test
    public void sub() {
        CalculatorImpl ci = new CalculatorImpl();
        int res = ci.sub(10,20);
        Assert.assertEquals(-10,res);
    }

    @Test
    public void mul() {
        CalculatorImpl ci = new CalculatorImpl();
        int res = ci.mul(10,20);
        Assert.assertEquals(200,res);
    }

    @Test
    @Ignore
    public void div() {
        CalculatorImpl ci = new CalculatorImpl();
        int res = ci.div(10,20);
        Assert.assertEquals(0,res);
    }

    @Test
    public void div1() {
        CalculatorImpl ci = new CalculatorImpl();
        int res = ci.div(10,0);
        Assert.assertEquals(0,res);
    }
}