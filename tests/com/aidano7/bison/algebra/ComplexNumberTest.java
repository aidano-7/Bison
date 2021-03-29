package com.aidano7.bison.algebra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @Test
    void getRealNumber() {
        ComplexNumber complexNumber = new ComplexNumber(1f, 5f);
        assertEquals(complexNumber.getRealNumber(), 1f, 0f);
    }

    @Test
    void getImaginaryNumber() {
        ComplexNumber complexNumber = new ComplexNumber(1f, 5f);
        assertEquals(complexNumber.getImaginaryNumber(), 5f, 0f);
    }

    @Test
    void testToString() {
        ComplexNumber complexNumberPositive = new ComplexNumber(1f, 5f);
        assertEquals(complexNumberPositive.toString(), "1.000000 + 5.000000i");

        ComplexNumber complexNumberNegative = new ComplexNumber(1f, -5f);
        assertEquals(complexNumberNegative.toString(), "1.000000 - 5.000000i");
    }

    @Test
    void add() {
        ComplexNumber a = new ComplexNumber(2f, 3f);
        ComplexNumber b = new ComplexNumber(1f, 5f);

        ComplexNumber c = ComplexNumber.add(a, b);

        boolean equals = c.equals(new ComplexNumber(3, 8));

        assertTrue(equals);
    }

    @Test
    void subtract() {
        ComplexNumber a = new ComplexNumber(2f, 3f);
        ComplexNumber b = new ComplexNumber(1f, 5f);

        ComplexNumber c = ComplexNumber.subtract(a, b);

        boolean equals = c.equals(new ComplexNumber(1f, -2f));

        assertTrue(equals);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        ComplexNumber a = new ComplexNumber(2f, 3f);
        ComplexNumber b = new ComplexNumber(1f, 5f);

        ComplexNumber c = ComplexNumber.multiply(a, b);

        boolean equals = c.equals(new ComplexNumber(-13f, 13f));

        assertTrue(equals);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        ComplexNumber a = new ComplexNumber(2f, 3f);
        ComplexNumber b = new ComplexNumber(1f, 5f);

        ComplexNumber c = ComplexNumber.divide(a, b);

        boolean equals = c.equals(new ComplexNumber(17f / 26f, -7f / 26f));

        assertTrue(equals);
    }

    @org.junit.jupiter.api.Test
    void square() {
        ComplexNumber complexNumber = new ComplexNumber(2f, 3f);

        ComplexNumber complexNumberSquared = ComplexNumber.square(complexNumber);

        boolean equals = complexNumberSquared.equals(new ComplexNumber(-5f, 12f));

        assertTrue(equals);
    }
}