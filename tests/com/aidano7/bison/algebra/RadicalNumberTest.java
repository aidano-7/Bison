package com.aidano7.bison.algebra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadicalNumberTest {

    @Test
    void getCoefficient() {
        RadicalNumber radicalNumber = new RadicalNumber(1f, 10);
        assertEquals(radicalNumber.getCoefficient(), 1f, 0f);
    }

    @Test
    void getRadicand() {
        RadicalNumber radicalNumber = new RadicalNumber(1f, 10);
        assertEquals(radicalNumber.getRadicand(), 10, 0);
    }

    @Test
    void testToString() {
        RadicalNumber radicalNumber = new RadicalNumber(1f, 10);
        assertEquals(radicalNumber.toString(), "1.000000√10");
    }

    @Test
    void add() {
        RadicalNumber a = new RadicalNumber(2f, 5);
        RadicalNumber b = new RadicalNumber(3f, 5);

        RadicalNumber c = RadicalNumber.add(a, b);

        assert c != null;
        boolean equals = c.equals(new RadicalNumber(5f, 5));

        assertTrue(equals);
    }

    @Test
    void subtract() {
        RadicalNumber a = new RadicalNumber(2f, 5);
        RadicalNumber b = new RadicalNumber(3f, 5);

        RadicalNumber c = RadicalNumber.subtract(a, b);

        assert c != null;
        boolean equals = c.equals(new RadicalNumber(-1f, 5));

        assertTrue(equals);
    }

    @Test
    void multiply() {
        RadicalNumber a = new RadicalNumber(2f, 5);
        RadicalNumber b = new RadicalNumber(3f, 5);

        RadicalNumber c = RadicalNumber.multiply(a, b);

        boolean equals = c.equals(new RadicalNumber(6f, 25));

        assertTrue(equals);
    }
}