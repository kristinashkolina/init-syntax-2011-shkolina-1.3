package main.java.task6_87;

import main.java.utile.CliUtils;

public final class Game {

    private static final String[] TEAMS = new String[]{"Team1", "Team2"};
    private static Integer[] scores = new Integer[]{0, 0};

    private Game() {
        throw new IllegalStateException("Utility class");
    }

    public static void play(String nameOfFirstTeam, String nameOfSecondTeam) {
        System.out.printf("Добро пожаловать на баскетбольный матч между %s и %s!%n", nameOfFirstTeam, nameOfSecondTeam);
        TEAMS[0] = nameOfFirstTeam;
        TEAMS[1] = nameOfSecondTeam;
        Integer teamNumber = -1;
        while (teamNumber != 0) {
            do {
                System.out.println("Выберите команду введя 1 или 2. Либо введите 0, чтобы завершить игру: ");
                teamNumber = CliUtils.writeInteger();

                if (teamNumber == null || teamNumber > 2 || teamNumber < 0) {
                    System.out.println("Введите разрешенное целочисленное значение!");
                } else if (teamNumber == 0) {
                    break;
                }
            } while (teamNumber == null);
            selectScore(teamNumber);
        }
        System.out.println(result());
    }

    private static void selectScore(Integer teamNumber) {
        do {
            System.out.println("Введите количество очков команды от 1 до 3: ");
            Integer printedScore = CliUtils.writeInteger();
            if (printedScore == null || printedScore < 1 || printedScore > 3) {
                System.out.println("Введите число от 1 до 3!");
            } else {
                System.out.println(score(teamNumber, printedScore));
                break;
            }
        } while (true);
    }

    public static String score(int team, int score) {
        scores[team - 1] += score;
        return String.format("Команда %s зарабатывает для себя %d очка", TEAMS[team - 1], score);
    }

    public static String result() {
        String winner;
        String loser;
        Integer winnerScores;
        Integer loserScores;
        if (scores[0] > scores[1]) {
            winner = TEAMS[0];
            loser = TEAMS[1];
            winnerScores = scores[0];
            loserScores = scores[1];
        } else {
            winner = TEAMS[1];
            loser = TEAMS[0];
            winnerScores = scores[1];
            loserScores = scores[0];
        }
        return String.format("Команда %s победила команду %s, со счетом: %d-%d", winner, loser, winnerScores, loserScores);
    }

    public static void newGame() {
        scores = new Integer[]{0, 0};
    }

}

