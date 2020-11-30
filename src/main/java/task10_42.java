package main.java;

import main.java.utile.CliUtils;

public class task10_42 {
    public static void main(String[] args) {
        System.out.println("Введите число и степень, в которую необходимо его возвести, поочередно: ");
        Double printedNumber = CliUtils.writeDouble();
        Integer degreeNumber = CliUtils.writeInteger();
        if (printedNumber != null && degreeNumber != null) {
            System.out.printf("Результат: %s%n", pow(printedNumber, degreeNumber));
        }

    }

    public static double pow(double number, int n) {
        if (n == 0 || n == 1) {
            return number;
        }
        return number * pow(number, n - 1);
    }
}
