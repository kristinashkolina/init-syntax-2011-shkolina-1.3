package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task4_67 {
    public static void main(String[] args) {
        System.out.println("Введите номер дня года: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int dayNumber = scanner.nextInt();
            String weekName = getWeekName(dayNumber);
            System.out.println("Этот день: " + weekName);
        } catch (InputMismatchException exception) {
            System.out.println("Нужно вводить целочисленный значения!");
        }
    }

    public static String getWeekName(int dayNumber) {
        String weekName;
        int dayWeekNumber = dayNumber % 7;
        if (dayWeekNumber % 6 == 0) {
            weekName = "Weekend";
        } else {
            weekName = "Workday";
        }
        return weekName;
    }
}
