package main.java;

import main.java.utile.CliUtils;

public class task9_107 {
    public static void main(String[] args) {
        System.out.println("Введите строку ниже для перетсановки: ");
        String inputString = CliUtils.writeString();
        if (inputString != null) {
            String resultString = switchSymbols(inputString);
            System.out.printf("Строка с замененными символами: %s%n", resultString);
        }
    }

    public static String switchSymbols(String inputString) {
        StringBuilder outputString = new StringBuilder(inputString);
        int lastIndexOfO = inputString.lastIndexOf("о");
        int firstIndexOfA = inputString.indexOf("а");
        outputString.deleteCharAt(firstIndexOfA);
        outputString.insert(firstIndexOfA, "о");
        outputString.deleteCharAt(lastIndexOfO);
        outputString.insert(lastIndexOfO, "а");
        return outputString.toString().trim();
    }
}
