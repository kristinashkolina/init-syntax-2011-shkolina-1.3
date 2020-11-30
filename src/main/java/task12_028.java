package main.java;

import main.java.utile.CliUtils;

public class task12_028 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массивов: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            System.out.println(CliUtils.printMatrix(createArray(inputNumber)));
        }
    }

    public static int[][] createArray(int length) {
        int[][] outputArray = new int[length][length];

        int k = 1;
        int i = 0;
        int j = 0;

        int iBefore = 0;
        int iAfter = 0;
        int jBefore = 0;
        int jAfter = 0;

        while (k <= length * length) {
            outputArray[i][j] = k;
            if (i == iBefore && j < length - jAfter - 1) {
                j++;
            } else if (j == length - jAfter - 1 && i < length - iAfter - 1) {
                i++;
            } else if (i == length - iAfter - 1 && j > jBefore) {
                j--;
            } else {
                i--;
            }

            if (i == iBefore + 1 && j == jBefore && jBefore != length - jAfter - 1) {
                iBefore++;
                iAfter++;
                jBefore++;
                jAfter++;
            }
            k++;
        }
        return outputArray;
    }
}
