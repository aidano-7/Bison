package com.aidano7.bison.linearAlgebra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector3Test {

    @Test
    void getX() {
        Vector3 vector3 = new Vector3(1f, 2f, 5f);
        assertEquals(vector3.getX(), 1f, 0f);
    }

    @Test
    void getY() {
        Vector3 vector3 = new Vector3(1f, 2f, 5f);
        assertEquals(vector3.getY(), 2f, 0f);
    }

    @Test
    void getZ() {
        Vector3 vector3 = new Vector3(1f, 2f, 5f);
        assertEquals(vector3.getZ(), 5f, 0f);
    }

    @Test
    void testToString() {
        Vector3 vector3 = new Vector3(1f, 2f, 5f);
        assertEquals(vector3.toString(), "(1.000000, 2.000000, 5.000000)");
    }

    @Test
    void add() {
        Vector3 a = new Vector3(1f, 2f, 5f);
        Vector3 b = new Vector3(3f, 4f, 7f);

        Vector3 c = Vector3.add(a, b);

        boolean equals = c.equals(new Vector3(4f, 6f, 12f));

        assertTrue(equals);
    }

    @Test
    void subtract() {
        Vector3 a = new Vector3(1f, 2f, 5f);
        Vector3 b = new Vector3(3f, 4f, 7f);

        Vector3 c = Vector3.subtract(a, b);

        boolean equals = c.equals(new Vector3(-2f, -2f, -2f));

        assertTrue(equals);
    }

    @Test
    void multiply() {
        Vector3 a = new Vector3(1f, 2f, 5f);
        Vector3 b = new Vector3(3f, 4f, 7f);

        Vector3 c = Vector3.multiply(a, b);

        boolean equals = c.equals(new Vector3(3f, 8f, 35f));

        assertTrue(equals);
    }

    @Test
    void divide() {
        Vector3 a = new Vector3(1f, 2f, 5f);
        Vector3 b = new Vector3(3f, 4f, 7f);

        Vector3 c = Vector3.divide(a, b);

        boolean equals = c.equals(new Vector3(1f / 3f, 1f / 2f, 5f / 7f));

        assertTrue(equals);
    }

    @Test
    void square() {
        Vector3 a = new Vector3(1f, 2f, 5f);

        Vector3 b = Vector3.square(a);

        boolean equals = b.equals(new Vector3(1f, 4f, 25f));

        assertTrue(equals);
    }
}