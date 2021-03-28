package com.aidano7.bison.algebra;

import static org.junit.jupiter.api.Assertions.*;

class RadicalNumberTest {

    @org.junit.jupiter.api.Test
    void getCoefficient() {
        RadicalNumber radicalNumber = new RadicalNumber(1f, 10);
        assertEquals(radicalNumber.getCoefficient(), 1f, 0f);
    }

    @org.junit.jupiter.api.Test
    void getRadicand() {
        RadicalNumber radicalNumber = new RadicalNumber(1f, 10);
        assertEquals(radicalNumber.getRadicand(), 10, 0);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        RadicalNumber radicalNumber = new RadicalNumber(1f, 10);
        assertEquals(radicalNumber.toString(), "1.000000√10");
    }

    @org.junit.jupiter.api.Test
    void add() {
        RadicalNumber a = new RadicalNumber(2f, 5);
        RadicalNumber b = new RadicalNumber(3f, 5);

        a.add(b);

        boolean equals = a.equals(new RadicalNumber(5f, 5));

        assertTrue(equals);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        RadicalNumber a = new RadicalNumber(2f, 5);
        RadicalNumber b = new RadicalNumber(3f, 5);

        a.subtract(b);

        boolean equals = a.equals(new RadicalNumber(-1f, 5));

        assertTrue(equals);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        RadicalNumber a = new RadicalNumber(2f, 5);
        RadicalNumber b = new RadicalNumber(3f, 3);

        a.multiply(b);

        boolean equals = a.equals(new RadicalNumber(6f, 15));

        assertTrue(equals);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        RadicalNumber a = new RadicalNumber(2f, 5);
        RadicalNumber b = new RadicalNumber(3f, 3);

        a.divide(b);

        boolean equals = a.equals(new RadicalNumber(2f / 9f, 15));

        assertTrue(equals);
    }
}