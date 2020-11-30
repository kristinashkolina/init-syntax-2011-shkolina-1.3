package main.java;

import main.java.utile.CliUtils;

import java.util.Random;

public class task10_49 {
    public static void main(String[] args) {
        System.out.println("Введите ниже количество генерируемых элементов: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            Random random = new Random();
            Integer[] inputArray = new Integer[inputNumber];
            for (int i = 0; i < inputArray.length; i++) {
                inputArray[i] = random.nextInt(100) + 1;
            }
            System.out.println(CliUtils.printArray(inputArray));
            System.out.println("Индекс максимального элемента массива: " + findIndexElement(inputArray));
        }
    }

    public static int findIndexElement(Integer[] array) {
        return findIndexElement(array, array.length - 1, Integer.MIN_VALUE, 0);
    }

    private static int findIndexElement(Integer[] array, int n, int max, int maxIndex) {
        if (n == 0) {
            return maxIndex;
        }
        if (array[n] > max) {
            max = array[n];
            maxIndex = n;
        }
        return findIndexElement(array, n - 1, max, maxIndex);
    }
}
