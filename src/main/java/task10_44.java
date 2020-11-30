package main.java;

import main.java.utile.CliUtils;

public class task10_44 {
    public static void main(String[] args) {
        System.out.println("Введите ниже натуральное число, для которого необходимо посчитать цифровой корень: ");
        Integer inputNumber = CliUtils.writeInteger();
        if (inputNumber != null) {
            System.out.printf("Цифровой корень числа: %d", getNumericRoot(inputNumber));
        }
    }

    public static int getNumericRoot(int inputNumber) {
        if (inputNumber / 10 == 0) {
            return inputNumber;
        }
        return getNumericRoot(task10_43.getSumNumbers(inputNumber));
    }
}
