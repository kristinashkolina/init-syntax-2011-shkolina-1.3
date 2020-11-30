package com.getjavajob.training.kucherenkon.init.syntax.solution.util;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public final class CliUtils {

    private CliUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static Integer writeInteger() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException exception) {
            return null;
        }
    }

    public static Double writeDouble() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException exception) {
            return null;
        }
    }

    public static String writeString() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        } catch (InputMismatchException exception) {
            return null;
        }
    }

    public static String printArray(Object[] array) {
        StringBuilder resultString = new StringBuilder();
        resultString.append('[');
        for (int i = 0; i < array.length; i++) {
            resultString.append(String.format("%3s", array[i].toString()));
            if (i != array.length - 1) {
                resultString.append(", ");
            }
        }
        resultString.append(']');
        return resultString.toString();
    }

    public static Integer[] intArrayToInteger(int[] array) {
        Integer[] arrayOutput = new Integer[array.length];
        System.arraycopy(array, 0, arrayOutput, 0, array.length);
        return arrayOutput;
    }

    public static Double[] doubleArrayToInteger(double[] array) {
        Double[] arrayOutput = new Double[array.length];
        System.arraycopy(array, 0, arrayOutput, 0, array.length);
        return arrayOutput;
    }

    public static int[] arrayListIntegerToArrayInt(List<Integer> array) {
        int[] arrayOutput = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            arrayOutput[i] = array.get(i);
        }
        return arrayOutput;
    }


    public static String printMatrix(int[][] inputArray) {
        StringBuilder resultString = new StringBuilder("\n");
        for (var element : inputArray) {
            resultString.append(printArray(intArrayToInteger(element)));
            resultString.append("\n");
        }
        return resultString.toString();
    }

}
