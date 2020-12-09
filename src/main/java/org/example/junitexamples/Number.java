package org.example.junitexamples;

import java.io.Serializable;

/**
 * A class which represents an {@link Integer}.<br/>
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
     * Add a given {@link Number} to the current {@link Number}.
     *
     * @param toAdd The number to add. It must be not null.<br/>
     *              If toAdd.number is null, the function will add 0.
     * @return The current instance after the addition.
     * @throws IllegalArgumentException If toAdd is null.
     */
    public Number add(Number toAdd) throws IllegalArgumentException {
        if (this.number == null)
            number = 0;

        if (toAdd == null)
            throw new IllegalArgumentException("Error : The given number has to be not null.");

        this.number += toAdd.getNumber() != null ? toAdd.getNumber() : 0;

        return this;
    }

    /**
     * Subtract a given {@link Number} to the current {@link Number}.
     *
     * @param toSubtract The number to subtract. It must be not null.<br/>
     *              If toSubtract.number is null, the function will subtract 0.
     * @return The current instance after the subtraction.
     * @throws IllegalArgumentException If toSubtract is null.
     */
    public Number subtract(Number toSubtract) throws IllegalArgumentException {
        if (this.number == null)
            number = 0;

        if (toSubtract == null)
            throw new IllegalArgumentException("Error : The given number has to be not null.");

        this.number -= toSubtract.getNumber() != null ? toSubtract.getNumber() : 0;

        return this;
    }

    /**
     * Multiply a given {@link Number} to the current {@link Number}.
     *
     * @param toMultiply The {@link Number} to multiply.<br/>
     *                   If toMultiply.number is null, the function will multiply this.number by 1.
     * @return The current instance after the multiplication.
     * @throws IllegalArgumentException If toMultiply is null.
     */
    public Number multiply(Number toMultiply) throws IllegalArgumentException {
        if (this.number == null)
            number = 1;

        if (toMultiply == null)
            throw new IllegalArgumentException("Error : The given number has to be not null.");

        this.number *= toMultiply.getNumber() != null ? toMultiply.getNumber() : 1;

        return this;
    }

    /**
     * Divide the current {@link Number} by the given one.
     *
     * @param divider The {@link Number} to divide.
     *                If divider.number is null, the function will divide this.number by 1.
     * @return The current instance after the division.
     * @throws IllegalArgumentException If divider is null or if divier.number is equals to 0.
     */
    public Number divide(Number divider) throws IllegalArgumentException {
        if (this.number == null)
            number = 1;

        if (divider == null)
            throw new IllegalArgumentException("Error : The given number has to be not null.");

        if (divider.getNumber() == 0)
            throw new IllegalArgumentException("Error : The given number has to be different from 0.");

        this.number *= divider.getNumber() != null ? divider.getNumber() : 1;

        return this;
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
