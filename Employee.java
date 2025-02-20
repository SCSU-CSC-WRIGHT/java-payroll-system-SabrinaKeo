public class Employee {
    // Variables (attributes)
    private String name;
    private int employeeId;
    private String department;
    private double hourlyWage;
    private double hoursWorked;
    private String toString;

    // Constructor method
    public Employee(String name, int employeeId, String department, double hourlyWage, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Getter method for Employee attributes
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // Setter methods for Employee attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Calculating weekly salary
    public double calculateWeeklySalary() {
        return hourlyWage * hoursWorked;
    }

    //Override
    public String toString(){
        return "Employee Name: " + name + "\n" +
                "Employee ID: " + employeeId + "\n" +
                "Department: " + department + "\n" +
                "Hourly Wage: " + hourlyWage + "\n" +
                "Hours Worked: " + hoursWorked + "\n";
    }

    public static void main(String[] args) {
        // Create an employee
        Employee employee = new Employee("Jacob Michaelson", 12345987, "Infrastructure", 50.0, 40.0);

        // Calculate weekly salary
        double weeklySalary = employee.calculateWeeklySalary();

        // Print the result
        System.out.println("The weekly salary for " + employee.getName() + " is $" + weeklySalary + "\n");

        //Returns employee information as string
        System.out.println(employee.toString());

    }
}



