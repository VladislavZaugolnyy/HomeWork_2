import org.junit.Test;

import static org.junit.Assert.*;

public class SubArrayTest {
    int[] array = {1, 2, 3, 4, 5};

    @Test
    public void shouldReturnSubbarrayWithBiggestSum (){
        assertEquals(14, SubArray.getSubArrayWithMaxSum(array));
    }
}
