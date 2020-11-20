package main.java;

import java.util.Scanner;

public class task2_39 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите h часов: ");
        if (sc.hasNextInt()) {
            int h = sc.nextInt();
            System.out.println("Введите m минут: ");
            if (sc.hasNextInt()) {
                int m = sc.nextInt();
                System.out.println("Введите s секунд: ");
                if (sc.hasNextInt()) {
                    int s = sc.nextInt();
                    h %= 12;
                    m %= 60;
                    s %= 60;
                    double result=30*h + 0.5*m + 30.0/3600*s;
                    System.out.println("Результат: "+result+" градусов");
                }
            } else {
                System.out.println("Ошибка в вводе числа");
            }
        } else {
            System.out.println("Ошибка в вводе числа");
        }
    }
}
