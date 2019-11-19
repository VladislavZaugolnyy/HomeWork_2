package ua.epam.homework2;

public class PlusOne {
    public int[] plusOne(int[] array) {
        for (int i = array.length - 1; i > -1; i--) {
            if (array[i] != 9) {
                array[i] += 1;
                return array;
            } else if (array[i] == 9) {
                array[i] = 0;
                if (i == 0) {
                    int[] newArray = new int[array.length + 1];
                    newArray[0] = 1;
                    return newArray;
                }
            }
        }
        return array;
    }
}
