package main.java;

import main.java.utile.CliUtils;

public class task10_46 {
    public static void main(String[] args) {
        System.out.println("Введите ниже первый элемент, разность и номер искомого элемента геометрической прогрессии: ");
        Integer firstElement = CliUtils.writeInteger();
        Integer denominator = CliUtils.writeInteger();
        Integer number = CliUtils.writeInteger();
        if (firstElement != null && denominator != null && number != null) {
            int resultElement = getProgressionElements(firstElement, denominator, number);
            System.out.printf("Искомый элемент: %d%n", resultElement);
        }
        System.out.println("Введите ниже первый элемент, разность и количество элементов для суммы геометрической прогрессии: ");
        firstElement = CliUtils.writeInteger();
        denominator = CliUtils.writeInteger();
        number = CliUtils.writeInteger();
        if (firstElement != null && denominator != null && number != null) {
            int resultElement = getProgressionSum(firstElement, denominator, number);
            System.out.printf("Сумма %d элементов: %d%n", number, resultElement);
        }
    }

    public static int getProgressionElements(int firstElement, int denominator, int number) {
        if (number == 1) {
            return firstElement;
        } else if (number < 0) {
            throw new IllegalArgumentException("Неверно задан номер искомого элемента!");
        }
        int element = firstElement * denominator;
        return getProgressionElements(element, denominator, number - 1);
    }

    public static int getProgressionSum(int firstElement, int difference, int count) {
        return getProgressionSum(firstElement, difference, count, 0);
    }

    private static int getProgressionSum(int firstElement, int denominator, int count, int sum) {
        if (count == 0) {
            return sum;
        } else if (count < 0) {
            throw new IllegalArgumentException("Неверно задан количество элементов!");
        }
        sum += firstElement;
        return getProgressionSum(firstElement * denominator, denominator, count - 1, sum);
    }

}
