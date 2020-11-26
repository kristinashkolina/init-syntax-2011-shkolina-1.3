package main.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class task5_10 {
    public static void main(String[] args) {
        System.out.println("Введите обменный курс ниже: ");
        try {
            Scanner scanner = new Scanner(System.in);
            BigDecimal exchangeRate = BigDecimal.valueOf(scanner.nextDouble());
            List<BigDecimal> usdInRub = getMoneyInDollars(exchangeRate);
            System.out.println("Перевод долларов в рубли от 1 до 20: ");
            printArrayList(usdInRub);
        } catch (InputMismatchException exception) {
            System.out.println("Необходимо ввести вещественное число!");
        }
    }

    public static List<BigDecimal> getMoneyInDollars(BigDecimal moneyExchangeRateInRub) {
        ArrayList<BigDecimal> usdInRub = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            BigDecimal usd = new BigDecimal(i);
            BigDecimal rub = moneyExchangeRateInRub.multiply(usd).setScale(2, RoundingMode.HALF_UP);
            usdInRub.add(rub);
        }
        return usdInRub;
    }

    public static void printArrayList(List<BigDecimal> list) {
        for (var money : list) {
            System.out.printf("%sР%n", money.toString());
        }
    }
}
