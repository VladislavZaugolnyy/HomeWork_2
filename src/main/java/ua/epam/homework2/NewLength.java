package ua.epam.homework2;

public class NewLength {
    public int getNewLength(int[] array, int number) {
        int index = 0;
        int newLength = array.length;
        while (index < newLength) {
            if (array[index] == number) {
                array[index] = array[newLength - 1];
                newLength--;
            } else {
                index++;
            }
        }
        return newLength;
    }
}
