package Task6.Ferum.too.Gate.Task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Comparator;

public class Employee {
    private String name;
    private String company;
    private int salary;
    public int age;



    // TODO: конструктор, геттеры и сеттеры

    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);
        Random random = new Random();

        int min = 21;
        int max = 60;
        //int diff = max - min;  60 - 21
        // int age = random.nextInt(60-21 + 1) + min;

        // добавление num объектов Employee в список (employees)
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(names[random.nextInt(names.length - 0) + 0], companies[random.nextInt(companies.length - 0) + 0], random.nextInt(75000 - 45000 + 1) + 45000, random.nextInt(60 - 20 + 1) + 20)); // TODO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп
        }
        return employees;
    }

    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && age == employee.age && name.equals(employee.name) && company.equals(employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, salary, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    static class NameComparator implements Comparator<Employee> {

        // thenComparing
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());

        }

    }

    static class AgeComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return Integer.compare(o1.age, o2.age);
        }
    }

    static class SalaryComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return Integer.compare(o1.age, o2.age);
        }
    }
}









