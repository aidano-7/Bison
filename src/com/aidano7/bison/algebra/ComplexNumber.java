package com.aidano7.bison.algebra;

/**
 * @author Aidan O'Sullivan
 * @date 3/26/2021
 */

public class ComplexNumber {

    public static ComplexNumber i = new ComplexNumber(0,1);

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {

        ComplexNumber c = new ComplexNumber(0f, 0f);

        c.realNumber = a.getRealNumber() + b.getRealNumber();
        c.imaginaryNumber = a.getImaginaryNumber() + b.getImaginaryNumber();

        return c;
    }

    public static ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {

        ComplexNumber c = new ComplexNumber(0f, 0f);

        c.realNumber = a.getRealNumber() - b.getRealNumber();
        c.imaginaryNumber = a.getImaginaryNumber() - b.getImaginaryNumber();

        return c;
    }

    public static ComplexNumber multiply(ComplexNumber complexNumberA, ComplexNumber complexNumberB) {
        float a = complexNumberA.getRealNumber();
        float b = complexNumberA.getImaginaryNumber();

        float c = complexNumberB.getRealNumber();
        float d = complexNumberB.getImaginaryNumber();

        float realNumber = (a * c) - (b * d);
        float imaginaryNumber = (a * d) + (b * c);
        
        return new ComplexNumber(realNumber, imaginaryNumber);
    }

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

    public static ComplexNumber square(ComplexNumber complexNumber) {
        return ComplexNumber.multiply(complexNumber, complexNumber);
    }

    private float realNumber;
    private float imaginaryNumber;

    public ComplexNumber(float realNumber, float imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public float getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(float realNumber) {
        this.realNumber = realNumber;
    }

    public float getImaginaryNumber() {
        return imaginaryNumber;
    }

    public void setImaginaryNumber(float imaginaryNumber) {
        this.imaginaryNumber = imaginaryNumber;
    }

    @Override
    public String toString() {
        if (imaginaryNumber > 0) {
            return String.format("%f + %fi", realNumber, imaginaryNumber);
        } else {
            return String.format("%f - %fi", realNumber, -imaginaryNumber);
        }
    }

    public void add(ComplexNumber complexNumber) {
        this.realNumber += complexNumber.getRealNumber();
        this.imaginaryNumber += complexNumber.getImaginaryNumber();
    }

    public void subtract(ComplexNumber complexNumber) {
        this.realNumber -= complexNumber.getRealNumber();
        this.imaginaryNumber -= complexNumber.getImaginaryNumber();
    }

    public void square() {
        ComplexNumber.multiply(this, this);
    }

    public boolean equals(ComplexNumber complexNumber) {
        return this.realNumber == complexNumber.getRealNumber() && this.imaginaryNumber == complexNumber.getImaginaryNumber();
    }
}
