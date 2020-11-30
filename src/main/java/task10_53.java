package main.java;

import main.java.utile.CliUtils;

public class task10_53 {
    public static void main(String[] args) {
        System.out.println("Вводите ниже числа (0 - прекратить ввод): ");
        Integer inputNumber;
        int[] inputArray = new int[0];
        do {
            inputNumber = CliUtils.writeInteger();
            if (inputNumber != null && inputNumber != 0) {
                int[] tempArray = new int[inputArray.length + 1];
                tempArray[tempArray.length - 1] = inputNumber;
                System.arraycopy(inputArray, 0, tempArray, 0, inputArray.length);
                inputArray = tempArray.clone();
            } else {
                break;
            }
        } while (true);
        Integer[] outputArray = CliUtils.intArrayToInteger(printReversedArray(inputArray));
        System.out.printf("Первернутая последовательность: %s", CliUtils.printArray(outputArray));
    }

    public static int[] printReversedArray(int[] array) {
        int[] outputArray = array.clone();
        return printReversedArray(array, outputArray, 0);
    }

    private static int[] printReversedArray(int[] array, int[] outputArray, int n) {
        if (n > array.length - 1) {
            return outputArray;
        } else {
            outputArray[array.length - n - 1] = array[n];
            return printReversedArray(array, outputArray, n + 1);
        }
    }
}
