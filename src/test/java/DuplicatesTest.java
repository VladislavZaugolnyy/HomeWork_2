import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicatesTest {
    int[] arrayWithoutDuplicates = {1, 2, 3, 4, 5};
    int[] arrayWithDuplicates = {1, 2, 3, 4, 5, 1};

    @Test
    public void shouldReturnTrueIfArrayContainsDuplicates() {
        assertTrue(Duplicates.hasDuplicates(arrayWithDuplicates));
    }
    @Test
    public void shouldReturnFalseIfArrayDoesNotContainDuplicates() {
        assertFalse(Duplicates.hasDuplicates(arrayWithoutDuplicates));
    }
}
