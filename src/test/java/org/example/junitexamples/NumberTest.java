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

    @Test
    void testMultiply() {
    }

    @Test
    void testDivide() {
    }

    @Test
    void testGetNumber() {
    }

    @Test
    void testSetNumber() {
    }

    @Test
    void testToString() {
    }
}