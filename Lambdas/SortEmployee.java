import java.util.*;

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class SortEmployee {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Tanvi", 22));
        list.add(new Employee("Rahul", 25));
        list.add(new Employee("Sam", 20));
        list.add(new Employee("Sam", 23));
        list.add(new Employee("Dom", 21));

        list.sort((e1, e2) -> {
            int nameComp = e1.name.compareTo(e2.name);

            if (nameComp != 0) {
                return nameComp;
            }

            return Integer.compare(e2.age, e1.age);
        });

        System.out.println("Sorted Employees:");

        for (Employee e : list) {
            e.display();
        }
    }
}