package com.aidano7.bison.algebra.equations;

/**
 * @author aidano-7
 *
 * <p>
 *     Implementation of a quadratic in Bison. Standard form is
 *     ax^2 + bx + c = 0.
 * </p>
 */

public class QuadraticEquation implements Equation {

    public static Equation pointsToLine(float[][] points)  {
        if (points.length >= 3) {
            float x1 = points[0][0];
            float y1 = points[0][1];
            float x2 = points[1][0];
            float y2 = points[1][1];
            float x3 = points[2][0];
            float y3 = points[2][1];

            float A1 = -(x1 * x1) + (x2 * x2);
            float B1 = -x1 + x2;
            float D1 = -y1 + y2;

            float A2 = -(x2 * x2) + (x3 * x3);
            float B2 = -x2 + x3;
            float D2 = -y2 + y3;

            float B_MULTIPLIER = -(B2 / B1);

            float A3 = B_MULTIPLIER * A1 + A2;
            float D3 = B_MULTIPLIER * D1 + D2;

            float a = D3 / A3;
            float b = (D1 - A1 * a) / B1;
            float c = y1 - (a * x1 * a * x1) - b * x1;

            return new QuadraticEquation(a, b, c);
        } else {
            System.out.printf("Expected three or more points, instead found %o%n", points.length);
        }

        return null;
    }

    private float a;
    private float b;
    private float c;

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float get(float x) {
        return (a * x) * (a * x) + b * x + c;
    }

    @Override
    public String toString() {
        return String.format("%fx^2 + %fx + %f = 0", a, b, c);
    }

    public float[] getZeros() {
        boolean isImaginary = b * b - (4 * a * c) < 0;

        float x1 = (b + (float) Math.sqrt((float) b * b - (4 * a * c))) / (2 * a);
        float x2 = (b - (float) Math.sqrt((float) b * b - (4 * a * c))) / (2 * a);

        return new float[] { x1, x2 };
    }
}
