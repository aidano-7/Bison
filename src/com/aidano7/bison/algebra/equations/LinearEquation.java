package com.aidano7.bison.algebra.equations;

/**
 * @author Aidan O'Sullivan
 * @since 3/26/2021
 */

public class LinearEquation implements Equation {

    public static LinearEquation pointsToLine(float[] a, float[] b) {
        float x1 = a[0];
        float y1 = a[1];
        float x2 = b[0];
        float y2 = b[1];

        float slope = (y2 - y1) / (x2 - x1);

        float yIntercept = y1 - slope * x1;

        return new LinearEquation(slope, yIntercept);
    }

    private float slope;
    private float yIntercept;

    public LinearEquation(float slope, float yIntercept) {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }

    public float getSlope() {
        return slope;
    }

    public void setSlope(float slope) {
        this.slope = slope;
    }

    public float getYIntercept() {
        return yIntercept;
    }

    public void setYIntercept(float yIntercept) {
        this.yIntercept = yIntercept;
    }

    @Override
    public float get(float x) {
        return slope * x + yIntercept;
    }

    @Override
    public String toString() {
        if (yIntercept > 0) {
            return String.format("y = %fx + %f", slope, yIntercept);
        } else {
            return String.format("y = %fx - %f", slope, -yIntercept);
        }
    }

    public boolean equals(LinearEquation linearEquation) {
        return slope == linearEquation.getSlope() && yIntercept == linearEquation.getYIntercept();
    }
}
