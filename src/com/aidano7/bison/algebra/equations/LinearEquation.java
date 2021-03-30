package com.aidano7.bison.algebra.equations;

/**
 * @author aidano-7
 * @since 3/30/21
 *
 * <p>
 *     This class represents a linear equation.
 *     In standard form, a linear equation is written as
 *     y = mx + b.
 * </p>
 */

public class LinearEquation implements Equation {

    /**
     * Returns the linear equation from points a and
     * b.
     *
     * @param a the first point
     * @param b the second point
     * @return LinearEquation equation containing points a and b
     */

    public static LinearEquation pointsToLine(float[] a, float[] b) {
        float x1 = a[0];
        float y1 = a[1];
        float x2 = b[0];
        float y2 = b[1];

        float slope = (y2 - y1) / (x2 - x1);

        float yIntercept = y1 - slope * x1;

        return new LinearEquation(slope, yIntercept);
    }

    /**
     * Slope of a line.
     */

    private float slope;

    /**
     * Y-intercept of a line.
     */

    private float yIntercept;

    /**
     * Creates a new instance of LinearEquation
     *
     * @param slope slope of the line
     * @param yIntercept y-intercept of the line
     */

    public LinearEquation(float slope, float yIntercept) {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }

    /**
     * Gets the slope.
     * @return slope the slope of the line
     */

    public float getSlope() {
        return slope;
    }

    /**
     * Sets the slope.
     *
     * @param slope the new slope of the line.
     */

    public void setSlope(float slope) {
        this.slope = slope;
    }

    /**
     * Gets the y-intercept.
     * @return yIntercept the y-intercept of the line
     */

    public float getYIntercept() {
        return yIntercept;
    }

    /**
     * Sets the y-intercept.
     *
     * @param yIntercept the new y-intercept of the line.
     */

    public void setYIntercept(float yIntercept) {
        this.yIntercept = yIntercept;
    }

    /**
     * Gets the y value at the given x.
     *
     * @param x the x value
     * @return y the y value of the function
     */

    @Override
    public float get(float x) {
        return slope * x + yIntercept;
    }

    /**
     * Returns the standard form of the function,
     * y = mx + b.
     *
     * @return string the standard form of the function
     */

    @Override
    public String toString() {
        if (yIntercept > 0) {
            return String.format("y = %fx + %f", slope, yIntercept);
        } else {
            return String.format("y = %fx - %f", slope, -yIntercept);
        }
    }

    /**
     * Checks if linearEquation is equal to this.
     *
     * @param linearEquation LinearEquation to set equality
     * @return boolean linearEquation == this
     */

    public boolean equals(LinearEquation linearEquation) {
        return slope == linearEquation.getSlope() && yIntercept == linearEquation.getYIntercept();
    }
}
