package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task4_106 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int printedMonth = scanner.nextInt();
            String resultString = getSeason(printedMonth);
            System.out.println("Время года: " + resultString);
        } catch (InputMismatchException exception) {
            System.out.println("Необходимо вводить целочисленные значения!");
        }
    }

    public static String getSeason(int month) {
        if (month < 1 || month > 12) {
            return "Неправильно введён месяц";
        }
        String season;
        int numberOfSeason = month / 3 == 4 ? 0 : month / 3;
        switch (numberOfSeason) {
            case 0:
                season = "Зима";
                break;
            case 1:
                season = "Весна";
                break;
            case 2:
                season = "Лето";
                break;
            case 3:
                season = "Осень";
                break;
            default:
                season = "Ошибка";
        }
        return season;
    }
}
