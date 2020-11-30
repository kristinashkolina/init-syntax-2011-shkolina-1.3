package main.java;

import main.java.utile.CliUtils;

public class task10_45 {
    public static void main(String[] args) {
        System.out.println("Введите ниже первый элемент, разность и номер искомого элемента арфиметической прогрессии: ");
        Integer firstElement = CliUtils.writeInteger();
        Integer difference = CliUtils.writeInteger();
        Integer number = CliUtils.writeInteger();
        if (firstElement != null && difference != null && number != null) {
            int resultElement = getProgressionElements(firstElement, difference, number);
            System.out.printf("Искомый элемент: %d%n", resultElement);
        }
        System.out.println("Введите ниже первый элемент, разность и количество элементов для суммы арифметической прогрессии: ");
        firstElement = CliUtils.writeInteger();
        difference = CliUtils.writeInteger();
        number = CliUtils.writeInteger();
        if (firstElement != null && difference != null && number != null) {
            int resultElement = getProgressionSum(firstElement, difference, number);
            System.out.printf("Сумма %d элементов: %d%n", number, resultElement);
        }
    }

    public static int getProgressionElements(int firstElement, int difference, int number) {
        if (number == 1) {
            return firstElement;
        } else if (number < 0) {
            throw new IllegalArgumentException("Неверно задан номер искомого элемента!");
        }
        int element = firstElement + difference;
        return getProgressionElements(element, difference, number - 1);
    }

    public static int getProgressionSum(int firstElement, int difference, int count) {
        return getProgressionSum(firstElement, difference, count, 0);
    }

    private static int getProgressionSum(int firstElement, int difference, int count, int sum) {
        if (count == 0) {
            return sum;
        } else if (count < 0) {
            throw new IllegalArgumentException("Неверно задан количество элементов!");
        }
        sum += firstElement;
        return getProgressionSum(firstElement + difference, difference, count - 1, sum);
    }

}
