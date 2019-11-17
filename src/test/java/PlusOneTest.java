import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {
    int[] array = {1, 2, 3};
    int[] uniqueCaseArray = {9, 9, 9};

    @Test
    public void shouldAdd1ToArrayThatRepresentsANumber() {
        assertArrayEquals(new int[]{1, 2, 4}, PlusOne.plusOne(array));
    }
    @Test
    public void uniqueCaseTest(){
        assertArrayEquals(new int []{1,0,0,0}, PlusOne.plusOne(uniqueCaseArray));
    }
}
