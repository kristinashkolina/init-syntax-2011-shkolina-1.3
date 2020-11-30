package main.java.task13_12;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Employee {

    private final String lastName;
    private final String name;
    private final String middleName;
    private final String address;
    private final int month;
    private final int year;

    public Employee(String lastName, String name, String address, int month, int year) {
        this(lastName, name, "", address, month, year);
    }

    public Employee(String lastName, String name, String middleName, String address, int month, int year) {
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.month = month;
        this.year = year;
    }

    public final int getWorkingExperienceOnDate() {
        LocalDate todayDate = LocalDate.now();
        LocalDate hireDate = LocalDate.of(year, month, 1);
        Period period = Period.between(hireDate, todayDate);
        return period.getYears();
    }

    public final int getYear() {
        return year;
    }

    public final String getLastName() {
        return lastName;
    }

    public final int getMonth() {
        return month;
    }

    public final String getMiddleName() {
        return middleName;
    }

    public final String getName() {
        return name;
    }

    public final String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return month == employee.month &&
                year == employee.year &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(middleName, employee.middleName) &&
                Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, name, middleName, address, month, year);
    }

}
