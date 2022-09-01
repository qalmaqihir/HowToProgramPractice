public class EmployeeStaticMethodsTest {
    public static void main(String[] args) {
        System.out.printf("Employees before instantiation: %d%n", EmployeeStaticMethods.getCount());
        EmployeeStaticMethods e1= new EmployeeStaticMethods("Jawd","Haider");
        EmployeeStaticMethods e2 = new EmployeeStaticMethods("Yasir", "Nawaz");

        System.out.printf("%nEmplyees after instantiation: %n");
        System.out.printf("via e1.getCount(): %d%n",e1.getCount());
        System.out.printf("via e2.getCount(): %d%n",e2.getCount());
        System.out.printf("Empolyee.getCount(): %d%n", EmployeeStaticMethods.getCount());
        System.out.printf("Employee 1: %s %s%nEmployee 2: %s %s%n", e1.getFirstName(),e1.getLasttName(),e2.getFirstName(),e2.getLasttName());
    }
}
