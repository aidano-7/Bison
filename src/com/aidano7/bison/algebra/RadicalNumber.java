package com.aidano7.bison.algebra;

/**
 * @author Aidan O'Sullivan
 * @since 3/26/2021
 */

public class RadicalNumber {

    private float coefficient;
    private int radicand;

    public RadicalNumber(float coefficient, int radicand) {
        this.coefficient = coefficient;
        this.radicand = radicand;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public int getRadicand() {
        return radicand;
    }

    public void setRadicand(int radicand) {
        this.radicand = radicand;
    }

    @Override
    public String toString() {
        return String.format("%f√%d", coefficient, radicand);
    }

    public void add(RadicalNumber radicalNumber) {
        if (radicand == radicalNumber.getRadicand()) {
            this.coefficient += radicalNumber.getCoefficient();
        }
    }

    public void subtract(RadicalNumber radicalNumber) {
        if (radicand == radicalNumber.getRadicand()) {
            this.coefficient -= radicalNumber.getCoefficient();
        }
    }

    public void multiply(RadicalNumber radicalNumber) {
        coefficient *= radicalNumber.getCoefficient();
        radicand *= radicalNumber.getRadicand();
    }

    public void divide(RadicalNumber radicalNumber) {
        RadicalNumber conjugate = new RadicalNumber(1f, radicalNumber.getRadicand());

        multiply(conjugate);
        radicalNumber.multiply(conjugate);

        coefficient = coefficient / (radicalNumber.getCoefficient() * radicalNumber.getCoefficient());

    }

    public boolean equals(RadicalNumber radicalNumber) {
        return coefficient == radicalNumber.getCoefficient() && radicand == radicalNumber.getRadicand();
    }
}
