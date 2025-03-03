public class PayrollSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jacob Michaelson", 12345987, "Infrastructure", 50.0, 40.0);
        Employee emp2 = new Employee("Sarah Connor", 11223344, "Development", 45.0, 38.0);
        Employee emp3 = new Employee("John Doe", 99887766, "Engineering", 30.0, 42.0);

        // Display employee details
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
    }
}

