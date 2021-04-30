package Task6.Ferum.too.Gate.Task8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class EmployeeTask {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employeeGenerator(20);
        // Дописать метод employeeGenerator и
        // отсортировать его по:
        // имени
        // имени и зарплате
        // имени, зарплате, возрасту и компании
      //  System.out.println(employees);
        Comparator<Employee> comparator = new Employee.NameComparator();
        Comparator<Employee> comparatoAge = new Employee.AgeComparator();

        TreeSet<Employee> employees1Tree = new TreeSet<>(comparator.thenComparing(comparatoAge));
        employees1Tree.addAll(employees);  // добавление всех элементов List в TreeSet
        System.out.println(employees1Tree);

        // TreeSet без компаратора не работает


    }

}



