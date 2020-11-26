package main.java.task4_15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task4_15 {
    public static void main(String[] args) {
        try {
            int age;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите свою дату рождения ниже (месяц и год поочередно): ");
            int birthdayMonth = scanner.nextInt();
            int birthdayYear = scanner.nextInt();
            main.java.task4_15.Date birthdayDate = new main.java.task4_15.Date(birthdayMonth, birthdayYear);
            System.out.println("Введите сегодняшнюю дату ниже (месяц и год поочередно): ");
            int todayMonth = scanner.nextInt();
            int todayYear = scanner.nextInt();
            main.java.task4_15.Date todayDate = new main.java.task4_15.Date(todayMonth, todayYear);

            age = getAge(todayDate, birthdayDate);
            System.out.println("Ваш возраст: " + age);
        } catch (main.java.task4_15.Date.WrongDateException exception) {
            System.out.println(exception.getMessage());
        } catch (InputMismatchException exception) {
            System.out.println("Месяц и год должны вводиться в виде целочисленных значений!");
        }

    }

    public static int getAge(Date todayDate, Date birthdayDate) {
        if (todayDate.compareTo(birthdayDate) > 0) {
            return todayDate.compareTo(birthdayDate);
        } else {
            return -1;
        }
    }
}
