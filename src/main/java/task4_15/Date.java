package main.java.task4_15;

import java.util.Objects;

public class Date implements Comparable<Date> {

    private final int month;
    private final int year;

    public Date(int month, int year) throws WrongDateException {
        if (month > 12 || month < 1) {
            throw new WrongDateException("Неправильно введён месяц!");
        } else {
            this.month = month;
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Date date) {
        int g = -1;
        if (this.getMonth() - date.getMonth() >= 0) {
            g = 0;
        }
        return this.getYear() - date.getYear() + g;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Date date = (Date) o;
        return month == date.month &&
                year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, year);
    }

    public static class WrongDateException extends Exception {
        public WrongDateException(String msg) {
            super(msg);
        }
    }

}