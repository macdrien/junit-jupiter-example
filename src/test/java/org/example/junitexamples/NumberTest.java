package org.example.junitexamples;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link Number}
 *
 * @author macdrien.
 */
class NumberTest {

    private static Number origin;
    private static Number second;
    private static Number expect;

    /** Initialize the three {@link Number} which will be used */
    @BeforeAll
    static void init() {
        origin = new Number();
        second = new Number();
        expect = new Number();
    }

    /** Setup Number for the next test */
    @BeforeEach
    void setup() {
        origin.setNumber(6);
        second.setNumber(2);
    }

    /** Unit test for {@link Number#add(Number)} */
    @Test
    void testAddWhichHasToSuccess() {
        expect = new Number(8);
        assertEquals(expect, origin.add(second));
    }

    /** Unit test for {@link Number#add(Number)} */
    @Test
    void testAddWithNullNumberInBaseObject() {
        origin.setNumber(null);
        expect = new Number(2);
        assertEquals(expect, origin.add(second));
    }

    /** Unit test for {@link Number#add(Number)} */
    @Test
    void testAddWithNullNumberInToAdd() {
        second.setNumber(null);
        expect.setNumber(6);
        assertEquals(expect, origin.add(second));
    }

    /** Unit test for {@link Number#add(Number)} */
    @Test
    void testAddWithNullArgument() {
        assertThrows(IllegalArgumentException.class,
                () -> origin.add(null));
    }

    /** Unit test for {@link Number#subtract(Number)} */
    @Test
    void testSubtractWhichHasToSuccess() {
        expect.setNumber(4);
        assertEquals(expect, origin.subtract(second));
    }

    /** Unit test for {@link Number#subtract(Number)} */
    @Test
    void testSubtractWithNullNumberInBaseObject() {
        origin.setNumber(null);
        expect.setNumber(-2);
        assertEquals(expect, origin.subtract(second));
    }

    /** Unit test for {@link Number#subtract(Number)} */
    @Test
    void testSubtractWithNullNumberInToSubtract() {
        second.setNumber(null);
        expect = new Number(6);
        assertEquals(expect, origin.subtract(second));
    }

    /** Unit test for {@link Number#subtract(Number)} */
    @Test
    void testSubtractWithNullArgument() {
        assertThrows(IllegalArgumentException.class,
                () -> origin.subtract(null));
    }

    /** Unit test of {@link org.example.junitexamples.Number#multiply(org.example.junitexamples.Number)} */
    @Test
    void testMultiplyWhichHasToSuccess() {
        expect.setNumber(12);
        assertEquals(expect, origin.multiply(second));
    }

    /** Unit test of {@link org.example.junitexamples.Number#multiply(org.example.junitexamples.Number)} */
    @Test
    void testMultiplyWithNullNumberInBaseObject() {
        origin.setNumber(null);
        expect.setNumber(2);
        assertEquals(expect, origin.multiply(second));
    }

    /** Unit test of {@link org.example.junitexamples.Number#multiply(org.example.junitexamples.Number)} */
    @Test
    void testMultiplyWithNullNumberInGivenObject() {
        second.setNumber(null);
        expect.setNumber(6);
        assertEquals(expect, origin.multiply(second));
    }

    /** Unit test of {@link org.example.junitexamples.Number#multiply(org.example.junitexamples.Number)} */
    @Test
    void testMultiplyWithNullArgument() {
        assertThrows(IllegalArgumentException.class,
                () -> origin.multiply(null));
    }

    /** Unit test of {@link org.example.junitexamples.Number#divide(org.example.junitexamples.Number)} */
    @Test
    void testDivideWhichHasToSuccess() {
        expect.setNumber(3);
        assertEquals(expect, origin.divide(second));
    }

    /** Unit test of {@link org.example.junitexamples.Number#divide(org.example.junitexamples.Number)} */
    @Test
    void testDivideWithNullNumberInBaseObject() {
        origin.setNumber(null);
        expect.setNumber(1);
        assertEquals(expect, origin.divide(second));
    }

    /** Unit test of {@link org.example.junitexamples.Number#divide(org.example.junitexamples.Number)} */
    @Test
    void testDivideWithNullNumberInTheGivenObject() {
        second.setNumber(null);
        expect.setNumber(6);
        assertEquals(expect, origin.divide(second));
    }

    /** Unit test of {@link org.example.junitexamples.Number#divide(org.example.junitexamples.Number)} */
    @Test
    void testDivideWithNullArgument() {
        assertThrows(IllegalArgumentException.class,
                () -> origin.divide(null));
    }

    /** Unit test of {@link org.example.junitexamples.Number#divide(org.example.junitexamples.Number)} */
    @Test
    void testDivideWithDividerAt0() {
        second.setNumber(0);
        assertThrows(IllegalArgumentException.class,
                () -> origin.divide(second));
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
        origin.setNumber(integer);
        assertEquals(integer, origin.getNumber());
    }
}