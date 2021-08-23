package com.aidano7.bison.linearAlgebra;

/**
 * @author aidano-7
 * @since 8/22/2021
 * @version v0.1
 *
 * <p>
 *     This is the class for a 3-dimensional vector. It has
 *     3 components, x, y, and z.
 * </p>
 */

public class Vector3 {

    /**
     * Adds the two given Vectors by adding each of their components.
     *
     * @param vector3A first vector to add
     * @param vector3B second vector to add
     * @return vector3C sum of the two input vectors
     */

    public static Vector3 add(Vector3 vector3A, Vector3 vector3B) {
        Vector3 vector3C = new Vector3(0f, 0f, 0f);

        vector3C.x = vector3A.x + vector3B.x;
        vector3C.y = vector3A.y + vector3B.y;
        vector3C.z = vector3A.z + vector3B.z;

        return vector3C;
    }

    /**
     * Subtracts the two given Vectors by subtracting each of their components.
     *
     * @param vector3A first vector to subtract
     * @param vector3B second vector to subtract
     * @return vector3C difference of the two input vectors
     */

    public static Vector3 subtract(Vector3 vector3A, Vector3 vector3B) {
        Vector3 vector3C = new Vector3(0f, 0f, 0f);

        vector3C.x = vector3A.x - vector3B.x;
        vector3C.y = vector3A.y - vector3B.y;
        vector3C.z = vector3A.z - vector3B.z;

        return vector3C;
    }

    /**
     * Multiplies the two given Vectors by multiplying each of their components.
     *
     * @param vector3A first vector to multiply
     * @param vector3B second vector to multiply
     * @return vector3C product of the two input vectors
     */

    public static Vector3 multiply(Vector3 vector3A, Vector3 vector3B) {
        Vector3 vector3C = new Vector3(0f, 0f, 0f);

        vector3C.x = vector3A.x * vector3B.x;
        vector3C.y = vector3A.y * vector3B.y;
        vector3C.z = vector3A.z * vector3B.z;

        return vector3C;
    }

    /**
     * Divides the two given Vectors by dividing each of their components.
     *
     * @param vector3A first vector to divide
     * @param vector3B second vector to divide
     * @return vector3C quotient of the two input vectors
     */

    public static Vector3 divide(Vector3 vector3A, Vector3 vector3B) {
        Vector3 vector3C = new Vector3(0f, 0f, 0f);

        vector3C.x = vector3A.x / vector3B.x;
        vector3C.y = vector3A.y / vector3B.y;
        vector3C.z = vector3A.z / vector3B.z;

        return vector3C;
    }

    /**
     * Squares the given vector by multiplying it by itself.
     *
     * @param vector3 vector to square
     * @return vector3C square of vector3
     */

    public static Vector3 square(Vector3 vector3) {
        return Vector3.multiply(vector3, vector3);
    }

    /**
     * X component of vector
     */

    private float x;

    /**
     * Y component of vector
     */

    private float y;

    /**
     * Z component of vector
     */

    private float z;

    /**
     * Creates instance of a vector object with given x, y,
     * and z components.
     *
     * @param x X component (1 dimension)
     * @param y Y component (2 dimension)
     * @param z Z component (3 dimension)
     */

    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Returns the X component of the vector.
     *
     * @return x X component
     */

    public float getX() {
        return x;
    }

    /**
     * Sets the new X component of the vector.
     *
     * @param x new X component
     */

    public void setX(float x) {
        this.x = x;
    }

    /**
     * Returns the Y component of the vector.
     *
     * @return y Y component
     */

    public float getY() {
        return y;
    }

    /**
     * Sets the new Y component of the vector.
     *
     * @param y new Y component
     */

    public void setY(float y) {
        this.y = y;
    }

    /**
     * Returns the Z component of the vector.
     *
     * @return z Z component
     */

    public float getZ() {
        return z;
    }

    /**
     * Sets the new Z component of the vector.
     *
     * @param z new Z component
     */

    public void setZ(float z) {
        this.z = z;
    }

    /**
     * Returns the vector as a string in the convention,
     * (x, y, z).
     *
     * @return vector Vector as a string
     */

    @Override
    public String toString() {
        return String.format("(%f, %f, %f)", x, y, z);
    }

    /**
     * Checks if vector3 is equal to this.
     *
     * @param vector3 the vector to check equality against this
     * @return boolean true if vector3 === this
     */

    public boolean equals(Vector3 vector3) {
        return x == vector3.getX() && y == vector3.getY() && z == vector3.getZ();
    }
}
