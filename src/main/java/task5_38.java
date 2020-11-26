package main.java;

public class task5_38 {
    public static void main(String[] args) {
        double[] resultArray = getKilometers(100);
        System.out.printf("[Общее расстояние, Расстояние до дома]: [%s, %s]%n", resultArray[0], resultArray[1]);
    }

    public static double[] getKilometers(int cycles) {
        double[] resultDouble = new double[2];
        double distanceToHouse = 1;
        double sign = 1;
        double distance;
        double totalDistance = 0;
        for (int i = 2; i <= cycles; i++) {
            sign = -sign;
            distance = sign / i;
            distanceToHouse += distance;
            totalDistance += 1.0 / i;
        }
        resultDouble[0] = distanceToHouse;
        resultDouble[1] = totalDistance;
        return resultDouble;
    }
}
