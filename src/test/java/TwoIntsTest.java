import org.junit.Test;

import static org.junit.Assert.*;

public class TwoIntsTest {
    int[] array = {1, 2, 3, 4};
    int target = 5;

    @Test
    public void shouldReturnIndexesOfIntsSumOfWichEqualsTargetInt() {
        assertArrayEquals(new int[]{1, 2}, TwoInts.getIndexes(array, target));
    }
}
