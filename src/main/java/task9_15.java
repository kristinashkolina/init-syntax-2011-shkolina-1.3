package main.java;

import main.java.utile.CliUtils;

public class task9_15 {
    public static void main(String[] args) {
        System.out.println("Введите строку ниже: ");
        String inputString = CliUtils.writeString();
        System.out.println("Введите индекс выводимого символа: ");
        Integer numberOfSymbol = CliUtils.writeInteger();
        if (inputString == null || numberOfSymbol == null) {
            System.out.println("Неправильный ввод данных!");
            return;
        }
        char symbol = getSymbolFromString(inputString, numberOfSymbol);
        System.out.printf("Символ по веведенному индексу: %s%n", symbol);
    }

    public static char getSymbolFromString(String inputString, int number) {
        return inputString.toCharArray()[number];
    }

}
