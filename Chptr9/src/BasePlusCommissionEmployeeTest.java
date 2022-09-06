public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Jawad","Haider", "2323-9053-44-19",500, 0.4,300);
        System.out.printf("Employee information obtained by get methods: %n");
        System.out.printf("%s %s%n", "first Name: ", employee.getFirstName());
        System.out.printf("%s %s%n", "last Name: ", employee.getLastName());
        System.out.printf("%s %s%n", "Social Security No.: ", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n","Gross sale ", employee.getGrossSales());
        System.out.printf("%s %.2f%n","Commission Rate ",employee.getCommissionRate());
        System.out.printf("%s %.2f%n","Base salary ", employee.getBaseSlary());

        employee.setBaseSlary(70000);
        System.out.printf("%n%s: %n%n%s%n","Updated empolyee information obtained by toString() after setting Base Salary to 70000", employee.toString());

    }

}
