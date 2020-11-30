package main.java;

import main.java.utile.CliUtils;

import java.util.Random;

public class task12_234 {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы: ");
        Integer inputNumber = CliUtils.writeInteger();
        System.out.println("Введите индекс строки и столбца для удаления: ");
        Integer k = CliUtils.writeInteger();
        if (inputNumber != null && k != null) {
            Random random = new Random();
            int[][] inputArray = new int[inputNumber][inputNumber];
            for (int i = 0; i < inputArray.length; i++) {
                for (int j = 0; j < inputArray[i].length; j++) {
                    inputArray[i][j] = random.nextInt(30) + 10;
                }
            }
            System.out.println(CliUtils.printMatrix(inputArray));
            String deletedRowOutput = CliUtils.printMatrix(removeRow(inputArray, k));
            String deletedColumnOutput = CliUtils.printMatrix(removeColumn(inputArray, k));
            System.out.printf("Массив с удаленной строкой: %s%n", deletedRowOutput);
            System.out.printf("Массив с удаленным столбцом: %s%n", deletedColumnOutput);
        }
    }

    public static int[][] removeRow(int[][] inputArray, int k) {
        int[][] outputArray = new int[inputArray.length - 1][inputArray[0].length];
        for (int i = 0; i < inputArray.length; i++) {
            if (i < k) {
                System.arraycopy(inputArray[i], 0, outputArray[i], 0, inputArray[i].length);
            } else if (i > k) {
                System.arraycopy(inputArray[i], 0, outputArray[i - 1], 0, inputArray[i].length);
            }
        }
        return outputArray;
    }

    public static int[][] removeColumn(int[][] inputArray, int s) {
        int[][] outputArray = new int[inputArray.length][inputArray[0].length - 1];
        for (int i = 0; i < inputArray.length; i++) {
            int[] tempArray = task11_158.deleteElementArray(inputArray[i], s);
            System.arraycopy(tempArray, 0, outputArray[i], 0, inputArray[0].length - 1);
        }
        return outputArray;
    }
}
