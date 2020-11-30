package main.java;

import main.java.utile.CliUtils;

public class task10_50 {
    public static void main(String[] args) {
        System.out.println("Введите числа n и m для вычисления функции Аккермана: ");
        Integer numberN = CliUtils.writeInteger();
        Integer numberM = CliUtils.writeInteger();
        if (numberM != null && numberN != null) {
            System.out.printf("Результат: %s%n", findAckermannFunction(numberN, numberM));
        }
    }

    public static int findAckermannFunction(int n, int m) {
        if (n == 0) {
            return m + 1;
        } else if (m == 0) {
            return findAckermannFunction(n - 1, 1);
        } else if (n > 0 && m > 0) {
            return findAckermannFunction(n - 1, findAckermannFunction(n, m - 1));
        }
        return -1;
    }

}
