package ua.epam.homework2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {
    PlusOne plusOne = new PlusOne();
    int[] array = {1, 2, 3};
    int[] uniqueCaseArray = {9, 9, 9};

    @Test
    public void shouldAdd1ToArrayThatRepresentsANumber() {
        assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(array));
    }

    @Test
    public void uniqueCaseTest() {
        assertArrayEquals(new int[]{1, 0, 0, 0}, plusOne.plusOne(uniqueCaseArray));
    }
}
