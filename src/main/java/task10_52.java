package main.java;

import main.java.utile.CliUtils;

import static main.java.task10_43.getCountNumbers;

public class task10_52 {
    public static void main(String[] args) {
        System.out.println("Введите ниже число, которое необходимо перевернуть: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            Integer[] outputArray = CliUtils.intArrayToInteger(printReversedNumber(inputNumber));
            System.out.printf("Переврнутое число: %s", CliUtils.printArray(outputArray));
        }

    }

    public static int[] printReversedNumber(int number) {
        int count = getCountNumbers(number);
        int[] array = new int[count];
        return printReversedNumber(number, array, 0);
    }

    private static int[] printReversedNumber(int number, int[] array, int n) {
        if (n > array.length - 1) {
            return array;
        } else {
            array[n] = number % 10;
            return printReversedNumber(number / 10, array, n + 1);
        }
    }
}
