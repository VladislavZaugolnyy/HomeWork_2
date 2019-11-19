import org.junit.Test;
import ua.epam.homework2.SubArray;

import static org.junit.Assert.*;

public class SubArrayTest {
    SubArray subArray = new SubArray();
    int[] array = {1, 2, 3, 4, 5};

    @Test
    public void shouldReturnSubbarrayWithBiggestSum (){
        assertEquals(14, subArray.getSubArrayWithMaxSum(array));
    }
}
