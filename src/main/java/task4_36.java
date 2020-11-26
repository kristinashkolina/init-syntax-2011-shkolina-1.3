package main.java;

import java.util.Scanner;

public class task4_36 {
    public static void main(String[] args) {
        System.out.println("Введите количество минут прошедшее от начала часа: ");
        Scanner scanner = new Scanner(System.in);
        int countOfMinutes = scanner.nextInt();
        String resultString = getTrafficLightColor(countOfMinutes);
        System.out.println("Цвет светофора: " + resultString);
    }

    public static String getTrafficLightColor(int minutes) {
        int countMinutes = minutes % 5;
        if (countMinutes < 3) {
            return "зеленый";
        } else {
            return "красный";
        }
    }
}
