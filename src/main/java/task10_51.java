package main.java;

import main.java.utile.CliUtils;

import java.util.ArrayList;
import java.util.List;

public class task10_51 {
    public static void main(String[] args) {
        System.out.println("Введите число n: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            Integer[] outputArrayFirst = CliUtils.intArrayToInteger(CliUtils.arrayListIntegerToArrayInt(firstAlgorithm(inputNumber)));
            Integer[] outputArraySecond = CliUtils.intArrayToInteger(CliUtils.arrayListIntegerToArrayInt(secondAlgorithm(inputNumber)));
            Integer[] outputArrayThird = CliUtils.intArrayToInteger(CliUtils.arrayListIntegerToArrayInt(thirdAlgorithm(inputNumber)));
            System.out.printf("Полученный вывод для первого алгоритма: %s%n", CliUtils.printArray(outputArrayFirst));
            System.out.printf("Полученный вывод для второго алгоритма: %s%n", CliUtils.printArray(outputArraySecond));
            System.out.printf("Полученный вывод для третьего алгоритма: %s%n", CliUtils.printArray(outputArrayThird));
        }
    }

    public static List<Integer> firstAlgorithm(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        return firstAlgorithm(n, array);
    }

    private static List<Integer> firstAlgorithm(int n, List<Integer> array) {
        if (n > 0) {
            array.add(n);
            return firstAlgorithm(n - 1, array);
        }
        return array;
    }

    public static List<Integer> secondAlgorithm(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        return secondAlgorithm(n, array);
    }

    private static List<Integer> secondAlgorithm(int n, List<Integer> array) {
        if (n > 0) {
            secondAlgorithm(n - 1, array);
            array.add(n);
        }
        return array;
    }

    public static List<Integer> thirdAlgorithm(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        return thirdAlgorithm(n, array);
    }

    private static List<Integer> thirdAlgorithm(int n, List<Integer> array) {
        if (n > 0) {
            array.add(n);
            return thirdAlgorithm(n - 1, array);
        }
        array.add(n);
        return array;
    }
}
