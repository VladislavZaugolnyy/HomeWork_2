package ua.epam.homework2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewLengthTest {
    NewLength newLength = new NewLength();
    int[] array = {-1, -2, -1, -2, -1, 1, 5, 5, 6};
    int target = -1;

    @Test
    public void shouldReturnNewLength() {
        assertEquals(6, newLength.getNewLength(array, target));
    }
}
