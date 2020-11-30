package main.java;

import main.java.utile.CliUtils;

public class task9_17 {
    public static void main(String[] args) {
        System.out.println("Введите строку для проверки: ");
        String inputString = CliUtils.writeString();
        if (inputString != null) {
            System.out.printf("Заканчивается ли строка на один и тот же символ: %s%n", checkFirstAndSecondNumber(inputString));
        }
    }

    public static boolean checkFirstAndSecondNumber(String inputString) {
        char firstElement = inputString.charAt(0);
        char lastElement = inputString.charAt(inputString.length() - 1);
        return firstElement == lastElement;
    }
}
