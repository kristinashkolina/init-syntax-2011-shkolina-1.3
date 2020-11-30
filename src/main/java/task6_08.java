package main.java;

import main.java.util.CliUtils;

import java.util.ArrayList;
import java.util.List;

public class task6_08 {
    public static void main(String[] args) {
        System.out.println("Введите число, выше которого квадраты не будут выводиться: ");
        Integer printedNumber = CliUtils.writeInteger();
        if (printedNumber != null) {
            List<Integer> squareNumbers = getSquareNumbers(printedNumber);
            System.out.printf("Массив квадратов символов до числа %d: %s%n", printedNumber, squareNumbers);
        }
    }

    public static List<Integer> getSquareNumbers(int maxNumber) {
        ArrayList<Integer> squareNumbers = new ArrayList<>();
        for (int i = 1; i * i < maxNumber; i++) {
            squareNumbers.add(i * i);
        }
        return squareNumbers;
    }
}
