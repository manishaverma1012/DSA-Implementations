package stream;

import java.util.*;
import java.util.stream.Collectors;

//List of employees
//3 fields id, name, dept
// List of employee belong into IT dept

class Employee {
    private int id;
    private String name;
    private String dept;

    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public String getDept() { return dept; }
}

public class StreamAPI {
        public static void main(String[] args) {
            List<Employee> emp = Arrays.asList(
                    new Employee(1, "Alice", "IT"),
                    new Employee(2, "Bob", "HR"),
                    new Employee(3, "Charlie", "Finance"),
                    new Employee(4, "David", "IT"),
                    new Employee(5, "Eve", "Sales"),
                    new Employee(6, "Frank", "HR"),
                    new Employee(7, "Grace", "IT")
            );
            // emp is object of Employee with all the fields
            List<Employee> filteredEmployee = emp.stream().filter(e -> "IT".equalsIgnoreCase(e.getDept())).collect(Collectors.toList());

            int count = (int) emp.stream().filter(e -> "IT".equalsIgnoreCase(e.getDept())).count();

            Map<String, Long> countPerDept = emp.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

            countPerDept.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

            System.out.println(countPerDept);

        }


    }



