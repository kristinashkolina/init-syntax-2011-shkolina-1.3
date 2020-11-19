package main.java;

import java.util.Scanner;

public class task1_3 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Вы ввели число: " + number);
        } else {
            System.out.println("Ошибка в вводе числа");
        }
    }
}
