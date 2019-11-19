import org.junit.Test;
import ua.epam.homework2.NewLength;

import static org.junit.Assert.*;

public class NewLengthTest {
    NewLength newLength = new NewLength();
    int[] array = {-1, -2, -1, -2, -1, 1, 5, 5, 6};
    int target = -1;

    @Test
    public void shouldReturnNewLength(){
        assertEquals(6, newLength.getNewLength(array, target));
    }
}
