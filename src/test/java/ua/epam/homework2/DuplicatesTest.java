package ua.epam.homework2;

import org.junit.Test;
import ua.epam.homework2.Duplicates;

import static org.junit.Assert.*;

public class DuplicatesTest {
    Duplicates duplicates = new Duplicates();
    int[] arrayWithoutDuplicates = {1, 2, 3, 4, 5};
    int[] arrayWithDuplicates = {1, 2, 3, 4, 5, 1};

    @Test
    public void shouldReturnTrueIfArrayContainsDuplicates() {
        assertTrue(duplicates.hasDuplicates(arrayWithDuplicates));
    }
    @Test
    public void shouldReturnFalseIfArrayDoesNotContainDuplicates() {
        assertFalse(duplicates.hasDuplicates(arrayWithoutDuplicates));
    }
}
