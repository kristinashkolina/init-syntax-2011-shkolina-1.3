package main.java;

import main.java.utile.CliUtils;

public class task12_023 {
    public static void main(String[] args) {
        System.out.println("Введите номер выводимого массива (от 1 до 3)");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            switch (inputNumber) {
                case 1:
                    System.out.println(CliUtils.printMatrix(createFirstArray()));
                    break;
                case 2:
                    System.out.println(CliUtils.printMatrix(createSecondArray()));
                    break;
                case 3:
                    System.out.println(CliUtils.printMatrix(createThirdArray()));
                    break;
                default:
                    System.out.println("Вы ввели неверное число!");
            }
        }
    }

    public static int[][] createFirstArray() {
        int[][] outputArray = new int[7][7];
        int length = outputArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j || i == length - j - 1) {
                    outputArray[i][j] = 1;
                } else {
                    outputArray[i][j] = 0;
                }
            }
        }
        return outputArray;
    }

    public static int[][] createSecondArray() {
        int[][] outputArray = createFirstArray();
        int length = outputArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 3 || j == 3) {
                    outputArray[i][j] = 1;
                }
            }
        }
        return outputArray;
    }

    public static int[][] createThirdArray() {
        int[][] outputArray = new int[7][7];
        int length = outputArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                boolean firstCondition = j < length - i && j >= i;
                boolean secondCondition = j <= i && j >= length - i - 1;
                if (firstCondition || secondCondition) {
                    outputArray[i][j] = 1;
                }
            }
        }
        return outputArray;
    }
}
