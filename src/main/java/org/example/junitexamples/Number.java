package org.example.junitexamples;

import java.io.Serializable;

/**
 * A class which represents an {@link Integer}.
 * This number can be:
 *
 * <ul>
 *     <li>added</li>
 *     <li>subtracted</li>
 *     <li>multiplied</li>
 *     <li>divided</li>
 * </ul>
 *
 * @author macdrien
 */
public class Number implements Serializable {

    /** The value of the {@link Number}. */
    private Integer number;

    /** (constructor)
     * Default constructor.
     *
     * It initialize the to null. Its value will be tested in the methods.
     *
     * @return The created instance of {@link Number}.
     */
    public Number() { number = null; }

    /** (constructor)
     * It initialize the number field with the given value.
     *
     * @param number The number to set.
     * @return The created instance of {@link Number}.
     */
    public Number(Integer number) {
        this.number = number;
    }

    /**
     * @return The value number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Set the given number into the field number.
     *
     * @param number The number to set.
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /** @see java.lang.Object#toString() */
    @Override
    public String toString() {
        return "Number{number=" + number + '}';
    }
}
