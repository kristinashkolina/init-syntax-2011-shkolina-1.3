package main.java;

import java.util.Scanner;

public class task2_31 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 999>N>100: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n > 100 && n < 999) {
                int a = n / 100;
                int c = (n / 10) % 10;
                int b = n % 10;
                int x = 100 * a + 10 * b + c;
                System.out.println("X: " + x);
            }
        }
    }
}
