class Employee {
    private String firstname;
    private String lastname;

    Employee() {
        this.firstname = "";
        this.lastname = "";
    }

    Employee(int id, String firstname, String lastname, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double amountPerHour;

    PartTimeEmployee() {
        super();
        this.hoursWorked = 0;
        this.amountPerHour = 0;
    }

    PartTimeEmployee(int id, String firstname, String lastname, String address, double hoursWorked,
            double amountPerHour) {
        super(id, firstname, lastname, address);
        this.hoursWorked = hoursWorked;
        this.amountPerHour = amountPerHour;
    }

    public double calculateSalary() {
        return hoursWorked * amountPerHour;
    }
}

public class Ps001 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setFirstname("John");
        emp.setLastname("Doe");
        System.out.println("Full Name: " + emp.getFullName());

        PartTimeEmployee partTimeEmp = new PartTimeEmployee(1, "Jane", "Smith", "123 Main St", 20, 15);
        System.out.println("Part-Time Employee Salary: " + partTimeEmp.calculateSalary());
    }
}
