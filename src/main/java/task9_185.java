package main.java;

import main.java.utile.CliUtils;

import java.util.Deque;
import java.util.LinkedList;

public class task9_185 {
    public static void main(String[] args) {
        System.out.println("Введите математическое выражение, в котором необходимо проверить правильность введённых скобок: ");
        String inputString = CliUtils.writeString();
        if (inputString != null) {
            String resultString = checkStringBrackets(inputString);
            System.out.printf("Является ли выражение правильно введённым: %s%n", resultString);
        }
    }

    public static String checkStringBrackets(String inputString) {

        char[] chars = inputString.toCharArray();
        int numberOfCloseBrackets = 0;
        int numberOfOpenBrackets = 0;
        Deque<Integer> closeBrackets = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                numberOfOpenBrackets++;
            } else if (chars[i] == ')') {
                closeBrackets.push(i);
                numberOfCloseBrackets++;
            }
        }

        if (numberOfCloseBrackets == numberOfOpenBrackets) {
            return "да";
        } else if (numberOfOpenBrackets > numberOfCloseBrackets) {
            return String.format("Имеются лишние открывающие скобки в размере: %d", numberOfOpenBrackets - numberOfCloseBrackets);
        } else {
            int indexOfLastWrongBracket = -1;
            for (int i = 0; i < numberOfOpenBrackets; i++) {
                indexOfLastWrongBracket = closeBrackets.pop();
            }
            return String.format("Имеются лишние закрывающие скобки. Первая на индексе: %d", indexOfLastWrongBracket);
        }
    }

}
