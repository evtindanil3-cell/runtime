package Dis.Comparator;

import java.util.Comparator;

public class Employee {
    String name;
    int salary;
    int experience;

    public Employee(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }
    public static Comparator<Employee> employeeComparatorTop = Comparator
            .comparingInt(Employee::getExperience)
            .thenComparingInt(Employee::getSalary)
            .thenComparing(Employee::getName);
    public static Comparator<Employee> employeeComparatorSalary = Comparator.comparingInt(Employee::getSalary);
    public static Comparator<Employee> employeeComparatorExperience = Comparator.comparingInt(Employee::getExperience);

    @Override
    public String toString() {
        return "Comparator.Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
