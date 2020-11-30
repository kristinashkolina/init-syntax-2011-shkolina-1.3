package main.java.task13_12;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private final List<Employee> employees;

    public Database(List<Employee> employeesInput) {
        this.employees = employeesInput;
    }

    public final List<Employee> findEmployees(String fullNameSubstring) {
        ArrayList<Employee> employeesOutput = new ArrayList<>();
        for (var employee : employees) {
            String fullName = String.format("%s %s %s", employee.getName(), employee.getLastName(), employee.getMiddleName());
            if (fullName.equals(fullNameSubstring)) {
                employeesOutput.add(employee);
            }
        }
        return employeesOutput;
    }

    public final List<Employee> findEmployees(int workingYears) {
        ArrayList<Employee> employeesOutput = new ArrayList<>();

        for (var employee : employees) {
            if (employee.getWorkingExperienceOnDate() > workingYears) {
                employeesOutput.add(employee);
            }
        }
        return employeesOutput;
    }

}
