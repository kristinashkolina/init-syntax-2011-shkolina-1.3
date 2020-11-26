package main.java;

import java.util.Scanner;

public class task3_29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.println("Если условие верно, то будет возвращено true.");
        System.out.println("Введите два числа для проверки условия: каждое из чисел x и y нечетное");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(checkFirstCondition(x, y));
        System.out.println("Введите два числа для проверки условия: только одно из чисел x и y меньше 20");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(checkSecondCondition(x, y));
        System.out.println("Введите два числа для проверки условия: хотя бы одно из чисел x и y равно нулю");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(checkThirdCondition(x, y));
        System.out.println("Введите три числа для проверки условия: каждое из чисел x, y, z отрицательное");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        System.out.println(checkFourthCondition(x, y, z));
        System.out.println("Введите три числа для проверки условия: только одно из чисел x, y и z кратно пяти");
        x = scanner.nextInt();
        z = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(checkFifthCondition(x, y, z));
        System.out.println("Введите три числа для проверки условия: хотя бы одно из чисел x, y, z больше 100");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        System.out.println(checkSixthCondition(x, y, z));
    }

    /**
     * @param x первое число
     * @param y второе число
     * @return Возвращает true, если каждое из чисел x и y нечетное
     */
    public static boolean checkFirstCondition(int x, int y) {
        return x % 2 != 0 && y % 2 != 0;
    }

    /**
     * @param x первое число
     * @param y второе число
     * @return Возвращает true, если только одно из чисел x и y меньше 20
     */
    public static boolean checkSecondCondition(int x, int y) {
        return x < 20 ^ y < 20;
    }

    /**
     * @param x первое число
     * @param y второе число
     * @return Возвращает true, если хотя бы одно из чисел x и y равно нулю
     */
    public static boolean checkThirdCondition(int x, int y) {
        return x == 0 || y == 0;
    }

    /**
     * @param x первое число
     * @param y второе число
     * @param z третье число
     * @return Возвращает true, если каждое из чисел x, y, z отрицательное
     */
    public static boolean checkFourthCondition(int x, int y, int z) {
        return x < 0 && y < 0 && z < 0;
    }

    /**
     * @param x первое число
     * @param y второе число
     * @param z третье число
     * @return Возвращает true, если только одно из чисел x, y и z кратно пяти
     */
    public static boolean checkFifthCondition(int x, int y, int z) {
        boolean a = x % 5 == 0;
        boolean b = y % 5 == 0;
        boolean c = z % 5 == 0;
        boolean conditionFirst = a ^ b ^ c;
        boolean conditionSecond = !(a && b && c);
        return conditionFirst && conditionSecond;
    }

    /**
     * @param x первое число
     * @param y второе число
     * @param z третье число
     * @return Возвращает true, если хотя бы одно из чисел x, y, z больше 100
     */
    public static boolean checkSixthCondition(int x, int y, int z) {
        return x > 100 || y > 100 || z > 100;
    }

}
