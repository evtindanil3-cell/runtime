package Dis.Comparator;

import java.util.ArrayList;

public class testComparator {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Cherry",9,2011));
        movies.add(new Movie("Avenger",6,2000));
        movies.add(new Movie("Super-man",8,2012));
        movies.sort(Movie.movieComparatorRating);
        System.out.println("По рейтингу: " + movies);
        movies.sort(Movie.movieComparatorName);
        System.out.println("По году: " + movies);
        movies.sort(Movie.movieComparatorYear);
        System.out.println("По алфавиту: " + movies);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Данил", 120000, 3));
        employees.add(new Employee("Артем", 110000, 2));
        employees.add(new Employee("Андрей", 90000, 1));
        employees.add(new Employee("Саша", 115000, 7));
        employees.add(new Employee("Вася", 140000, 6));
        System.out.println("первый по опыту");
        expEmployee(employees);
        System.out.println("первый по зарплате");
        salaryEmployee(employees);
        System.out.println("топ 3 работника");
        topThierdEmployee(employees);
    }
    public static void expEmployee(ArrayList<Employee> employees){
        employees.sort(Employee.employeeComparatorExperience);
        System.out.println(employees.getLast());
    }
    public static void salaryEmployee(ArrayList<Employee> employees){
        employees.sort(Employee.employeeComparatorSalary);
        System.out.println(employees.getLast());
    }
    public static void topThierdEmployee(ArrayList<Employee> employees){
        employees.sort(Employee.employeeComparatorTop.reversed());
        for (int i = 0;i<employees.size()-(employees.size()-3);i++){
            System.out.println(employees.get(i));
        }

    }
}

