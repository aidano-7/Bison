package com.aidano7.bison.algebra;

/**
 * @author Aidan O'Sullivan
 * @since 3/28/21
 * @version v0.1
 *
 * <p>
 *     This class is for the implementation of a complex number.
 *     A complex number is a number with a real and imaginary part.
 *     The unit i is defined as the square root of -1.
 * </p>
 */

public class ComplexNumber {

    /**
     * The complex number for i
     */

    public static ComplexNumber i = new ComplexNumber(0,1);

    /**
     * To add a complex number to another, simply add the real part,
     * then the imaginary part.
     *
     * @param a the first number to add
     * @param b the second number to add
     *
     * @return c the sum of a and b
     */

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {

        ComplexNumber c = new ComplexNumber(0f, 0f);

        c.realNumber = a.getRealNumber() + b.getRealNumber();
        c.imaginaryNumber = a.getImaginaryNumber() + b.getImaginaryNumber();

        return c;
    }

    /**
     * To subtract a complex number to another, simply subtract the real part,
     * then the imaginary part.
     *
     * @param a the first number to subtract
     * @param b the second number to subtract
     *
     * @return c the difference of a and b
     */

    public static ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {

        ComplexNumber c = new ComplexNumber(0f, 0f);

        c.realNumber = a.getRealNumber() - b.getRealNumber();
        c.imaginaryNumber = a.getImaginaryNumber() - b.getImaginaryNumber();

        return c;
    }

    /**
     * To multiply a complex number by another, the equation ac + adi + bci + bdi ^ 2
     * is used.
     *
     * In this syntax, a is the first number's real part, b is the first number's complex part,
     * c is the second number's real part, and b is the second number's complex part.
     *
     * @param complexNumberA the first number to multiply
     * @param complexNumberB the second number to multiply
     *
     * @return c the product of a and b
     */

    public static ComplexNumber multiply(ComplexNumber complexNumberA, ComplexNumber complexNumberB) {
        float a = complexNumberA.getRealNumber();
        float b = complexNumberA.getImaginaryNumber();

        float c = complexNumberB.getRealNumber();
        float d = complexNumberB.getImaginaryNumber();

        float realNumber = (a * c) - (b * d);
        float imaginaryNumber = (a * d) + (b * c);
        
        return new ComplexNumber(realNumber, imaginaryNumber);
    }

    /**
     * To divide a complex number by another, the real part of the quotient is defined as
     * (ac + bd) / (a ^ 2 + b ^ 2), and the imaginary part is (ad - cb)i / (a ^ 2 + b ^ 2).
     *
     * In this syntax, a is the first number's real part, b is the first number's complex part,
     * c is the second number's real part, and b is the second number's complex part.
     *
     * @param complexNumberA the first number to divide
     * @param complexNumberB the second number to divide
     *
     * @return c the quotient of a and b
     */

    public static ComplexNumber divide(ComplexNumber complexNumberA, ComplexNumber complexNumberB) {
        float a = complexNumberA.getRealNumber();
        float b = complexNumberA.getImaginaryNumber();

        float c = complexNumberB.getRealNumber();
        float d = complexNumberB.getImaginaryNumber();

        float realNumber = (a * c) + (b * d);
        float imaginaryNumber = (b * c) - (a * d);
        float denominator = (c * c) + (d * d);

        return new ComplexNumber(realNumber / denominator, imaginaryNumber / denominator);
    }

    /**
     * Squaring a complex number is the same as multiplying it by itself, so
     * writing another function is not necessary.
     *
     * @param complexNumber the number to get squared
     *
     * @return c the complexNumber squared
     */

    public static ComplexNumber square(ComplexNumber complexNumber) {
        return ComplexNumber.multiply(complexNumber, complexNumber);
    }

    /**
     * The real part of a complex number.
     */

    private float realNumber;

    /**
     * The imaginary part of a complex number.
     */

    private float imaginaryNumber;

    /**
     * Creates an instance of a complex number with its real and
     * imaginary parts defined.
     *
     * @param realNumber the real part of the complex number
     * @param imaginaryNumber the imaginary part of the complex number
     */

    public ComplexNumber(float realNumber, float imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    /**
     * Returns the the real part of the complex number
     *
     * @return realNumber the real part of the complex number
     */

    public float getRealNumber() {
        return realNumber;
    }

    /**
     * Sets the the real part of the complex number
     *
     * @param realNumber the real part of the complex number
     */

    public void setRealNumber(float realNumber) {
        this.realNumber = realNumber;
    }

    /**
     * Returns the the imaginary part of the complex number
     *
     * @return imaginaryNumber the imaginary part of the complex number
     */

    public float getImaginaryNumber() {
        return imaginaryNumber;
    }

    /**
     * Sets the the imaginary part of the complex number
     *
     * @param imaginaryNumber the imaginary part of the complex number
     */

    public void setImaginaryNumber(float imaginaryNumber) {
        this.imaginaryNumber = imaginaryNumber;
    }

    /**
     * Complex numbers are written as a + bi
     *
     * @return string the standard form of the complex number
     */

    @Override
    public String toString() {
        if (imaginaryNumber > 0) {
            return String.format("%f + %fi", realNumber, imaginaryNumber);
        } else {
            return String.format("%f - %fi", realNumber, -imaginaryNumber);
        }
    }

    /**
     * Adds this and complexNumber using the static method in ComplexNumber
     *
     * @param complexNumber the number to add
     */

    public void add(ComplexNumber complexNumber) {
        ComplexNumber.add(this, complexNumber);
    }

    /**
     * Subtracts this and complexNumber using the static method in ComplexNumber
     *
     * @param complexNumber the number to subtract
     */

    public void subtract(ComplexNumber complexNumber) {
        ComplexNumber.subtract(this, complexNumber);
    }

    /**
     * Multiplies this and complexNumber using the static method in ComplexNumber
     *
     * @param complexNumber the number to multiply
     */

    public void multiply(ComplexNumber complexNumber) {
        ComplexNumber.multiply(this, complexNumber);
    }

    /**
     * Divides this and complexNumber using the static method in ComplexNumber
     *
     * @param complexNumber the number to divide
     */

    public void divide(ComplexNumber complexNumber) {
        ComplexNumber.divide(this, complexNumber);
    }

    /**
     * Squares this using the static method in ComplexNumber
     */

    public void square() {
        ComplexNumber.square(this);
    }

    /**
     * Checks if complexNumber is equal to this
     *
     * @param complexNumber the number to check equality against this
     * @return boolean true if complexNumber === this
     */

    public boolean equals(ComplexNumber complexNumber) {
        return this.realNumber == complexNumber.getRealNumber() && this.imaginaryNumber == complexNumber.getImaginaryNumber();
    }
}
