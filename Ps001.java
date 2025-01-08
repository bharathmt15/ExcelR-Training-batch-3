class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private String address;

    Employee() {
        this.id = 0;
        this.firstname = "";
        this.lastname = "";
        this.address = "";
    }

    Employee(int id, String firstname, String lastname, String address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
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
    private double hoursworked;
    private double amountPerHour;

    PartTimeEmployee() {
        super();
        this.hoursworked = 0;
        this.amountPerHour = 0;
    }

    PartTimeEmployee(int id, String firstname, String lastname, String address, double hoursworked,
            double amountPerHour) {
        super(id, firstname, lastname, address);
        this.hoursworked = hoursworked;
        this.amountPerHour = amountPerHour;
    }

    public double calculateSalary() {
        return hoursworked * amountPerHour;
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
