package ua.epam.homework2;

public class Duplicates {
    public boolean hasDuplicates(int[] array) {
        boolean hasDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    hasDuplicates = true;
                    return hasDuplicates;
                } else {
                    hasDuplicates = false;
                }
            }
        }
        return hasDuplicates;
    }
}
