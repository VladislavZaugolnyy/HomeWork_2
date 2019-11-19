package ua.epam.homework2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoIntsTest {
    TwoInts twoInts = new TwoInts();
    int[] array = {1, 2, 3, 4};
    int target = 5;

    @Test
    public void shouldReturnIndexesOfIntsSumOfWichEqualsTargetInt() {
        assertArrayEquals(new int[]{1, 2}, twoInts.getIndexes(array, target));
    }
}
