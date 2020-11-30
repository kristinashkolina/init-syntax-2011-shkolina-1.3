package main.java;

import main.java.utile.CliUtils;

import java.util.Random;

public class task10_48 {
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
            System.out.println("Максимальный элемент массива: " + findMaxElement(inputArray));
        }
    }

    public static int findMaxElement(Integer[] array) {
        return findMaxElement(array, array.length - 1, Integer.MIN_VALUE);
    }

    private static int findMaxElement(Integer[] array, int n, int max) {
        if (n == 0) {
            return max;
        }
        if (array[n] > max) {
            max = array[n];
        }
        return findMaxElement(array, n - 1, max);
    }
}
