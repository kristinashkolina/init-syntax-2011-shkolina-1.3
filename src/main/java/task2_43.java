package main.java;

import java.util.Scanner;

public class task2_43 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println("Введите второе число: ");
            if (sc.hasNextInt()) {
                int b = sc.nextInt();
                int result = (a%b)*(b%a )+ 1;
                if(result==1) {
                    System.out.println(result);
                }
                else {
                    result=2;
                    System.out.println(result);
                }
            } else {
                System.out.println("Ошибка в вводе числа");
            }
        } else {
            System.out.println("Ошибка в вводе числа");
        }
    }
}
