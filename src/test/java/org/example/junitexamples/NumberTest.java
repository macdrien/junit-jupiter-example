package org.example.junitexamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link Number}
 *
 * @author macdrien.
 */
class NumberTest {

    /** Unit test for {@link Number#add(Number)} */
    @Test
    void testAddWhichHasToSuccess() {
        Number origin = new Number(5),
                toAdd = new Number(4),
               expect = new Number(9);

        assertEquals(expect, origin.add(toAdd));
    }

    /** Unit test for {@link Number#add(Number)} */
    @Test
    void testAddWithNullNumberInBaseObject() {
        Number origin = new Number(),
                toAdd = new Number(4),
                expect = new Number(4);

        assertEquals(expect, origin.add(toAdd));
    }

    /** Unit test for {@link Number#add(Number)} */
    @Test
    void testAddWithNullNumberInToAdd() {
        Number origin = new Number(5),
                toAdd = new Number(),
                expect = new Number(5);

        assertEquals(expect, origin.add(toAdd));
    }

    /** Unit test for {@link Number#add(Number)} */
    @Test
    void testAddWithNullArgument() {
        Number origin = new Number(5);

        assertThrows(IllegalArgumentException.class,
                () -> origin.add(null));
    }

    /** Unit test for {@link Number#subtract(Number)} */
    @Test
    void testSubtractWhichHasToSuccess() {
        Number origin = new Number(5),
                toSubtract = new Number(4),
                expect = new Number(1);

        assertEquals(expect, origin.subtract(toSubtract));
    }

    /** Unit test for {@link Number#subtract(Number)} */
    @Test
    void testSubtractWithNullNumberInBaseObject() {
        Number origin = new Number(),
                toSubtract = new Number(4),
                expect = new Number(-4);

        assertEquals(expect, origin.subtract(toSubtract));
    }

    /** Unit test for {@link Number#subtract(Number)} */
    @Test
    void testSubtractWithNullNumberInToSubtract() {
        Number origin = new Number(5),
                toSubtract = new Number(),
                expect = new Number(5);

        assertEquals(expect, origin.subtract(toSubtract));
    }

    /** Unit test for {@link Number#subtract(Number)} */
    @Test
    void testSubtractWithNullArgument() {
        Number origin = new Number(5);

        assertThrows(IllegalArgumentException.class,
                () -> origin.subtract(null));
    }

    /** Unit test of {@link org.example.junitexamples.Number#multiply(org.example.junitexamples.Number)} */
    @Test
    void testMultiplyWhichHasToSuccess() {
        Number origin = new Number(2),
                toMultiply = new Number(5),
                expect = new Number(10);

        assertEquals(expect, origin.multiply(toMultiply));
    }

    /** Unit test of {@link org.example.junitexamples.Number#multiply(org.example.junitexamples.Number)} */
    @Test
    void testMultiplyWithNullNumberInBaseObject() {
        Number origin = new Number(),
                toMultiply = new Number(5),
                expect = new Number(5);

        assertEquals(expect, origin.multiply(toMultiply));
    }

    /** Unit test of {@link org.example.junitexamples.Number#multiply(org.example.junitexamples.Number)} */
    @Test
    void testMultiplyWithNullNumberInGivenObject() {
        Number origin = new Number(5),
                toMultiply = new Number(),
                expect = new Number(5);

        assertEquals(expect, origin.multiply(toMultiply));
    }

    /** Unit test of {@link org.example.junitexamples.Number#multiply(org.example.junitexamples.Number)} */
    @Test
    void testMultiplyWithNullArgument() {
        Number origin = new Number(5);

        assertThrows(IllegalArgumentException.class,
                () -> origin.multiply(null));
    }

    /** Unit test of {@link org.example.junitexamples.Number#divide(org.example.junitexamples.Number)} */
    @Test
    void testDivideWhichHasToSuccess() {
        Number origin = new Number(6),
                divider = new Number(2),
                expect = new Number(3);

        assertEquals(expect, origin.divide(divider));
    }

    /** Unit test of {@link org.example.junitexamples.Number#divide(org.example.junitexamples.Number)} */
    @Test
    void testDivideWithNullNumberInBaseObject() {
        Number origin = new Number(),
                divider = new Number(2),
                expect = new Number(1);

        assertEquals(expect, origin.divide(divider));
    }

    /** Unit test of {@link org.example.junitexamples.Number#divide(org.example.junitexamples.Number)} */
    @Test
    void testDivideWithNullNumberInTheGivenObject() {
        Number origin = new Number(6),
                divider = new Number(),
                expect = new Number(6);

        assertEquals(expect, origin.divide(divider));
    }

    /** Unit test of {@link org.example.junitexamples.Number#divide(org.example.junitexamples.Number)} */
    @Test
    void testDivideWithNullArgument() {
        Number origin = new Number(6);

        assertThrows(IllegalArgumentException.class,
                () -> origin.divide(null));
    }

    /** Unit test of {@link org.example.junitexamples.Number#divide(org.example.junitexamples.Number)} */
    @Test
    void testDivideWithDividerAt0() {
        Number origin = new Number(6),
                divider = new Number(0);

        assertThrows(IllegalArgumentException.class,
                () -> origin.divide(divider));
    }

    @Test
    void testGetNumber() {
        Integer integer = 1;
        Number number = new Number(integer);
        assertEquals(integer, number.getNumber());
    }

    @Test
    void testSetNumber() {
        Integer integer = 1;
        Number number = new Number();
        number.setNumber(integer);
        assertEquals(integer, number.getNumber());
    }
}