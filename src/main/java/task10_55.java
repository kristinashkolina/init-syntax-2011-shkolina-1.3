package main.java;

import main.java.utile.CliUtils;

public class task10_55 {
    private static final char[] SYMBOLS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void main(String[] args) {
        System.out.println("Введите натуральное число и систему счисления: ");
        Integer number = CliUtils.writeInteger();
        Integer radix = CliUtils.writeInteger();
        if (number != null && radix != null) {
            System.out.printf("Результат: %s%n", convertDecimalToAnother(number, radix));
        }
    }

    public static String convertDecimalToAnother(int number, int radix) {
        if (number < 0 || radix < 2 || radix > 16) {
            return "Неправильно введено число либо система счисления!";
        } else {
            return convertDecimalToAnother(number, radix, "");
        }
    }

    private static String convertDecimalToAnother(int number, int radix, String outputString) {
        if (number < 1) {
            StringBuilder stringBuilder = new StringBuilder(outputString);
            return stringBuilder.reverse().toString();
        }
        int digit = number % radix;
        outputString += SYMBOLS[digit];
        return convertDecimalToAnother(number / radix, radix, outputString);
    }
}
