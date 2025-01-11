import java.uitl.*;
import java.util.Scanner;

class Ps005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee name: ");
        String name = sc.next();
        System.out.println("enter emplyee id: ");
        int id = sc.nextInt();
        System.out.println("enter employee salary");
        double salary = sc.nextLong();

    }
}

public int addemployee(int id, String name, double salary) {
    if (id == true && name == true && salary == true) {
        System.out.println("employee added ");
        return 0;
    }
}

class Employee {
    int id;
    String name;
    double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
                + "]";
    }
}
