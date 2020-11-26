package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task5_64 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer[]> districts = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Integer peopleCount = random.nextInt(8) + 1;
            Integer squareArea = random.nextInt(15) + 5;
            districts.add(new Integer[]{peopleCount, squareArea});
            System.out.printf("%d район: %d тыс. человек, %d км. кв.%n", i, peopleCount, squareArea);
        }
        System.out.println(getAveragePopulationDensity(districts));
    }

    public static double getAveragePopulationDensity(List<Integer[]> districts) {
        double averageDensity;
        double sumDensity = 0;
        for (var district : districts) {
            double districtDensity = district[0].doubleValue() / district[1].doubleValue();
            sumDensity += districtDensity;
        }
        averageDensity = sumDensity / districts.size();
        return averageDensity;
    }

}
