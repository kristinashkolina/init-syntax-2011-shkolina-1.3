package main.java;

import main.java.utile.CliUtils;

import java.util.Random;

public class task11_158 {
    public static void main(String[] args) {
        System.out.println("Введите ниже количество генерируемых элементов: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            Random random = new Random();
            int[] inputArray = new int[inputNumber];
            for (int i = 0; i < inputArray.length; i++) {
                inputArray[i] = random.nextInt(5) + 1;
            }
            System.out.println(CliUtils.printArray(CliUtils.intArrayToInteger(inputArray)));
            String outputResult = CliUtils.printArray(CliUtils.intArrayToInteger(removeNotUniqueElements(inputArray)));
            System.out.printf("Массив с удаленными неуникальными элементами: %n%s%n", outputResult);
        }
    }

    public static int[] removeNotUniqueElements(int[] inputArray) {
        int[] outputArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    outputArray = deleteElementArray(inputArray, j);
                }
            }
        }
        return outputArray;
    }

    public static int[] deleteElementArray(int[] inputArray, int elementNumber) {
        if (elementNumber != inputArray.length - 1) {
            int[] tempArray = new int[inputArray.length - elementNumber - 1];
            System.arraycopy(inputArray, elementNumber + 1, tempArray, 0, tempArray.length);
            System.arraycopy(tempArray, 0, inputArray, elementNumber, tempArray.length);
        }
        inputArray[inputArray.length - 1] = 0;
        return inputArray;
    }
}
