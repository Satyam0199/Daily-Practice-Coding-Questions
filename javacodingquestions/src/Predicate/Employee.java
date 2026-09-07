package Predicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Employee {
    String name;
    int age;
    double salary;
    String department;

    public Employee(String name, int age, double salary, String department) {
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

        Employee emp1 = new Employee("Satyam Raikwar",25,35000.00,"SALES");
        Employee emp2 = new Employee("Deepanshu Dubey",75,78900.00,"IT");
        Employee emp3 = new Employee("Ram Mahjii",85,19900.00,"NON-IT");
        Employee emp4 = new Employee("Deepash Sen",65,8900.00,"IT");
        Employee emp5 = new Employee("Rakesh Raikwar",45,2500.00,"DB");
        Employee emp6 = new Employee("Shyam Raikwar",24,8900.00,"BPO");

        List<Employee> list = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);

        Predicate<Employee> p = emp-> emp.getSalary() > 50000;

        for (Employee emp : list) {
            if (p.test(emp)) {
                System.out.println(emp.getName());
            }
        }
        System.out.println("=======================Compare Age======================================");

        Predicate<Employee> p1 = emp-> emp.getAge() > 30;

        for (Employee emp : list) {
            if (p1.test(emp)) {
                System.out.println(emp.getName());
            }
        }

        System.out.println("=======================Working IT======================================");

        Predicate<Employee> p3 = emp-> emp.getDepartment().equals("IT");

        for (Employee emp : list) {
            if (p3.test(emp)) {
                System.out.println(emp.getName());
            }
        }

        System.out.println("=======================Start with name S Character ======================================");

        Predicate<Employee> p4 = emp-> emp.getName().startsWith("S");

        for (Employee emp : list) {
            if (p4.test(emp)) {
                System.out.println(emp.getName());
            }
        }

        System.out.println("=======================Salary Between 40k to 80k ======================================");

        Predicate<Employee> p5 = emp-> emp.getSalary()> 40000 && emp.getSalary()< 80000;

        for (Employee emp : list) {
            if (p5.test(emp)) {
                System.out.println(emp.getName());
            }
        }



    }
}
