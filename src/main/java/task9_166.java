package main.java;

import main.java.utile.CliUtils;

public class task9_166 {
    public static void main(String[] args) {
        System.out.println("Введите строку, в которой нужно поменять первое и пеоследнее слово: ");
        String inputString = CliUtils.writeString();
        if (inputString != null) {
            String resultString = switchWordsInString(inputString);
            System.out.printf("Строка с переставленными словами: %s%n", resultString);
        }
    }

    public static String switchWordsInString(String inputString) {
        String[] words = inputString.split(" ");
        switchWords(words);
        String resultString = getString(words);
        return resultString.trim();
    }

    public static String getString(String[] words) {
        StringBuilder resultString = new StringBuilder();
        for (var word : words) {
            resultString.append(word).append(' ');
        }
        String result = resultString.toString();
        return result.trim();
    }

    public static void switchWords(String[] words) {
        String temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;
    }
}
