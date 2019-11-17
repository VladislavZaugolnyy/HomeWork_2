import org.junit.Test;

import static org.junit.Assert.*;

public class NewLengthTest {
    int[] array = {-1, -2, -1, -2, -1, 1, 5, 5, 6};
    int target = -1;

    @Test
    public void shouldReturnNewLength(){
        assertEquals(6, NewLength.getNewLength(array, target));
    }
}
