package main.java.task6_87;

import main.java.utile.CliUtils;

public class task6_87 {
    public static void main(String[] args) {
        System.out.println("Введите названия комманд поочередно, чтобы начать игру: ");
        String firstTeam = CliUtils.writeString();
        String secondTeam = CliUtils.writeString();
        if (firstTeam == null || secondTeam == null) {
            System.out.println("Неверно был считан ввод с консоли");
        } else {
            Game.play(firstTeam, secondTeam);
        }
    }
}
