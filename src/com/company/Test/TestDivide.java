package com.company.Test;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDivide {
    @Test
    public  void testDivide6by3() {
        Divide div = new Divide();
        assertEquals(2d,div.doOperation(6d,3d),0);
    }

    @Test
    public void testDivideLong() {
        Divide div = new Divide();
        assertEquals(100000d,div.doOperation(12345600000d,123456d),0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideBy0() {
        Divide div = new Divide();
        div.doOperation(12345600000d,0);
    }
}
