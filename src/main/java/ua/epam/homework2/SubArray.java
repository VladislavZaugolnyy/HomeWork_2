package ua.epam.homework2;

public class SubArray {
    public int getMinValueNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public int getMaxValueNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public int getSubArrayWithMaxSum(int[] array) {
        int result = 0;
        if (getMaxValueNumber(array) >= 0) {
            int maxSumSoFar = 0;
            int maxEndingHere = 0;

            for (int i = 0; i < array.length; i++) {
                maxEndingHere += array[i];
                if (maxSumSoFar < maxEndingHere) {
                    maxSumSoFar = maxEndingHere;
                } else if (maxEndingHere < 0) {
                    maxEndingHere = 0;
                }
            }
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            if (sum == maxSumSoFar) {
                result = sum - getMinValueNumber(array);
                return result;
            } else {
                result = maxSumSoFar;
                return result;
            }
        } else if (getMaxValueNumber(array) < 0) {
            result = getMaxValueNumber(array);
            return result;
        }
        return result;
    }
}
