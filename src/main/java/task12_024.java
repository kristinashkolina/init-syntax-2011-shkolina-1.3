package main.java;

import main.java.utile.CliUtils;

public class task12_024 {
    public static void main(String[] args) {
        System.out.println("Введите размеры массивов: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            System.out.println(CliUtils.printMatrix(createFirstArray(inputNumber)));
            System.out.println(CliUtils.printMatrix(createSecondArray(inputNumber)));
        }
    }

    public static int[][] createFirstArray(int length) {
        int[][] outputArray = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || j == 0) {
                    outputArray[i][j] = 1;
                } else {
                    outputArray[i][j] = outputArray[i - 1][j] + outputArray[i][j - 1];
                }
            }
        }
        return outputArray;
    }

    public static int[][] createSecondArray(int length) {
        int[][] outputArray = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i + j < length) {
                    outputArray[i][j] = i + j + 1;
                } else {
                    outputArray[i][j] = i + j + 1 - length;
                }
            }
        }
        return outputArray;
    }
}
