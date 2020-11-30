package main.java;

import main.java.utile.CliUtils;

public class task10_43 {
    public static void main(String[] args) {
        System.out.println("Введите ниже натуральное число, для которого необходимо посчитать количество цифр и их сумму: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            System.out.printf("Количество чисел: %d, их сумма: %d", getCountNumbers(inputNumber), getSumNumbers(inputNumber));
        }
    }

    public static int getSumNumbers(int inputNumber) {
        return getSumNumbers(inputNumber, 0);
    }

    public static int getSumNumbers(int inputNumber, int sum) {
        if (inputNumber == 0) {
            return sum;
        }
        sum += inputNumber % 10;
        return getSumNumbers(inputNumber / 10, sum);
    }

    public static int getCountNumbers(int inputNumber) {
        return getCountNumbers(inputNumber, 1);
    }

    public static int getCountNumbers(int inputNumber, int n) {
        double divider = Math.pow(10, n);
        if (inputNumber / divider < 1) {
            return n;
        }
        return getCountNumbers(inputNumber, n + 1);
    }
}
