package main.java;

import main.java.utile.CliUtils;

public class task10_47 {
    public static void main(String[] args) {
        System.out.println("Введите ниже номер искомого числа фиббоначи: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            System.out.printf("Искомое число фиббоначи: %d", findFibonacciElement(inputNumber));
        }
    }

    public static int findFibonacciElement(int k) {
        return findFibonacciElement(k, 1, 1);
    }

    private static int findFibonacciElement(int k, int firstEl, int secondEl) {
        if (k == 1) {
            return firstEl;
        }
        return findFibonacciElement(k - 1, secondEl, firstEl + secondEl);
    }
}
