package main.java;

import main.java.utile.CliUtils;

import java.util.Random;

public class task11_245 {
    public static void main(String[] args) {
        System.out.println("Введите ниже количество генерируемых элементов: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            Random random = new Random();
            int[] inputArray = new int[inputNumber];
            for (int i = 0; i < inputArray.length; i++) {
                inputArray[i] = random.nextInt(20) - 10;
            }
            System.out.println(CliUtils.printArray(CliUtils.intArrayToInteger(inputArray)));
            String outputResult = CliUtils.printArray(CliUtils.intArrayToInteger(createNewArrayOld(inputArray)));
            System.out.printf("Массив с отрицательными элементами в начальной части: %n%s%n", outputResult);
        }
    }

    public static int[] createNewArrayOld(int[] inputArray) {
        int[] outputArray = new int[inputArray.length];
        int inputArrayLength = inputArray.length;
        int j = inputArrayLength - 1;
        int k = 0;
        for (var element : inputArray) {
            if (element < 0) {
                outputArray[k] = element;
                k++;
            } else {
                outputArray[j] = element;
                j--;
            }
        }
        return outputArray;
    }
}
