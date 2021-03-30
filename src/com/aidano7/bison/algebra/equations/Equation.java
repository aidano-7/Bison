package com.aidano7.bison.algebra.equations;

/**
 * @author aidano-7
 * @since 3/30/21
 *
 * <p>
 *     Interface for any Equation class stemming in Bison.
 * </p>
 */

public interface Equation {

    /**
     * Gets the y value of a function.
     *
     * @param x the x value to get
     * @return y the y value of the function
     */

    float get(float x);

    /**
     * Gets the standard form of the function.
     *
     * @return string standard form of the function
     */

    String toString();
}
