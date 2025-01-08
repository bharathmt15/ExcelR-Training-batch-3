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

    class PartTimeEmployee extends Employee {
        private double hoursworked;
        private double amountPerHour;

    PartTimeEmployee(){
        public PartTimeEmployee(int id , String firstname , String lastname , String address){
        super(id,firstname,lastname,address);
        this.hoursworked = 0;
        this.amountPerHour = 0;
}
}
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setFirstname("John");
        emp.setLastname("Doe");
        System.out.println("Full Name: " + emp.getFullName());
    }
}
