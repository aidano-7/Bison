package com.aidano7.bison.algebra.equations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearEquationTest {

    @Test
    void pointsToLine() {
        float[] a = {0f, 0f};
        float[] b = {1f, 1f};

        LinearEquation linearEquation = LinearEquation.pointsToLine(a, b);

        assertEquals(linearEquation.getSlope(), 1f, 0f);
        assertEquals(linearEquation.getYIntercept(), 0f, 0f);
    }

    @Test
    void get() {
        LinearEquation linearEquation = new LinearEquation(2f, 0f);
        float y = linearEquation.get(1f);

        assertEquals(y, 2f, 0f);
    }

    @Test
    void testToString() {
        LinearEquation linearEquationPositive = new LinearEquation(2f, 1f);
        LinearEquation linearEquationNegative = new LinearEquation(2f, -1f);

        assertEquals(linearEquationPositive.toString(), "y = 2.000000x + 1.000000");
        assertEquals(linearEquationNegative.toString(), "y = 2.000000x - 1.000000");
    }
}