package main.java;

import main.java.utile.CliUtils;

public class task10_41 {
    public static void main(String[] args) {
        System.out.println("Введите число, для которого необходимо найти факториал: ");
        Integer printedNumber = CliUtils.writeInteger();
        if (printedNumber != null) {
            System.out.printf("Факториал введенного числа: %d%n", getFactorial(printedNumber));
        }
    }

    public static int getFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
