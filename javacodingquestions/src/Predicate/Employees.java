package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Employees {
    String name;
    int age;
    double salary;
    String department;

    public Employees(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {

        Employees emp1 = new Employees("Satyam", 25, 35000.00, "SALES");
        Employees emp2 = new Employees("Deepanshu", 75, 78900.00, "IT");
        Employees emp3 = new Employees("Ram", 85, 19900.00, "NON-IT");
        Employees emp4 = new Employees("Deepash", 65, 8900.00, "IT");
        Employees emp5 = new Employees("Rakesh", 45, 2500.00, "DB");
        Employees emp6 = new Employees("Shyam", 24, 8900.00, "BPO");

        List<Employees> list = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6);

        Predicate<Employees> p = n -> n.getSalary() > 50000;

        for(Employees a : list)
        {
            if(p.test(a))
            {
                System.out.println(a.getName());
            }
        }

        System.out.println("==============================Filter name whose length > 5");

        Predicate<Employees> p1 = n -> n.getName().length() > 5;
        for(Employees e : list )
        {
            if(p1.test(e))
            {
                System.out.println(e.getName());
            }
        }

    }
}