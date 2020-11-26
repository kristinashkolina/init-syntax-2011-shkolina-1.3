package main.java;

import java.util.Scanner;

public class task4_33 {
    public static void main(String[] args) {
        System.out.println("Вваедите число, которое нужно проверить на четность: ");
        Scanner scanner = new Scanner(System.in);
        int printedNumber = scanner.nextInt();
        System.out.println("Является ли число четным: " + checkParityNumber(printedNumber));
    }

    public static boolean checkParityNumber(int naturalNumber) {
        return naturalNumber % 2 == 0;
    }
}
