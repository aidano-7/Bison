# Documentation

## `public class ComplexNumber`

* **Author:** Aidan O'Sullivan
* **Since:** 3/28/21
* **Version:** v0.1

    <p>

    <p>

  This class is for the implementation of a complex number.

  A complex number is a number with a real and imaginary part.

  The unit 𝑖 is defined as the square root of -1.

    </p>

## `public static ComplexNumber i = new ComplexNumber(0,1)`

The complex number for 𝑖

## `public static ComplexNumber add(ComplexNumber a, ComplexNumber b)`

To add a complex number to another, simply add the real part, then the imaginary part.

* **Parameters:**
    * `a` — the first number to add
    * `b` — the second number to add

      <p>
* **Returns:** c the sum of a and b

## `public static ComplexNumber subtract(ComplexNumber a, ComplexNumber b)`

To subtract a complex number to another, simply subtract the real part, then the imaginary part.

* **Parameters:**
    * `a` — the first number to subtract
    * `b` — the second number to subtract

      <p>
* **Returns:** c the difference of a and b

## `public static ComplexNumber multiply(ComplexNumber complexNumberA, ComplexNumber complexNumberB)`

To multiply a complex number by another, the equation ac + ad𝑖 + bc𝑖 + bd𝑖 ^ 2 is used.

In this syntax, a is the first number's real part, b is the first number's complex part, c is the second number's real part, and b is the second number's complex part.

* **Parameters:**
    * `complexNumberA` — the first number to multiply
    * `complexNumberB` — the second number to multiply

      <p>
* **Returns:** c the product of a and b

## `public static ComplexNumber divide(ComplexNumber complexNumberA, ComplexNumber complexNumberB)`

To divide a complex number by another, the real part of the quotient is defined as (ac + bd) / (a ^ 2 + b ^ 2), and the imaginary part is (ad - cb)𝑖 / (a ^ 2 + b ^ 2).

In this syntax, a is the first number's real part, b is the first number's complex part, c is the second number's real part, and b is the second number's complex part.

* **Parameters:**
    * `complexNumberA` — the first number to divide
    * `complexNumberB` — the second number to divide

      <p>
* **Returns:** c the quotient of a and b

## `public static ComplexNumber square(ComplexNumber complexNumber)`

Squaring a complex number is the same as multiplying it by itself, so writing another function is not necessary.

* **Parameters:** `complexNumber` — the number to get squared

    <p>
* **Returns:** c the complexNumber squared

## `private float realNumber`

The real part of a complex number.

## `private float imaginaryNumber`

The imaginary part of a complex number.

## `public ComplexNumber(float realNumber, float imaginaryNumber)`

Creates an instance of a complex number with its real and imaginary parts defined.

* **Parameters:**
    * `realNumber` — the real part of the complex number
    * `imaginaryNumber` — the imaginary part of the complex number

## `public float getRealNumber()`

Returns the the real part of the complex number

* **Returns:** realNumber the real part of the complex number

## `public void setRealNumber(float realNumber)`

Sets the the real part of the complex number

* **Parameters:** `realNumber` — the real part of the complex number

## `public float getImaginaryNumber()`

Returns the the imaginary part of the complex number

* **Returns:** imaginaryNumber the imaginary part of the complex number

## `public void setImaginaryNumber(float imaginaryNumber)`

Sets the the imaginary part of the complex number

* **Parameters:** `imaginaryNumber` — the imaginary part of the complex number

## `@Override public String toString()`

Complex numbers are written as a + b𝑖

* **Returns:** string the standard form of the complex number

## `public void add(ComplexNumber complexNumber)`

Adds this and complexNumber using the static method in ComplexNumber

* **Parameters:** `complexNumber` — the number to add

## `public void subtract(ComplexNumber complexNumber)`

Subtracts this and complexNumber using the static method in ComplexNumber

* **Parameters:** `complexNumber` — the number to subtract

## `public void multiply(ComplexNumber complexNumber)`

Multiplies this and complexNumber using the static method in ComplexNumber

* **Parameters:** `complexNumber` — the number to multiply

## `public void divide(ComplexNumber complexNumber)`

Divides this and complexNumber using the static method in ComplexNumber

* **Parameters:** `complexNumber` — the number to divide

## `public void square()`

Squares this using the static method in ComplexNumber

## `public boolean equals(ComplexNumber complexNumber)`

Checks if complexNumber is equal to this

* **Parameters:** `complexNumber` — the number to check equality against this
* **Returns:** boolean true if complexNumber === this