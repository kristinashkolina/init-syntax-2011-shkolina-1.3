package main.java;

import java.util.Scanner;

public class task2_13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 200>N>100: ");
        if (sc.hasNextInt()) {
            int n=sc.nextInt();
            if(n>100&&n<200) {
                System.out.println("Результат: "+new StringBuffer(String.valueOf(n)).reverse());
            }
            else {
                System.out.println("Проверьте правильность ввода");
            }
        }
    }
}
