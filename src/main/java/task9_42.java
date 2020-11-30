package main.java;

import main.java.utile.CliUtils;

public class task9_42 {
    public static void main(String[] args) {
        System.out.println("Введите строку нижу: ");
        String inputString = CliUtils.writeString();
        String reversedString = getReverseString(inputString);
        System.out.printf("Первернутая строка: %s%n", reversedString);
    }

    public static String getReverseString(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
