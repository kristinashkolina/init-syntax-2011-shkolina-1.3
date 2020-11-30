package main.java;

import main.java.utile.CliUtils;

public class task9_22 {
    public static void main(String[] args) {
        System.out.println("Введите строку ниже: ");
        String inputString = CliUtils.writeString();
        if (inputString != null) {
            System.out.printf("Первая половина строки: %s%n", getHalfString(inputString));
        }
    }

    public static String getHalfString(String inputString) {
        if (inputString.length() % 2 == 0) {
            int midIndex = inputString.length() / 2;
            return inputString.substring(0, midIndex);
        } else {
            return "Строка имеет нечетное количество символов";
        }
    }
}
