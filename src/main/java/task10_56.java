package main.java;

import main.java.utile.CliUtils;

public class task10_56 {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число для проверки: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            System.out.printf("Является ли число простым: %s%n", checkPrime(inputNumber));
        }
    }

    public static boolean checkPrime(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Число должно быть больше нуля!");
        }
        return checkPrime(number, number - 1);
    }

    private static boolean checkPrime(int number, int beforeNumber) {
        if (beforeNumber < 2) {
            return true;
        } else if (number % beforeNumber == 0) {
            return false;
        } else {
            return checkPrime(number, beforeNumber - 1);
        }
    }
}
