package com.aidano7.bison.algebra;

/**
 * @author aidano-7
 * @since 3/26/2021
 *
 * <p>
 *      This class is for the implementation of a radical number.
 *      A radical number has two part, the coefficient and the
 *      radicand.
 * </p>
 */

public class RadicalNumber {

    /**
     * Adds the two numbers if both radicands are equal.
     *
     * @param radicalNumberA first number to add
     * @param radicalNumberB second number to add
     * @return radicalNumberC sum of radicalNumberA and radicalNumberB
     */

    public static RadicalNumber add(RadicalNumber radicalNumberA, RadicalNumber radicalNumberB) {

        RadicalNumber radicalNumberC = new RadicalNumber(0f, 0);

        if (radicalNumberA.getRadicand() == radicalNumberB.getRadicand()) {
            radicalNumberC.setRadicand(radicalNumberA.getRadicand());
            radicalNumberC.setCoefficient(radicalNumberA.coefficient + radicalNumberB.getCoefficient());
            return radicalNumberC;
        }

        return null;
    }

    /**
     * Subtracts the two numbers if both radicands are equal.
     *
     * @param radicalNumberA first number to subtract
     * @param radicalNumberB second number to subtract
     * @return radicalNumberC difference of radicalNumberA and radicalNumberB
     */

    public static RadicalNumber subtract(RadicalNumber radicalNumberA, RadicalNumber radicalNumberB) {

        RadicalNumber radicalNumberC = new RadicalNumber(0f, 0);

        if (radicalNumberA.getRadicand() == radicalNumberB.getRadicand()) {
            radicalNumberC.setRadicand(radicalNumberA.getRadicand());
            radicalNumberC.setCoefficient(radicalNumberA.coefficient - radicalNumberB.getCoefficient());
            return radicalNumberC;
        }

        return null;
    }

    /**
     * Multiplies the two numbers.
     *
     * @param radicalNumberA the first number to multiply
     * @param radicalNumberB the second number to multiply
     * @return radicalNumberC the product of radicalNumberA and radicalNumberB
     */

    public static RadicalNumber multiply(RadicalNumber radicalNumberA, RadicalNumber radicalNumberB) {
        RadicalNumber radicalNumberC = new RadicalNumber(0f, 0);

        radicalNumberC.setCoefficient(radicalNumberA.getCoefficient() * radicalNumberB.getCoefficient());
        radicalNumberC.setRadicand(radicalNumberA.getRadicand() * radicalNumberB.getRadicand());

        return radicalNumberC;
    }

    /**
     * The coefficient is the leading term, or multiplier.
     */

    private float coefficient;

    /**
     * The radicand is the term inside the square root.
     */

    private int radicand;

    /**
     * Creates an instance of a radical number with a defined coefficient
     * and radicand.
     *
     * @param coefficient the coefficient of the radical number
     * @param radicand the radicand of the radical number
     */

    public RadicalNumber(float coefficient, int radicand) {
        this.coefficient = coefficient;
        this.radicand = radicand;
    }

    /**
     * Returns the coefficient.
     *
     * @return coefficient the coefficient of the radical number
     */

    public float getCoefficient() {
        return coefficient;
    }

    /**
     * Sets the coefficient.
     *
     * @param coefficient the coefficient of the radical number
     */

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    /**
     * Returns the radicand.
     *
     * @return radicand the radicand of the radical number
     */

    public int getRadicand() {
        return radicand;
    }

    /**
     * Sets the radicand.
     *
     * @param radicand the radicand of the radical number
     */

    public void setRadicand(int radicand) {
        this.radicand = radicand;
    }

    /**
     * Radical numbers are written as a√b.
     *
     * @return string the standard form of the radical number
     */

    @Override
    public String toString() {
        return String.format("%f√%d", coefficient, radicand);
    }

    /**
     * Adds this and radicalNumber using the static method.
     *
     * @param radicalNumber the number to add
     */

    public void add(RadicalNumber radicalNumber) {
        RadicalNumber.add(this, radicalNumber);
    }

    /**
     * Subtracts this and radicalNumber using the static method.
     *
     * @param radicalNumber the number to subtract
     */

    public void subtract(RadicalNumber radicalNumber) {
        RadicalNumber.subtract(this, radicalNumber);
    }

    /**
     * Multiplies this and radicalNumber using the static method.
     *
     * @param radicalNumber the number to multiply
     */

    public void multiply(RadicalNumber radicalNumber) {
        RadicalNumber.multiply(this, radicalNumber);
    }

    /**
     * Checks if radicalNumber is equal to this.
     *
     * @param radicalNumber the number to check equality against this
     * @return boolean true if radicalNumber === this
     */

    public boolean equals(RadicalNumber radicalNumber) {
        return coefficient == radicalNumber.getCoefficient() && radicand == radicalNumber.getRadicand();
    }

    /**
     * Returns the approximate value of this.
     *
     * @return float approximate value of this
     */

    public float approximate() {
        return coefficient * ((float) Math.sqrt(radicand));
    }
}
