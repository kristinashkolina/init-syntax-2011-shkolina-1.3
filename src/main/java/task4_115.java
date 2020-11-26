package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task4_115 {
    private static final int START_YEAR = 1984;
    private static final String NOT_NATURAL = "Ненатуральное число";

    public static void main(String[] args) {
        System.out.println("Введите любое натуральное число для года: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int printedYear = scanner.nextInt();
            String yearName = getYearName(printedYear);
            System.out.println("Название введенного года: " + yearName);
        } catch (InputMismatchException exception) {
            System.out.println("Необходимо ввести целочисленное значение");
        }
    }

    /**
     * Нахождение имени года по календарю 60-летней циклической системы
     *
     * @param year Любое натуральное число
     * @return Возвращает имя года в формате "{nameOfAnimal}, {colorOfYear}"
     */
    public static String getYearName(int year) {
        if (year < 0) {
            return NOT_NATURAL;
        }
        String yearAnimal = getYearAnimal(year);
        String yearColor = getYearColor(year);
        return String.format("%s, %s", yearAnimal, yearColor);
    }

    /**
     * Нахождение цвета года для любого натурального числа
     *
     * @param year Любое натуральное число
     * @return Возвращает цвет года
     */
    public static String getYearColor(int year) {
        if (year < 0) {
            return NOT_NATURAL;
        }
        final String[] yearColors = new String[]{"Зеленый", "Красный", "Желтый", "Белый", "Черный"};
        int yearsDifference = year - START_YEAR;
        int colorNumber;
        if (yearsDifference < 0) {
            yearsDifference = START_YEAR - year;
            colorNumber = (10 - yearsDifference % 10) / 2;
        } else {
            colorNumber = (yearsDifference % 10) / 2;
        }
        return yearColors[colorNumber];
    }

    /**
     * Нахождение имени животного года для любого натурального числа
     *
     * @param year Любое натуральное число
     * @return Возвращает имя животного года
     */
    public static String getYearAnimal(int year) {
        if (year < 0) {
            return NOT_NATURAL;
        }
        final String[] animalsOfYear = new String[]{"Крыса", "Корова",
                "Тигр", "Заяц", "Дракон", "Змея", "Лошадь", "Овца", "Обезьяна", "Петух", "Собака", "Свинья"};
        int yearsDifference = year - START_YEAR;
        int animalNumber;
        if (yearsDifference < 0) {
            yearsDifference = START_YEAR - year;
            animalNumber = yearsDifference % 12 != 0 ? 12 - (yearsDifference % 12) : 0;
        } else {
            animalNumber = yearsDifference % 12;
        }
        return animalsOfYear[animalNumber];
    }
}
