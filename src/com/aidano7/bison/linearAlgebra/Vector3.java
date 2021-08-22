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
     * Default constructor. Sets all components to 0.
     */

    public Vector3() {
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
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
}
