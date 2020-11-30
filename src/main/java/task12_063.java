package main.java;

import main.java.utile.CliUtils;

import java.util.Random;

public class task12_063 {
    public static void main(String[] args) {
        System.out.println("Введите максимальное количество учеников: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            Random random = new Random();
            int[][] inputArray = new int[11][4];
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 4; j++) {
                    inputArray[i][j] = random.nextInt(inputNumber) + 10;
                }
            }

            System.out.println("Количество учеников: " + CliUtils.printMatrix(inputArray));
            System.out.println("Среднее количество в каждой параллели: " + CliUtils.printArray(CliUtils.doubleArrayToInteger(getAverageNumberScholars(inputArray))));
        }
    }

    public static double[] getAverageNumberScholars(int[][] scholarsInClasses) {
        double[] averageNumbers = new double[scholarsInClasses.length];
        for (int i = 0; i < scholarsInClasses.length; i++) {
            averageNumbers[i] = getAverageNumber(scholarsInClasses[i]);
        }
        return averageNumbers;
    }

    public static double getAverageNumber(int[] parallel) {
        double sum = 0;
        for (int number : parallel) {
            sum += number;
        }
        return sum / parallel.length;
    }
}
