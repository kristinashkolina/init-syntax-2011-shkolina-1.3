package main.java;

import java.util.Scanner;
import java.lang.*;

public class task1_17 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число X: ");

        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            System.out.println("Введите число A: ");
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                System.out.println("Введите число B: ");
                if (sc.hasNextInt()) {
                    int b = sc.nextInt();
                    System.out.println("Введите число C: ");
                    if (sc.hasNextInt()) {
                        int c = sc.nextInt();
                        System.out.println("Уравнение 1: " + equation(x));
                        System.out.println("Уравнение 2: " + equation1(x, a, b, c));
                        System.out.println("Уравнение 3: " + equation2(x));
                    }
                }
            } else {
                System.out.println("Ошибка в вводе числа");
            }
        } else {
            System.out.println("Ошибка в вводе числа");
        }
    }

    public static double equation (int x) {
        return Math.sqrt(1-Math.pow(Math.sin(x), 2));
    }

    public static double equation1 (int x, int a, int b, int c) {
        return 1/Math.sqrt(a*Math.pow(x,2)+b*x+c);
    }

    public static double equation2 (int x) {
        return Math.abs(x)+Math.abs(x+1);
    }
}