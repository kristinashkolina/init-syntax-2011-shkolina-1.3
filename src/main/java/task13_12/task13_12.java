package main.java.task13_12;

import main.java.utile.CliUtils;

import java.util.ArrayList;
import java.util.List;

public class task13_12 {
    public static void main(String[] args) {
        System.out.println("Введите 4 сотрудника для добавления в базу данных.");
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Вводите поочередно: ");
            Integer month = CliUtils.writeInteger();
            Integer year = CliUtils.writeInteger();
            if (month != null && year != null) {
                String name = CliUtils.writeString();
                String lastName = CliUtils.writeString();
                String middleName = CliUtils.writeString();
                String address = CliUtils.writeString();
                Employee employee = new Employee(name, lastName, middleName, address, month, year);
                employees.add(employee);
            }
        }
        Database database = new Database(employees);
        List<Employee> employeesOutput = database.findEmployees(3);
        for (var employee : employeesOutput) {
            System.out.println(employee);
        }
    }
}
