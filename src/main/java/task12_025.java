package main.java;

import main.java.utile.CliUtils;

public class task12_025 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массивов: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            System.out.println(CliUtils.printMatrix(createFirstArray(inputNumber)));
            System.out.println(CliUtils.printMatrix(createSecondArray(inputNumber)));
            System.out.println(CliUtils.printMatrix(createThirdArray(inputNumber)));
            System.out.println(CliUtils.printMatrix(createFourthArray(inputNumber)));
            System.out.println(CliUtils.printMatrix(createFifthArray(inputNumber)));
            System.out.println(CliUtils.printMatrix(createSixthArray(inputNumber)));
            System.out.println(CliUtils.printMatrix(createSeventhArray(inputNumber)));
            System.out.println(CliUtils.printMatrix(createEighthArray(inputNumber)));
            System.out.println(CliUtils.printMatrix(createNinthArray(inputNumber)));
            System.out.println(CliUtils.printMatrix(createTenthArray(inputNumber)));
        }
    }

    public static int[][] createFirstArray(int length) {
        int[][] outputArray = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                outputArray[i][j] = j + i * length + 1;
            }
        }
        return outputArray;
    }

    public static int[][] createSecondArray(int length) {
        int[][] outputArray = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                outputArray[i][j] = i + j * length + 1;
            }
        }
        return outputArray;
    }

    public static int[][] createThirdArray(int length) {
        int[][] outputArray = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                outputArray[i][j] = length - j + i * length;
            }
        }
        return outputArray;
    }

    public static int[][] createFourthArray(int length) {
        int[][] outputArray = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                outputArray[i][j] = length - i + j * length;
            }
        }
        return outputArray;
    }


    public static int[][] createFifthArray(int length) {
        int[][] outputArray = new int[length][length];
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < length; j++) {
                    outputArray[i][length - j - 1] = j + i * length + 1;
                }
            } else {
                for (int j = 0; j < length; j++) {
                    outputArray[i][j] = j + i * length + 1;
                }
            }
        }
        return outputArray;
    }

    public static int[][] createSixthArray(int length) {
        int[][] outputArray = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j % 2 != 0) {
                    outputArray[length - i - 1][j] = i + j * length + 1;
                } else {
                    outputArray[i][j] = i + j * length + 1;
                }
            }
        }
        return outputArray;
    }

    public static int[][] createSeventhArray(int length) {
        int[][] outputArray = new int[length][length];
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < length; j++) {
                outputArray[length - i - 1][j] = length - j + i * length;
            }
        }
        return outputArray;
    }

    public static int[][] createNinthArray(int length) {
        int[][] outputArray = new int[length][length];
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < length; j++) {
                outputArray[length - i - 1][j] = j + i * length + 1;
            }
        }
        return outputArray;
    }


    public static int[][] createEighthArray(int length) {
        int[][] outputArray = new int[length][length];
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < length; j++) {
                outputArray[i][length - j - 1] = i + j * length + 1;
            }
        }
        return outputArray;
    }

    public static int[][] createTenthArray(int length) {
        int[][] outputArray = new int[length][length];
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < length; j++) {
                outputArray[i][length - j - 1] = length - i + j * 10;
            }
        }
        return outputArray;
    }

}
